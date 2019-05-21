package codgen;

import Data_Type.Data_Type;

import java.io.*;
import java.util.Objects;

import static codgen.Query.OUTPUT_DELIMITER;
import static codgen.Query.REDUCE_PATH;
import static codgen.Query.TEMP_PATH;

public class Join {

    public static void join(String table, String joinTable, String tableAttribute, String joinTableAttribute, String joinStatus) throws IOException {
        String firstTable = "";
        String secondTable = "";

        switch (joinStatus) {
            case "left":
            case "inner":
                firstTable = table;
                secondTable = joinTable;
                break;
            case "right":
                firstTable = joinTable;
                secondTable = table;
                break;
        }

        String firstTablePath = Data_Type.getHDFSPath(firstTable);
        String secondTablePath = Data_Type.getHDFSPath(secondTable);

        String firstTableDelimiter = Data_Type.getDelimiter(table);
        String secondTableDelimiter = Data_Type.getDelimiter(joinTable);
        String resultPath = TEMP_PATH + REDUCE_PATH + "/joinResult.csv";


        int firstTableAttributeIndex = getTableAttributeIndex(firstTablePath, tableAttribute, firstTableDelimiter);
        int secondTableAttributeIndex = getTableAttributeIndex(secondTablePath, joinTableAttribute, secondTableDelimiter);

        int secondTableLineLength = getLineLength(secondTablePath, secondTableDelimiter);

        BufferedWriter resultFileBuffer = new BufferedWriter(new FileWriter(resultPath));
        writeResultTableHead(firstTable, secondTable, secondTableAttributeIndex, resultFileBuffer);

        File firstTableHDFS = new File(firstTablePath);
        File secondTableHDFS = new File(secondTablePath);

        BufferedReader firstTableBuffer;
        BufferedReader secondTableBuffer;
        String joinKey = "";
        String joinVal = "";
        boolean matched;


        for (File firstTableFile : Objects.requireNonNull(firstTableHDFS.listFiles())) {
            firstTableBuffer = new BufferedReader(new FileReader(firstTableFile));

            // skip the head line
            firstTableBuffer.readLine();

            String firstTableLine;
            while ((firstTableLine = firstTableBuffer.readLine()) != null) {
                matched = false;
                joinKey = getCol(firstTableLine, firstTableAttributeIndex, firstTableDelimiter);

                for (File secondTableFile : Objects.requireNonNull(secondTableHDFS.listFiles())) {
                    secondTableBuffer = new BufferedReader(new FileReader(secondTableFile));

                    //skip the head line
                    secondTableBuffer.readLine();

                    String secondTableLine;
                    while ((secondTableLine = secondTableBuffer.readLine()) != null) {
                        joinVal = getCol(secondTableLine, secondTableAttributeIndex, secondTableDelimiter);
                        if (joinKey.equals(joinVal)) {
                            matched = true;
                            joinLines(firstTableLine.replace(firstTableDelimiter, OUTPUT_DELIMITER), secondTableLine, secondTableAttributeIndex, secondTableDelimiter, resultFileBuffer);
                        }
                    }
                    secondTableBuffer.close();
                }
                if (!joinStatus.equals("inner") && !matched)
                    writeOuterLine(firstTableLine, secondTableLineLength, firstTableDelimiter, resultFileBuffer);
                resultFileBuffer.flush();
            }
            firstTableBuffer.close();
        }

        resultFileBuffer.close();

    }

    private static void writeOuterLine(String firstTableLine, int secondTableLineLength, String firstTableDelimiter, BufferedWriter bufferedWriter) throws IOException {
        secondTableLineLength--;
        bufferedWriter.append(firstTableLine.replace(firstTableDelimiter, OUTPUT_DELIMITER));

        // for the null values
        for (int i = 0; i < secondTableLineLength; i++)
            bufferedWriter.append(",");

        bufferedWriter.append("\n");

    }

    private static int getLineLength(String tablePath, String secondTableDelimiter) throws IOException {
        File HDFSDir = new File(tablePath);

        //first file in the HDFS path
        BufferedReader bufferedReader = new BufferedReader(new FileReader(Objects.requireNonNull(HDFSDir.listFiles())[0]));

        bufferedReader.readLine();
        String line = bufferedReader.readLine();
        return (line.length() - line.replace(secondTableDelimiter, "").length()) + 1;
    }

    private static void joinLines(String firstTableLine, String secondTableLine, int secondTableAttributeIndex, String secondTableDelimiter, BufferedWriter resultFileBuffer) throws IOException {
        secondTableLine = rmAttribute(secondTableLine, secondTableDelimiter, secondTableAttributeIndex);

        resultFileBuffer.append(firstTableLine).append(OUTPUT_DELIMITER)
                .append(secondTableLine.replace(secondTableDelimiter, OUTPUT_DELIMITER)).append("\n");
    }

    private static String rmAttribute(String line, String delimiter, int rmIndex) {
        if (rmIndex == 0) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == delimiter.charAt(0)) {
                    line = line.substring(i + 1);
                    break;
                }
            }
        } else {
            int index = 0;
            int begin = 0;
            int end = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == delimiter.charAt(0)) {
                    index++;
                    if (index == rmIndex)
                        begin = i;
                    if (index > rmIndex) {
                        end = i;
                        break;
                    }
                }
            }

            if (begin < end)
                line = line.substring(0, begin) + line.substring(end);
            else
                line = line.substring(0, begin);
        }

        return line;
    }

    private static void writeResultTableHead(String firstTable, String secondTable, int secondTableAttributeIndex, BufferedWriter resultFileBuffer) throws IOException {
        String firstTableHead = getHeadLine(firstTable);
        String secondTableHead = getHeadLine(secondTable);
        rmAttribute(secondTableHead, Data_Type.getDelimiter(secondTable), secondTableAttributeIndex);

        resultFileBuffer.append(firstTableHead).append(OUTPUT_DELIMITER).append(secondTableHead).append("\n");

    }

    private static String getHeadLine(String table) throws IOException {
        return new BufferedReader(new FileReader(Objects.requireNonNull(new File(table).listFiles())[0])).readLine();
    }

    private static String getCol(String line, int colIndex, String delimiter) {
        //get the charIndex of the colIndex
        int currentIndex = 0;
        int beginIndex;
        for(beginIndex=0; beginIndex<line.length(); beginIndex++){
            if(currentIndex == colIndex )
                break;
            if(line.charAt(beginIndex) == delimiter.charAt(0))
                currentIndex++;
        }
        int endChar;
        for(endChar=beginIndex; endChar<line.length(); endChar++){
            if(line.charAt(endChar) == delimiter.charAt(0)) {
                endChar -=1;
                break;
            }
        }

        return line.substring(beginIndex, endChar);
    }

    private static int getTableAttributeIndex(String table, String tableAttribute, String delimiter) throws IOException {
        String headLine = getHeadLine(table);
        int index = 0 ;
        int begin=0;
        int end=0;
        for(int i=0; i<headLine.length(); i++) {
            if(headLine.charAt(i) == delimiter.charAt(0)){
                end = i;
                if(tableAttribute.equals(headLine.substring(begin, end)))
                    break;
                else {
                    index++;
                    begin = i+1;
                }
            }
        }
        return index;
    }
}

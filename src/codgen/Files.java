package codgen;

import Data_Type.Data_Type;

import java.io.*;
import java.util.Objects;

import static codgen.Query.OUTPUT_DELIMITER;

public class Files {
    public static int getTableAttributeIndex(String table, String tableAttribute, String delimiter) throws IOException {
        String headLine = getHeadLine(table);
        int index = 0;
        int begin = 0;
        int end = 0;
        for (int i = 0; i < headLine.length(); i++) {
            if (headLine.charAt(i) == delimiter.charAt(0)) {
                end = i;
                if (tableAttribute.equals(headLine.substring(begin, end)))
                    break;
                else {
                    index++;
                    begin = i + 1;
                }
            }
        }
        return index;
    }

    private static String getHeadLine(String table) throws IOException {
        String HDFSPath = Data_Type.getHDFSPath(table);
        File firstFile = Objects.requireNonNull(new File(HDFSPath).listFiles())[0];
        return new BufferedReader(new FileReader(firstFile)).readLine();
    }

    public static void writeResultTableHead(String firstTable, String secondTable, int secondTableAttributeIndex, BufferedWriter resultFileBuffer) throws IOException {
        String firstTableHead = getHeadLine(firstTable).replace(Data_Type.getDelimiter(firstTable),OUTPUT_DELIMITER);
        String secondTableHead = getHeadLine(secondTable).replace(Data_Type.getDelimiter(secondTable),OUTPUT_DELIMITER);
        secondTableHead = rmAttribute(secondTableHead,OUTPUT_DELIMITER, secondTableAttributeIndex);

        resultFileBuffer.append(firstTableHead).append(OUTPUT_DELIMITER).append(secondTableHead).append("\n");

    }

    public static String getCol(String line, int colIndex, String delimiter) {
        //get the charIndex of the colIndex
        int currentIndex = 0;
        int beginIndex = 0;
        for (beginIndex = 0; beginIndex < line.length(); beginIndex++) {
            if (currentIndex == colIndex)
                break;
            if (line.charAt(beginIndex) == delimiter.charAt(0))
                currentIndex++;


        }
        int endChar;
        for (endChar = beginIndex; endChar < line.length(); endChar++) {
            if (line.charAt(endChar) == delimiter.charAt(0))
                break;
        }

        return line.substring(beginIndex, endChar);
    }

    public static String rmAttribute(String line, String delimiter, int rmIndex) {
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

    public static int getLineLength(String tablePath, String secondTableDelimiter) throws IOException {
        File HDFSDir = new File(tablePath);

        //first file in the HDFS path
        BufferedReader bufferedReader = new BufferedReader(new FileReader(Objects.requireNonNull(HDFSDir.listFiles())[0]));

        bufferedReader.readLine();
        String line = bufferedReader.readLine();
        return (line.length() - line.replace(secondTableDelimiter, "").length()) + 1;
    }
}

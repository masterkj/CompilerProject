package codgen;

import Data_Type.Data_Type;

import java.io.*;
import java.util.Objects;

import static codgen.Files.*;
import static codgen.Query.*;

public class Join {

    public static void join(String table, String joinTable, String tableAttribute, String joinTableAttribute, String joinStatus) throws IOException {
        if(Query.EXPLAIN_PLAN) {
            System.out.println("---------- JOIN phase ----------");
            System.out.println(joinStatus+" "+table+ " on "+joinTable+ " on attribute: "+tableAttribute);
        }
        String firstTable = "";
        String secondTable = "";
        String firstTableAttribute = null;
        String secondTableAttribute = null;
        if(joinStatus.equals("join"))
            joinStatus = "innerjoin";

        switch (joinStatus) {
            case "leftjoin":
            case "innerjoin":
                firstTable = table;
                secondTable = joinTable;
                firstTableAttribute = tableAttribute;
                secondTableAttribute = joinTableAttribute;
                break;
            case "rightjoin":
                firstTable = joinTable;
                secondTable = table;
                firstTableAttribute = joinTableAttribute;
                secondTableAttribute = firstTableAttribute;
                break;
        }

        String firstTablePath = Data_Type.getHDFSPath(firstTable);
        String secondTablePath = Data_Type.getHDFSPath(secondTable);

        String firstTableDelimiter = Data_Type.getDelimiter(firstTable);
        String secondTableDelimiter = Data_Type.getDelimiter(secondTable);
        String resultPath = TEMP_PATH + JOIN_PATH + "/main.csv";
        Mapper.createDire(TEMP_PATH + JOIN_PATH);


        int firstTableAttributeIndex = getTableAttributeIndex(firstTable, firstTableAttribute, firstTableDelimiter);
        int secondTableAttributeIndex = getTableAttributeIndex(secondTable, secondTableAttribute, secondTableDelimiter);

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
                if (!joinStatus.equals("innerjoin") && !matched)
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

    private static void joinLines(String firstTableLine, String secondTableLine, int secondTableAttributeIndex, String secondTableDelimiter, BufferedWriter resultFileBuffer) throws IOException {
        secondTableLine = rmAttribute(secondTableLine, secondTableDelimiter, secondTableAttributeIndex);

        resultFileBuffer.append(firstTableLine).append(OUTPUT_DELIMITER)
                .append(secondTableLine.replace(secondTableDelimiter, OUTPUT_DELIMITER)).append("\n");
    }

}

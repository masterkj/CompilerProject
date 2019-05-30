package codgen;

import codgen.reducers.AggregationFunction;

import java.io.*;
import java.util.*;

import static codgen.Files.getCol;
import static codgen.Mapper.createDire;
import static codgen.Query.OUTPUT_DELIMITER;
import static codgen.Query.REDUCE_PATH;
import static codgen.Query.TEMP_PATH;

public class Reducer {


    /**
     * read the shuffled file,
     * flat it by the  aggregationFunction,
     * return the result in hashMap
     */
    static void reduce(String sourceFilePath, AggregationFunction aggregationFunction, String reduceFileName) throws IOException {


        //create the Reduces dir
        String reducePath = TEMP_PATH + REDUCE_PATH;
        createDire(reducePath);

        //create buffered writer for the reduceFile
        BufferedWriter reducedFile = new BufferedWriter(new FileWriter(reducePath + "/" + reduceFileName + ".csv"));

        BufferedReader sourceFile = new BufferedReader(new FileReader(sourceFilePath));

//        reducedFile.append(sourceFile.readLine()).append("\n");
        // write head line
        writeReduceHeadLine(sourceFile, reduceFileName, reducedFile);
        String line;

        HashMap<String, String> hashMap = new HashMap<>();
        //while the reader don't reach the end of the file
        while ((line = sourceFile.readLine()) != null) {
            //row now is about tow columns; the keys is row[0] and the value is row[1]
            String[] row = line.split(OUTPUT_DELIMITER);

            hashMap.put(row[0],
                    aggregationFunction.reduce(new ArrayList<>(Arrays.asList(row).subList(1, row.length))));
        }
        sourceFile.close();

        writeFile(hashMap, reducedFile);
    }

    private static void writeReduceHeadLine(BufferedReader sourceFile, String reduceFileName, BufferedWriter reducedFile) throws IOException {
        reducedFile.append(getCol(sourceFile.readLine(), 0, OUTPUT_DELIMITER))
                .append(OUTPUT_DELIMITER).append(reduceFileName)
                .append("\n");
    }


    /**
     * write the file depends of the hashMap
     */
    private static void writeFile(HashMap<String, String> hashMap, BufferedWriter bufferedWriter) throws IOException {
        hashMap.forEach((k, v) -> {
            try {
                bufferedWriter.append(k).append(OUTPUT_DELIMITER).append(v);
                bufferedWriter.append("\n");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private static String cutValue(String line) {
        String[] splitLine = line.split(OUTPUT_DELIMITER);
        return splitLine[1];
    }

    public static void accumulator() throws IOException {
        String reducePath = TEMP_PATH + REDUCE_PATH;
        final File ReducesDirectory = new File(reducePath);
        String accPath = reducePath + "/Accumulator.csv";
        BufferedWriter writer = new BufferedWriter(new FileWriter(accPath));

        BufferedReader[] readers = new BufferedReader[ReducesDirectory.listFiles().length - 1];
        writelines(ReducesDirectory, readers, writer);
    }

    static void writelines(File ReducesDirectory, BufferedReader[] readers, BufferedWriter writer) throws IOException {
        int i = 0;
        for (final File fileEntry : ReducesDirectory.listFiles()) {
            if (!fileEntry.getName().equals("Accumulator.csv")) {
                readers[i] = new BufferedReader(new FileReader(fileEntry));
                i++;
            }
        }
        boolean av = true;
        while (av) {
            boolean first = true;
            for (i = 0; i < readers.length; i++) {
                String line = readers[i].readLine();
                if (line != null)
                    first = readline(line, writer, first);
                else {
                    av = false;
                    break;
                }
            }
            writer.append("\n");
        }
        writer.flush();
        writer.close();
    }


    static boolean readline(String line, BufferedWriter writer, boolean first) throws IOException {
        if (first) {
            writer.append(line);
            first = false;
        } else {
            line = line.substring(line.indexOf(","));
            writer.append(line).append("\t");
        }
        return first;
    }
}
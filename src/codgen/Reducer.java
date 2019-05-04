package codgen;

import codgen.reducers.AggregationFunction;

import java.io.*;
import java.util.*;

import static codgen.Mapper.createDire;
import static codgen.Query.OUTPUT_DELIMITER;
import static codgen.Query.RESULT_FILE;
import static codgen.Query.TEMP_PATH;

class Reducer {

    /**
     * read the shuffled file,
     * reduce it by the  aggregationFunction,
     * return the result in hashMap
     */
    static void reduce(String sourceFileName, AggregationFunction aggregationFunction, String reduceFileName) throws IOException {

        String sourceFilePath = TEMP_PATH + "/" + sourceFileName + "/main.csv";

        //create the Reduces dir
        String reducePath = TEMP_PATH + "/Reduces";
        createDire(reducePath);

        //create buffered writer for the reduceFile
        BufferedWriter reducedFile = new BufferedWriter(new FileWriter(reducePath + "/" + reduceFileName + ".csv"));

        BufferedReader sourceFile = new BufferedReader(new FileReader(sourceFilePath));

        reducedFile.append(sourceFile.readLine()).append("\n");
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

    static void accumulate(ArrayList<String> finalFiles) throws IOException {
        FileWriter finalFile = new FileWriter(TEMP_PATH + "/" + RESULT_FILE);
        BufferedWriter finalFileBufferWriter = new BufferedWriter(finalFile);
        List<BufferedReader> bufferedReaders = new ArrayList<>();
        List<String> fileHeader = new ArrayList<>();
        List<String> values = new ArrayList<>();
        finalFiles.forEach(e-> {
            try {
                bufferedReaders.add(new BufferedReader(new FileReader(TEMP_PATH + "/"+ e)));
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        });


        boolean endReached = false;
        while(!endReached) {
            for (int i=0;i<bufferedReaders.size();i++) {
                String line;
                if ((line = bufferedReaders.get(i).readLine()) == null) {
                    endReached = true;
                    break;
                }

                if (i == bufferedReaders.size()-1)
                    finalFileBufferWriter.append(cutValue(line));
                else
                    finalFileBufferWriter.append(cutValue(line)).append(OUTPUT_DELIMITER);
            }
            finalFileBufferWriter.append("\n");

        }
        finalFileBufferWriter.flush();

    }

    private static String cutValue(String line) {
        String[] splitLine = line.split(OUTPUT_DELIMITER);
        return splitLine[1];
    }
}
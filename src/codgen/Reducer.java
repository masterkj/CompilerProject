package codgen;

import java.io.*;
import java.util.*;

import static codgen.Query.OUTPUT_DELIMITER;
import static codgen.Query.TEMP_PATH;

class Reducer {

    static void reduce(ArrayList<String> fileEntries, AggregationFunction aggregationFunction) {
        HashMap<String, String> hashMap = new HashMap<>();

        fileEntries.forEach(e -> {
            hashMap.clear();
            try {
                //read the file and reduce it
                String fileHeader = readCsvFileHeader(e);
                hashMap.putAll(Objects.requireNonNull(reduceShuffledFile(e, aggregationFunction)));

                //write the reduce results
                BufferedWriter bufferedWriter = writeFileHeader(e, fileHeader);
                writeFile(e, hashMap, bufferedWriter);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }

    static void finalPhaseReduce(ArrayList<String> fileEntries,AggregationFunction aggregationFunction) throws IOException {
//        FileWriter finalFile = new FileWriter(TEMP_PATH + "/finalFile.txt");
//        BufferedWriter finalFileBuffer = new BufferedWriter(finalFile);
//        finalFileBuffer.append(readCsvFileHeader(fileEntries.get(0))+"\n");
//
//        fileEntries.forEach(e-> {
//            try {
//                finalFileBuffer.append(readCsvFile(e));
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
//        });
//        finalFileBuffer.flush();
        String finalFileName = "finalFile.csv";
        mapAndShuffleFinalPhase(fileEntries,finalFileName);
        reduce(finalFileName,aggregationFunction);

    }

    private static void reduce(String finalFileName, AggregationFunction aggregationFunction) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(finalFileName);
        reduce(arrayList,aggregationFunction);
    }

    private static void mapAndShuffleFinalPhase(ArrayList<String> fileEntries, String finalFileName) throws IOException {
        FileWriter finalFile = new FileWriter(TEMP_PATH + "/" + finalFileName);
        BufferedWriter finalFileBuffer = new BufferedWriter(finalFile);
        finalFileBuffer.append(readCsvFileHeader(fileEntries.get(0))+"\n");

        fileEntries.forEach(e-> {
            try {
                finalFileBuffer.append(readCsvFile(e));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        finalFileBuffer.flush();
        Mapper.shuffle(finalFileName);
    }

    private static String readCsvFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(TEMP_PATH + "/" + fileName));
        StringBuilder fileResult = new StringBuilder("");
        String line;

        //escape the file header
        bufferedReader.readLine();

        while((line = bufferedReader.readLine()) !=null) {
            fileResult.append(line + "\n");
        }
        return fileResult.toString();
    }


    /**
     * write the file depends of the hashMap
     */
    private static void writeFile(String e, HashMap<String, String> hashMap, BufferedWriter bufferedWriter) throws IOException {
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

    /**
     * write the file header and return the buffer
     */
    private static BufferedWriter writeFileHeader(String fileName, String fileHeader) throws IOException {
        FileWriter file = new FileWriter(TEMP_PATH + "/" + fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(file);
        bufferedWriter.append(fileHeader).append("\n");
        return bufferedWriter;
    }


    /**
     * read the file header
     * and return it as String
     */
    private static String readCsvFileHeader(String e) throws IOException {
        FileReader fileReader = new FileReader(TEMP_PATH + "/" + e);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String fileHeader = bufferedReader.readLine();
        bufferedReader.close();
        return fileHeader;
    }


    /**
     * read the shuffled file,
     * reduce it by the  aggregationFunction,
     * return the result in hashMap
     */
    private static HashMap<String, String> reduceShuffledFile(String fileName, AggregationFunction aggregationFunction) throws IOException {
        //all files is on tempFiles directory
        FileReader fileReader = new FileReader(TEMP_PATH + "/" + fileName);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //escape the file header
        bufferedReader.readLine();
        String line;

        HashMap<String, String> hashMap = new HashMap<>();
        //while the reader don't reach the end of the file
        while ((line = bufferedReader.readLine()) != null) {
            //row now is about tow columns; the key is row[0] and the value is row[1]
            String[] row = line.split(OUTPUT_DELIMITER);

            hashMap.put(row[0],
                    aggregationFunction.reduce(new ArrayList<String>(Arrays.asList(row).subList(1, row.length))));
        }
        bufferedReader.close();
        return hashMap;
    }
}
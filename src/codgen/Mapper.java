package codgen;

import Data_Type.Data_Type;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static codgen.Query.OUTPUT_DELIMITER;
import static codgen.Query.TEMP_PATH;

class Mapper {

    static ArrayList<String> map(String key, String colName, String table) throws IOException {
        String HDFSPath = Data_Type.getHDFSPath(table);
        String inputDelimiter = Data_Type.getDelimiter(table);
        ArrayList<String> fileEntries = new ArrayList<>();


        BufferedReader br = null;
        String line = null;
        final File HDFSDirectory = new File(HDFSPath);


        //for file in directory
        for (final File fileEntry : HDFSDirectory.listFiles()) {

            br = new BufferedReader(new FileReader(fileEntry));
            line = br.readLine();

            //read the headLine
            String[] header = line.split(inputDelimiter);


            int colIndex = 0;
            int keyIndex = 0;

            //remove coats and determine key and value
            for (int i = 0; i < header.length; i++) {
                header[i] = header[i].replace("\"", "");
                if (header[i].equals(colName))
                    colIndex = i;

                if (header[i].equals(key) && !key.equals(table))
                    keyIndex = i;
            }


            FileWriter file = new FileWriter(TEMP_PATH + "/" + fileEntry.getName());
            fileEntries.add(fileEntry.getName());
            BufferedWriter bufferedWriter = new BufferedWriter(file);

            //the file head is the key and the value
            bufferedWriter.append(key).append(OUTPUT_DELIMITER).append(colName).append("\n");

            //while the reader don't reach the end of the file
            while ((line = br.readLine()) != null) {

                String[] row = line.split(OUTPUT_DELIMITER);

                //if the key is a col (there is a group by
                if (!key.equals(table))
                    bufferedWriter.append(row[keyIndex]).append(OUTPUT_DELIMITER).append(row[colIndex]).append("\n");

                    //the key is table so there isn't a group by
                else
                    bufferedWriter.append(table).append(OUTPUT_DELIMITER).append(row[colIndex]).append("\n");
            }
            bufferedWriter.flush();

        }
        //return all map files that we will make it at the end one file
        return fileEntries;
    }

    static void shuffle(ArrayList<String> fileEntries) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        //forEach file in fileEntries
        fileEntries.forEach(e -> {

            hashMap.clear();
            String fileHeader = null;
            try {
                //all files is on tempFiles directory
                FileReader fileReader = new FileReader(TEMP_PATH + "/" + e);

                BufferedReader bufferedReader = new BufferedReader(fileReader);
                fileHeader = bufferedReader.readLine();
                String line;

                //while the reader don't reach the end of the file
                while ((line = bufferedReader.readLine()) != null) {
                    //row now is about tow columns; the key is row[0] and the value is row[1]
                    String[] row = line.split(OUTPUT_DELIMITER);

                    //if the key isn't contained in the hashMap
                    if (!hashMap.containsKey(row[0])) {
                        ArrayList<String> values = new ArrayList<>();
                        values.add(row[1]);

                        hashMap.put(row[0], values);

                    } else
                        //the key is existed so we will add there
                        hashMap.get(row[0]).add(row[1]);
                }
                bufferedReader.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            //write the hashMap to the file
            try {
                FileWriter file = new FileWriter(TEMP_PATH + "/" + e);
                BufferedWriter bufferedWriter = new BufferedWriter(file);
                bufferedWriter.append(fileHeader).append("\n");


                hashMap.forEach((k, v) -> {
                    try {
                        bufferedWriter.append(k);
                        for (String value : v) {
                            bufferedWriter.append(OUTPUT_DELIMITER).append(value);
                        }
                        bufferedWriter.append("\n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                });
                bufferedWriter.flush();
                bufferedWriter.close();

            } catch (IOException e1) {
                e1.printStackTrace();
            }

        });
    }

    static void shuffle(String finalFile) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(finalFile);
        shuffle(arrayList);
    }
}
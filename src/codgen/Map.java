package codgen;

import Data_Type.Data_Type;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Map {
    private static String tempPath = "./tempFiles";

    public static ArrayList<String> startMap(String key, String colName, String table) throws IOException {
        String HDFSPath = Data_Type.getHDFSPath(table);
        String delimiter = Data_Type.getDelimiter(table);
        ArrayList<String> fileEntries = new ArrayList<>();

        final File HDFSDirectory = new File(HDFSPath);

        BufferedReader br = null;
        String line = null;


        for (final File fileEntry : HDFSDirectory.listFiles()) {

            br = new BufferedReader(new FileReader(fileEntry));
            line = br.readLine();
            String[] header = line.split(delimiter);
            int colIndex = 0;
            int keyIndex = 0;

            //remove coats
            for (int i = 0; i < header.length; i++) {
                header[i] = header[i].replace("\"", "");
                if (header[i].equals(colName))
                    colIndex = i;

                if (header[i].equals(key) && !key.equals(table))
                    keyIndex = i;
            }



            FileWriter file = new FileWriter(tempPath + "/" + fileEntry.getName());
            fileEntries.add(fileEntry.getName());

            BufferedWriter bufferedWriter = new BufferedWriter(file);

            bufferedWriter.append(key).append(delimiter).append(header[colIndex]).append("\n");
            while ((line = br.readLine()) != null) {

                String[] row = line.split(delimiter);


                if (!key.equals(table))
                    bufferedWriter.append(row[keyIndex]).append(delimiter).append(row[colIndex]).append("\n");
                else
                    bufferedWriter.append(table).append(delimiter).append(row[colIndex]).append("\n");

            }
            bufferedWriter.flush();

        }
        return fileEntries;
    }

    static void shuffle(ArrayList<String> fileEntries, String delimiter) {
        HashMap<String,ArrayList<String>> hashMap = new HashMap<>();

        fileEntries.forEach(e->{
            hashMap.clear();
            String fileHeader = null;
            try {
                FileReader fileReader = new FileReader(tempPath +"/" +e);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                fileHeader = bufferedReader.readLine();
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    String[] row = line.split(delimiter);
                    if(!hashMap.containsKey(row[0])) {
                        ArrayList<String> values = new ArrayList<>();
                        values.add(row[1]);
                        hashMap.put(row[0],values);
                    }
                    else
                        hashMap.get(row[0]).add(row[1]);
                }
            } catch (IOException e1) {
                e1.printStackTrace();
            }

            FileWriter file = null;
            try {
                file = new FileWriter(tempPath + "/" + e);
                BufferedWriter bufferedWriter = new BufferedWriter(file);
                bufferedWriter.append(fileHeader).append("\n");


                hashMap.forEach((k,v)->{
                    try {
                        bufferedWriter.append(k);
                        for(String value :v){
                            bufferedWriter.append(delimiter).append(value);
                        }
                        bufferedWriter.append("\n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                });
                bufferedWriter.flush();

            } catch (IOException e1) {
                e1.printStackTrace();
            }

        });
    }
}
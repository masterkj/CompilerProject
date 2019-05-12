package codgen;

import Data_Type.Data_Type;

import java.io.*;
import java.util.*;

import static codgen.Query.OUTPUT_DELIMITER;
import static codgen.Query.TEMP_PATH;

class Mapper {

    static void map(ArrayList<String> keys, String colName, String table) throws IOException {
        String HDFSPath = Data_Type.getHDFSPath(table);
        String inputDelimiter = Data_Type.getDelimiter(table);
        String mapPath = TEMP_PATH + "/" + colName + "/" + "maps";
        createDire(mapPath);

        BufferedReader br;
        String line;
        final File HDFSDirectory = new File(HDFSPath);

        //for file in directory
        for (final File fileEntry : HDFSDirectory.listFiles()) {

            br = new BufferedReader(new FileReader(fileEntry));
            line = br.readLine();

            //read the headLine
            String splitRegex = "["+Data_Type.getDelimiter(table)+"]";
            String[] header = line.split(splitRegex);


            int colIndex = 0;
            int keyIndex[] = new int[keys.size()];

            //remove coats and determine keys and value
            int k = 0;
            for (int i = 0; i < header.length; i++) {
                header[i] = header[i].replace("\"", "");
                if (header[i].equals(colName))
                    colIndex = i;

                if (keys.contains(header[i])) {
                    keyIndex[k] = i;
                    k++;
                }
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(mapPath + "/" + fileEntry.getName()));

            //the file head is the keys and the value
            StringBuilder HeaderKey = new StringBuilder();
            keys.forEach(e -> {
                if (HeaderKey.toString().equals(""))
                    HeaderKey.append(e);
                else
                    HeaderKey.append("_").append(e);
            });

            bufferedWriter.append(HeaderKey).append(OUTPUT_DELIMITER).append(colName).append("\n");


            //while the reader don't reach the end of the file
            while ((line = br.readLine()) != null) {

                String[] row = line.split(splitRegex);

                //if the keys is a col (there is a group by)
                if (keys.size() >= 1 && !keys.get(0).equals(table)) {
                    StringBuilder key = new StringBuilder();
                    for (int index : keyIndex) {
                        if (key.toString().equals(""))
                            key.append(row[index]);
                        else
                            key.append("@").append(row[index]);
                    }

                    bufferedWriter.append(key).append(OUTPUT_DELIMITER).append(row[colIndex]).append("\n");

                    //the keys is table so there isn't a group by
                } else
                    bufferedWriter.append(table).append(OUTPUT_DELIMITER).append(row[colIndex]).append("\n");
            }
            bufferedWriter.flush();

        }
    }


    static void shuffle(String valueName) throws IOException {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String> fileEntries = new ArrayList<>();
        File maps = new File(TEMP_PATH + "/" + valueName + "/maps");
        String shuffledFilePath = TEMP_PATH + "/" + valueName + "/shuffles";
        createDire(shuffledFilePath);

        //forEach file in fileEntries
        for (final File fileEntry : Objects.requireNonNull(maps.listFiles())) {
            hashMap.clear();
            String fileHeader = null;

            //all files is on tempFiles directory
            FileReader fileReader = new FileReader(fileEntry);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            fileHeader = bufferedReader.readLine();
            String line;

            //while the reader don't reach the end of the file
            while ((line = bufferedReader.readLine()) != null) {
                //row now is about tow columns; the keys is row[0] and the value is row[1]
                String[] row = line.split(OUTPUT_DELIMITER);

                //if the keys isn't contained in the hashMap
                if (!hashMap.containsKey(row[0])) {
                    ArrayList<String> values = new ArrayList<>();
                    values.add(row[1]);

                    hashMap.put(row[0], values);

                } else
                    //the keys is existed so we will add there
                    hashMap.get(row[0]).add(row[1]);
            }
            bufferedReader.close();


            //write the hashMap to the file
            FileWriter file = new FileWriter(shuffledFilePath + "/" + fileEntry.getName());
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            bufferedWriter.append(fileHeader).append("\n");


            writeShuffledMap(bufferedWriter, hashMap);
        }

        finalShuffle(valueName);

    }

    private static void finalShuffle(String valueName) throws IOException {
        File shuffledFilesDir = new File(TEMP_PATH + "/" + valueName + "/shuffles");
        BufferedWriter finalShuffledFile = new BufferedWriter(new FileWriter(TEMP_PATH + "/" + valueName + "/main.csv"));
        HashMap<String, ArrayList<String>> finalShuffledFileMap = new HashMap<>();
        HashMap<String, ArrayList<String>> currentFileMap = new HashMap<>();
        boolean headerGotten = false;
        String fileHeader = null;
        for (File shuffledFile : Objects.requireNonNull(shuffledFilesDir.listFiles())) {
            if(!headerGotten) {
                fileHeader = getHeader(shuffledFile);
                headerGotten = true;
            }

            currentFileMap = shuffledFileToMap(shuffledFile);
            shuffleFiles(finalShuffledFileMap, currentFileMap);
        }
        finalShuffledFile.append(fileHeader).append("\n");

        writeShuffledMap(finalShuffledFile, finalShuffledFileMap);

    }

    static String getHeader(File shuffledFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(shuffledFile));
        String line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
    }

    public static void writeShuffledMap(BufferedWriter finalShuffledFile, HashMap<String, ArrayList<String>> finalShuffledFileMap) throws IOException {

        finalShuffledFileMap.forEach((k, v) -> {
            try {
                finalShuffledFile.append(k);
                for (String value : v) {
                    finalShuffledFile.append(OUTPUT_DELIMITER).append(value);
                }
                finalShuffledFile.append("\n");
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        });
        finalShuffledFile.flush();
        finalShuffledFile.close();

    }


    private static void shuffleFiles(HashMap<String, ArrayList<String>> finalShuffledFileMap, HashMap<String, ArrayList<String>> currentFileMap) {
        currentFileMap.forEach((k,v)->{
            if(finalShuffledFileMap.containsKey(k))
                finalShuffledFileMap.get(k).addAll(v);
            else
                finalShuffledFileMap.put(k,v);
        });
    }

    static HashMap<String, ArrayList<String>> shuffledFileToMap(File shuffledFile) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(shuffledFile));
        HashMap<String, ArrayList<String>> shuffledMap = new HashMap<>();

        //header line
        bufferedReader.readLine();

        String line;
        String row[];
        while((line = bufferedReader.readLine()) !=null){
            row = line.split(OUTPUT_DELIMITER);
            shuffledMap.put(row[0], new ArrayList<String>(Arrays.asList(Arrays.copyOfRange(row,1,row.length))));
        }
        return shuffledMap;
    }

    static void createDire(String mapPath) {
        File fileDirectory = new File(mapPath);
        if (!fileDirectory.exists()) {
            fileDirectory.mkdirs();
        }
    }
}
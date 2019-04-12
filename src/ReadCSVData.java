import java.io.*;
import java.util.ArrayList;

class ReadCSVData {

    static void read(ArrayList<String> columns, String HDFSPath, String delimiter) {

//        BufferedReader br = null;

        HDFSPath = "c:\\HDFS\\temperatures";
        delimiter = ",";

        final File HDFSDirectory = new File(HDFSPath);
        listFilesForFolder(HDFSDirectory);



//        String line = "";
//        int[]index = new int[columns.size()];
//        try {
//            br = new BufferedReader(new FileReader(csvFile));
//            line = br.readLine();
//            String[] header = line.split(cvsSplitBy);
//            for (int i = 0; i < columns.size(); i++) {
//                for (int j = 0; j < header.length; j++) {
//                    header[j] = header[j].replace("\"", "");
//                    if (header[j].equals(columns.get(i))) {
//                        index[i]=j;
//                    }
//                }
//            }
//                while ((line = br.readLine()) != null) {
//                    for (int i = 0; i < columns.size(); i++) {
//                    String[] country = line.split(cvsSplitBy);
//                    System.out.print(country[index[i]] + "  ");
//                }
//                    System.out.println();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    private static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {

            }
        }
    }
}
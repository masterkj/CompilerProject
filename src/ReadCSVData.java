import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class ReadCSVData {

    static void read(ArrayList<String> columns) {

        String csvFile = "./assets/temperatures.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int[]index = new int[columns.size()];
        try {
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            String[] header = line.split(cvsSplitBy);
            for (int i = 0; i < columns.size(); i++) {
                for (int j = 0; j < header.length; j++) {
                    header[j] = header[j].replace("\"", "");
                    if (header[j].equals(columns.get(i))) {
                        index[i]=j;
                    }
                }
            }
                while ((line = br.readLine()) != null) {
                    for (int i = 0; i < columns.size(); i++) {
                    String[] country = line.split(cvsSplitBy);
                    System.out.print(country[index[i]] + "  ");
                }
                    System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
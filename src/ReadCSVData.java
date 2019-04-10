import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSVData {

    public static void read(ArrayList<String> columns) {

        String csvFile = "assest/tempretures.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            Scanner scan = new Scanner(System.in);
// select * --> line
// out put coloumn country[ColNumber]
            //  int ColNumber = scan.nextInt()-1;
            line = br.readLine();
            String[] header = line.split(cvsSplitBy);
            //   String []Columns = null;
            int index[] = null;
            for (int i = 0; i < columns.size(); i++) {
                for (int j = 0; j < header.length; j++) {
                    if (columns.get(i) == header[j]) {
                        index[i] = j;
                    }
                }
            }
            System.out.println(line);
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                // Thread.sleep();
                for (int i = 0; i < index.length; i++) {

                    System.out.print(country[index[i]]+",");
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
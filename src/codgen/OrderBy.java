package codgen;

import java.io.*;
import java.nio.channels.FileChannel;

import static codgen.Query.*;

public class OrderBy {

    public static boolean T_DESC = false;


    public static void initOrder() throws IOException {

        File directory = new File(TEMP_PATH + ORDER_BY_PATH);
        BufferedWriter bw;
        BufferedReader br;

        for (File fileEntry : directory.listFiles()) {
            String name = TEMP_PATH + ORDER_BY_PATH + fileEntry.getName();


            bw = new BufferedWriter(new FileWriter(name.substring(0, name.length() - 2)));



            String line;
            String delete = null;
            while (fileEntry.length() > 0) {
                double mid = -10000000000.0;
                if (T_DESC)
                    mid = 1000000000.0;
                br = new BufferedReader(new FileReader(name));
                br.readLine();
                while ((line = br.readLine()) != null) {
                    double value = comparedValue(line);
                    if (T_DESC) {
                        if (value < mid) {
                            mid = value;
                            delete = line;
                        }
                    } else if (value >= mid) {
                        mid = value;
                        delete = line;
                    }
                }
                bw.append(String.valueOf(mid)).append("\n");
                br.close();
                deleteLine(delete, name);
            }
            bw.flush();
            bw.close();
        }

    }

    public static void order() throws IOException {

        File orderDir=new File(TEMP_PATH+ORDER_BY_PATH);
        copyFile(TEMP_PATH+REDUCE_PATH+"Accumulator.csv",TEMP_PATH+REDUCE_PATH+"Accumulator1.csv");

        for (File fileEntry : orderDir.listFiles()) {

        }
    }

    public static void copyFile(String source,String destination) throws IOException {
        FileChannel sourc = new FileInputStream(source).getChannel();
        FileChannel dest = new FileOutputStream(destination + "1").getChannel();
        dest.transferFrom(sourc, 0, sourc.size());

        sourc.close();
        dest.close();
    }

    public static double comparedValue(String line){

        String value=line.substring(1);
        return Double.parseDouble(value);

    }

    public static void deleteLine(String line, String name) throws IOException {

        copyFile(name,name+"1");

        PrintWriter pw = new PrintWriter(name);
        BufferedReader br = new BufferedReader(new FileReader(name + 1));

        String row ;

        while ((row = br.readLine()) != null)
            if (!row.equals(line))
                pw.println(row);

        pw.flush();
        br.close();
        pw.close();

        File file=new File(name+1);
        file.delete();

    }

}

package codgen;

import codgen.reducers.AggregationFunction;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public class Query {
    //TODO: many tables
    //TODO: if not keys, noy group by -> the keys is incremental
    public static final String TEMP_PATH = "./tempFiles";
    public static final String OUTPUT_FLAT_PATH = "./tempFiles/flat";
    public static final String REDUCE_PATH = "/Reduces";
    public static final String JOIN_PATH = "/join";
    public static final String ORDER_BY_PATH = "/Order";
    public final static String OUTPUT_DELIMITER = ",";

    public static String fromTable;
    public static String joinTable;
    public static String joinResultTable;
    public static ArrayList<String> keys = new ArrayList<>();
    public static boolean T_DESC = false;
    public static List<String> values = new ArrayList<>();
    public static boolean isJoin = false;
    public static boolean shufflePhaseEnded = false;
    public static boolean endJoinPhase = false;

    public final static boolean EXPLAIN_PLAN = true;


    public static void prepareShuffledFiles() throws IOException {

        if (Query.EXPLAIN_PLAN)
            System.out.println("\n"+"---------- MAP phase  ----------");

        for (String value : values) {
            if (!isJoin) {
                Mapper.map(keys, value, fromTable);
                Mapper.shuffle(value);
            } else {
                Mapper.map(keys, value, joinResultTable);
                Mapper.shuffle(value);
            }
        }
        shufflePhaseEnded = true;
    }

    public static void addValue(String value) {

        if (value != null && !values.contains(value))
            values.add(value);
    }

    /**
     * flat the files with the given aggregation function
     */
    public static void reduce(String sourceFilePath, AggregationFunction aggregationFunction, String reduceFileName) {
        try {
            Reducer.reduce(sourceFilePath, aggregationFunction, reduceFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void accumulateReducers() {

    }

    public static boolean reducerFound(String reducer) {
        File directory = new File(TEMP_PATH + REDUCE_PATH);
        for (File fileEntry : directory.listFiles()) {
            if (fileEntry.getName() == reducer) {
                return true;
            }
        }
        return false;
    }

    public static void copyReducer(String reducer) throws IOException {

        FileChannel source = new FileInputStream(TEMP_PATH + REDUCE_PATH + reducer).getChannel();
        FileChannel dest = new FileOutputStream(TEMP_PATH + ORDER_BY_PATH + reducer + "1").getChannel();
        dest.transferFrom(source, 0, source.size());

        source.close();
        dest.close();
    }

    public static void deleteReducer(String reducer) {
        File file = new File(TEMP_PATH + REDUCE_PATH + reducer);
        file.delete();
    }

    public static void order() throws IOException {

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

    public static double comparedValue(String line){

        String value=line.substring(1);
        return Double.parseDouble(value);

    }

    public static void deleteLine(String line, String name) throws IOException {

        FileChannel source = new FileInputStream(name).getChannel();
        FileChannel dest = new FileOutputStream(name + "1").getChannel();
        dest.transferFrom(source, 0, source.size());

        source.close();
        dest.close();

        PrintWriter pw = new PrintWriter(name);
        BufferedReader br = new BufferedReader(new FileReader(name + 1));

        String row ;

        while ((row = br.readLine()) != null)
                if (!row.equals(line))
                    pw.println(row);

        pw.flush();
        br.close();
        pw.close();

    }

}

package codgen;

import codgen.reducers.AggregationFunction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Query {
    //TODO: many tables
    //TODO: if not keys, noy group by -> the keys is incremental
    public static final String TEMP_PATH = "./tempFiles";
    public static final String OUTPUT_FLAT_PATH = "./tempFiles/flat";
    public static final String REDUCE_PATH = "/Reduces";
    public static final String JOIN_PATH = "/join";
    public final static String OUTPUT_DELIMITER = ",";

    public static String fromTable;
    public static String joinTable;
    public static String joinResultTable;
    public static ArrayList<String> keys = new ArrayList<>();
    public static ArrayList<String> orders = new ArrayList<>();
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


}

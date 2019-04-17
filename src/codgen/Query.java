package codgen;

import codgen.reducers.AggregationFunction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Query {
    //TODO: many tables
    //TODO: many group by columns
    //TODO: if not key, noy group by -> the key is incremental

    public static List<String> Tables = new ArrayList<>();
    public static String key;
    final static String OUTPUT_DELIMITER = ",";
    public static final String TEMP_PATH = "./tempFiles";
    static final String RESULT_FILE = "RESULT.csv";


    public static ArrayList<String> startProcess(String colName, String tableName) throws IOException {
        ArrayList<String> fileEntries;
        fileEntries = Mapper.map(key, colName, tableName);

        Mapper.shuffle(fileEntries);

//        Reducer.reduce(fileEntries, aggregationFunction);

        return fileEntries;
    }

    /**
     * the finalPhaseFile is the file
     * have all the process files in one file
     */
    public static String getFinalPhaseResult(ArrayList<String> fileEntries, AggregationFunction aggregationFunction) throws IOException {
        return Reducer.finalPhaseReduce(fileEntries, aggregationFunction);
    }

    /**
     * accumulate all the finalPhaseFiles
     * get our result finally
     */
    public static void accumulate(ArrayList<String> finalFiles) throws IOException {
        Reducer.accumulate(finalFiles);
    }

    /**
     * reduce the files with the given aggregation function*/
    public static void reduce(ArrayList<String> fileEntries, AggregationFunction aggregationFunction) {
        Reducer.reduce(fileEntries, aggregationFunction);
    }
}

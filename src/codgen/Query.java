package codgen;

import Data_Type.Data_Type;
import codgen.reducers.AggregationFunction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Query {
    //TODO: many tables
    //TODO: many group by columns
    //TODO: if not keys, noy group by -> the keys is incremental

    public static List<String> Tables = new ArrayList<>();
    public static ArrayList<String> keys = new ArrayList<>();
    public static ArrayList<String> values = new ArrayList<>();
    final static String OUTPUT_DELIMITER = ",";
    public static final String TEMP_PATH = "./tempFiles";
    static final String RESULT_FILE = "RESULT.csv";

    public static void prepareShuffledFiles() throws AttributeWithoutTableException, IOException {
        for (String value : values) {
            Mapper.map(keys,value,getTable(value));
            Mapper.shuffle(value);
        }
    }

    private static String getTable(String value) throws AttributeWithoutTableException {
        for (String table : Tables) {
            try {
                if(Data_Type.isAttribute(table,value))
                    return table;
            } catch (Data_Type.DataTypeNotFoundException e) {
                e.printStackTrace();
            }
        }
        throw new AttributeWithoutTableException(value);
    }

    public static void addValue(String value) {
        if(!values.contains(value) && value!=null)
            values.add(value);
    }


//    public static ArrayList<String> startProcess(String colName, String tableName) throws IOException {
//        ArrayList<String> fileEntries;
//        fileEntries = Mapper.map(keys, colName, tableName);
//
//        Mapper.shuffle(fileEntries);
//
////        Reducer.reduce(fileEntries, aggregationFunction);
//
//        return fileEntries;
//    }

    /**
     * the finalPhaseFile is the file
     * have all the process files in one file
     */
//    public static String getFinalPhaseResult(ArrayList<String> fileEntries, AggregationFunction aggregationFunction) throws IOException {
//        return Reducer.finalPhaseReduce(fileEntries, aggregationFunction);
//    }

    /**
     * accumulate all the finalPhaseFiles
     * get our result finally
     */
//    public static void accumulate(ArrayList<String> finalFiles) throws IOException {
//        Reducer.accumulate(finalFiles);
//    }

    /**
     * reduce the files with the given aggregation function*/
//    public static void reduce(ArrayList<String> fileEntries, AggregationFunction aggregationFunction) {
//        Reducer.reduce(fileEntries, aggregationFunction);
//    }

    public static class AttributeWithoutTableException extends Exception{
        AttributeWithoutTableException(String s){
            super(s + "attribute don't have table");
        }
    }




}

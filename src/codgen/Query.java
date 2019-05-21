package codgen;

import Data_Type.Data_Type;
import codgen.reducers.AggregationFunction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Query {
    //TODO: many tables
    //TODO: if not keys, noy group by -> the keys is incremental

    public static List<String> Tables = new ArrayList<>();
    public static ArrayList<String> keys = new ArrayList<>();
    public static ArrayList<String> orders = new ArrayList<>();
    public static boolean T_DESC = false;
    public static ArrayList<String> values = new ArrayList<>();
    final static String OUTPUT_DELIMITER = ",";
    public static final String TEMP_PATH = "./tempFiles";
    public static final String OUTPUT_FLAT_PATH = "./tempFiles/flat";
    public static final String REDUCE_PATH = "/Reduces";
    public static boolean shufflePhaseEnded = false;


    public static void prepareShuffledFiles() throws AttributeWithoutTableException, IOException {
        for (String value : values) {
            Mapper.map(keys,value,getTable(value));
            Mapper.shuffle(value);
        }
        shufflePhaseEnded = true;
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

    /**
     * flat the files with the given aggregation function*/
    public static void reduce(String sourceFilePath, AggregationFunction aggregationFunction, String reduceFileName) {
        try {
            Reducer.reduce(sourceFilePath, aggregationFunction, reduceFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void accumulateReducers() {

    }

    public static class AttributeWithoutTableException extends Exception{
        AttributeWithoutTableException(String s){
            super(s + "attribute don't have table");
        }
    }




}

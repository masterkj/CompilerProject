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

    /**
     * reduce the files with the given aggregation function*/
    public static void reduce(String sourceFile, AggregationFunction aggregationFunction, String reduceFileName) {
        try {
            Reducer.reduce(sourceFile, aggregationFunction, reduceFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class AttributeWithoutTableException extends Exception{
        AttributeWithoutTableException(String s){
            super(s + "attribute don't have table");
        }
    }




}

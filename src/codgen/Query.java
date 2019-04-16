package codgen;

import Data_Type.Data_Type;

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
    final static String TEMP_PATH = "./tempFiles";


    public static String startProcess(String colName) throws IOException {
        ArrayList<String> fileEntries ;
        fileEntries = Mapper.map(key,colName,Tables.get(0));

        Mapper.shuffle(fileEntries);

//        Reducer.reduce(fileEntries,e-> e.get(0));
        Reducer.reduce(fileEntries,new Sum());
        Reducer.finalPhaseReduce(fileEntries,new Sum());

        return "";
    }

}

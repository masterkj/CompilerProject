package codgen;

import Data_Type.Data_Type;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Query {
    //TODO: many tables
    //TODO: many group by columns

    public static List<String> Tables = new ArrayList<>();
    public static String key;

    public static String startProcess(String colName) throws IOException {
        ArrayList<String> fileEntries = new ArrayList<>();
        fileEntries = Map.startMap(key,colName,Tables.get(0));

        Map.shuffle(fileEntries, Data_Type.getDelimiter(Tables.get(0)));

        return "";
    }

}

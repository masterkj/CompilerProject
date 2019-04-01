package Data_Type;

import java.io.*;
import java.util.*;

public class Data_Type implements Serializable {
    private static Map<String, Variable_form> GLOBAL_ARRAY = new HashMap<>();
    private static List<String> MAIN_DATA_TYPE = new ArrayList<>();


    /*
    * add DT to the GLOBAL_ARRAY*/
    public static void set_DT(String DT, Variable_form variables) throws TableDeclearedException {
        if (isDT(DT)) throw new TableDeclearedException(DT + "is laready decleared");
        GLOBAL_ARRAY.put(DT, variables);
        updateDataTypeFile();
    }

    public static void set_DT(String DT_name, Attribute_form...args){
        GLOBAL_ARRAY.put(DT_name,new Variable_form(args));
        updateDataTypeFile();
    }

    public static boolean isDT(String DT){
        return GLOBAL_ARRAY.getOrDefault(DT,null)!=null;
    }

    static public Variable_form get_DT(String DT) throws Data_Type.Data_Type.DataTypeNotFoundException {
        if(isDT(DT))
            return (Variable_form) GLOBAL_ARRAY.get(DT);
        throw new Data_Type.Data_Type.DataTypeNotFoundException(DT + "table is not decleared");
    }

    public static void setMainDT(String[] strings) {
        MAIN_DATA_TYPE = Arrays.asList(strings);
    }

    //TODO: make our Data_Type read from json file by the startup of the program

    /**
     * read from json file that store our imparitive and Tables
     * @throws Exception if we can't find our file*/
    public static void loadDataTypeFile() {

    }

    /**
     * update the json file every time we make change to the GLOBAL_ARRAY*/
    public static void updateDataTypeFile() {

    }

    /**
     * clear all DataTypes without the imperetives DataTypes*/
    public static void clearDataTypeTables() {

    }
    /**
     * remove a DT unless it's an imperitive*/
    public static void removeDT() {

    }

    /*
    for an undeclared Table*/
    public static class DataTypeNotFoundException extends ClassNotFoundException {
        DataTypeNotFoundException(String s) { super(s); }
    }

    /*
    for an already decleard Table*/
    static class TableDeclearedException extends Exception {
        TableDeclearedException(String s) { super(s); }
    }
}

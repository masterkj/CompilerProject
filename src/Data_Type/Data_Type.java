package Data_Type;

import java.io.*;
import java.util.*;

public class Data_Type implements Serializable {
    private static Map<String, Variable_form> GLOBAL_ARRAY = new HashMap<>();
    private static List<String> MAIN_DATA_TYPE = new ArrayList<>();

    //TODO : check if all details are existed at the end
    //TODO: auto fil the objects

    /*
    * add DT to the GLOBAL_ARRAY*/
    public static void set_DT(String DT, Variable_form variables) throws TableDeclearedException {
        if (isDT(DT)) throw new TableDeclearedException(DT + "is laready decleared");
        GLOBAL_ARRAY.put(DT, variables);
    }

    /*the deafault DT's */
    public static void setMainDT() throws TableDeclearedException {
        set_DT("int",new Variable_form(new Attribute_form("int","int")));
        set_DT("real",new Variable_form(new Attribute_form("real","real")));
        set_DT("string",new Variable_form(new Attribute_form("string","string")));
        set_DT("boolean",new Variable_form(new Attribute_form("boolean","boolean")));
    }

    public static void set_DT(String DT_name, Attribute_form...args){
        GLOBAL_ARRAY.put(DT_name,new Variable_form(args));
    }

    public static boolean isDT(String DT){
        return GLOBAL_ARRAY.getOrDefault(DT,null)!=null;
    }

    static public Variable_form get_DT(String DT) throws TableNotFoundException {
        if(isDT(DT))
            return (Variable_form) GLOBAL_ARRAY.get(DT);
        throw new TableNotFoundException(DT + "table is not decleared");

    }

    public static void setMainDT(String[] strings) {
        MAIN_DATA_TYPE = Arrays.asList(strings);
    }

    /*
    for an undeclared Table*/
    public static class TableNotFoundException extends ClassNotFoundException {
        TableNotFoundException(String s) { super(s); }
    }

    /*
    for an already decleard Table*/
    static class TableDeclearedException extends Exception {
        TableDeclearedException(String s) { super(s); }
    }
}

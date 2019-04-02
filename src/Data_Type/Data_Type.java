package Data_Type;

import com.google.gson.JsonObject;
import jdk.nashorn.internal.objects.Global;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sympol_table.Var;

import java.io.*;
import java.util.*;


public class Data_Type implements Serializable {
    private static Map<String, Variable_form> GLOBAL_ARRAY = new HashMap<>();
    private static List<String> MAIN_DATA_TYPE = new ArrayList<>();
    private static final String JSON_FILE_NAME="assest\\DATA_TYPE.json";




    /*
    * add DT to the GLOBAL_ARRAY*/
    public static void set_DT(String DT, Variable_form variables) throws TableDeclearedException, FileNotFoundException {
        if (isDT(DT)) throw new TableDeclearedException(DT + "is laready decleared");
        GLOBAL_ARRAY.put(DT, variables);

    }

    public static void set_DT(String DT_name, Attribute_form...args) throws FileNotFoundException {
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

    //TODO: make our Data_Type read from json file by the startup of the program

    /**
     * read from json file that store our imparitive and Tables
     * @throws Exception if we can't find our file*/
    public static void loadDataTypeFile() throws IOException, ParseException, TableDeclearedException {

        Object obj = new JSONParser().parse(new FileReader(JSON_FILE_NAME));
        JSONArray jsonarr= (JSONArray) obj;

        for (int i = 0; i < jsonarr.size(); i++) {
            JSONObject json= (JSONObject) jsonarr.get(i);

            Variable_form fileVar= (Variable_form) json.get("Variable_form");
            Variable_form arrvar=new Variable_form();

            arrvar.isImperative= fileVar.isImperative;

            for (int j = 0; j <fileVar.getAttriputes().size() ; j++) {

                String attrName=fileVar.getAttriputes().get(j).getName();
                String attrType=fileVar.getAttriputes().get(j).getType();
                Variable_form attrForm=fileVar.getAttriputes().get(j).getDetails();

                arrvar.getAttriputes().add(new Attribute_form(attrName,attrType,attrForm));

            }
            set_DT((String) json.get("DataType"),arrvar);

        }

    }

    /**
     * update the json file every time we make change to the GLOBAL_ARRAY*/
    public static void updateDataTypeFile() throws FileNotFoundException {


        JSONArray arr=(JSONArray) GLOBAL_ARRAY;

      /*  for (int i = 0; i < GLOBAL_ARRAY.size(); i++) {

            JSONObject json= (JSONObject) arr.get(i);

            Variable_form arrVar=(Variable_form) json.get("Variable_form");
            Variable_form fileVar=new Variable_form();

            fileVar.isImperative=arrVar.isImperative;

            for (int j = 0; j <arrVar.getAttriputes().size() ; j++) {

                String attrName=arrVar.getAttriputes().get(j).getName();
                String attrType=arrVar.getAttriputes().get(j).getType();
                Variable_form attrForm=arrVar.getAttriputes().get(j).getDetails();

                fileVar.getAttriputes().add(new Attribute_form(attrName,attrType,attrForm));

            }

            json.put(GLOBAL_ARRAY.get("DataType"),fileVar);
*/
            PrintWriter pw = new PrintWriter(JSON_FILE_NAME);
            pw.write(arr.toJSONString());

    }

    /**
     * clear all DataTypes without the imperetives DataTypes*/
    public static void clearDataTypeTables() throws IOException, ParseException, TableDeclearedException {

        JSONArray array = (JSONArray) GLOBAL_ARRAY;
        JSONArray newarray = (JSONArray) GLOBAL_ARRAY;

        for (int i = 0; i <array.size() ; i++) {

        JSONObject json=(JSONObject) array.get(i);
        Variable_form var=(Variable_form) json.get("Variable_form");
        if(var.isImperative){
            newarray.add(array.get(i));
        }
        }
        PrintWriter pw = new PrintWriter(JSON_FILE_NAME);
        pw.write(array.toJSONString());
        updateDataTypeFile();
        loadDataTypeFile();
    }
    /**
     * remove a DT unless it's an imperitive*/
    public static void removeDT() throws FileNotFoundException {


        updateDataTypeFile();

    }

    public static void addDataType(String DT, Variable_form variables) throws TableDeclearedException, FileNotFoundException {
        set_DT(DT,variables);
        updateDataTypeFile();
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

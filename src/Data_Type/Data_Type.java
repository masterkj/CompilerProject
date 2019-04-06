package Data_Type;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import jdk.nashorn.internal.objects.Global;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;


public class Data_Type implements Serializable {
    private static Map<String, Variable_form> GLOBAL_ARRAY = new LinkedHashMap<>();
    private static final String JSON_FILE_NAME = "assest\\DATA_TYPE.json";

    /*
     * add DT to the GLOBAL_ARRAY*/
    public static void set_DT(String DT, Variable_form variables) throws TableDeclearedException, FileNotFoundException {
        if (isDT(DT)) throw new TableDeclearedException(DT + "is laready decleared");
        GLOBAL_ARRAY.put(DT, variables);

    }

    public static void set_DT(String DT_name, Attribute_form... args) throws FileNotFoundException {
        GLOBAL_ARRAY.put(DT_name, new Variable_form(args));

    }

    public static boolean isDT(String DT) {
        return GLOBAL_ARRAY.getOrDefault(DT, null) != null;
    }

    static public Variable_form get_DT(String DT) throws Data_Type.DataTypeNotFoundException {
        if (isDT(DT))
            return (Variable_form) GLOBAL_ARRAY.get(DT);
        throw new Data_Type.DataTypeNotFoundException(DT + "table is not decleared");
    }

    //TODO: make our Data_Type read from json file by the startup of the program

    /**
     * read from json file that store our imparitive and Tables
     *
     * @throws Exception if we can't find our file
     */
    public static void loadDataTypeFile() throws IOException, ParseException {

        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\Najib\\Documents\\DATA_TYPE.json"));

        JSONArray jsonarr = (JSONArray) obj;

        jsonarr.forEach(e -> {

            try {

                JSONObject json = (JSONObject) e;
                JSONObject filevar = (JSONObject) json.get("Variable_form");
                boolean isImperative = (boolean) filevar.get("isImperative");
                Variable_form vari = new Variable_form();
                vari.isImperative = isImperative;
                JSONArray vararr = (JSONArray) filevar.get("attributes");
                vararr.forEach(x -> {
                    JSONObject fileattr = (JSONObject) x;
                    Attribute_form atrr = new Attribute_form(fileattr.get("name").toString(), fileattr.get("type").toString());
                    vari.attributes.add(atrr);
                });

                Data_Type.set_DT((String) json.get("DataType"), vari);
            } catch (TableDeclearedException e1) {
                e1.printStackTrace();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        });


    }

    public static JSONObject creatJson(String e, Variable_form s) {

        JSONArray aattr = new JSONArray();

        s.attributes.forEach(a -> {
            JSONObject jattr = new JSONObject();
            jattr.put("name", a.getName());
            jattr.put("type", a.getType());
            aattr.add(jattr);

        });

        JSONObject jvar = new JSONObject();
        jvar.put("isImperative", s.isImperative);
        jvar.put("attributes", aattr);


        JSONObject json = new JSONObject();
        json.put("Variable_form", jvar);
        json.put("DataType", e);

        return json;
    }

    /**
     * update the json file every time we make change to the GLOBAL_ARRAY
     */
    public static void updateDataTypeFile() throws FileNotFoundException {


        JSONArray array = new JSONArray();
        GLOBAL_ARRAY.forEach((e, s) -> {

            array.add(creatJson(e, s));

        });

        try (FileWriter file = new FileWriter(JSON_FILE_NAME)) {

            file.write(String.valueOf(array));
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * clear all DataTypes without the imperetives DataTypes
     */
    public static void clearDataTypeTables() throws IOException, ParseException, TableDeclearedException {


        JSONArray array = new JSONArray();
        GLOBAL_ARRAY.forEach((e, s) -> {
            if (s.isImperative) {
                array.add(creatJson(e, s));
            }
        });

        try (FileWriter file = new FileWriter(JSON_FILE_NAME)) {

            file.write(String.valueOf(array));
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        GLOBAL_ARRAY=new HashMap<String, Variable_form>();

        loadDataTypeFile();
    }

    /**
     * remove a DT unless it's an imperitive
     */
    public static void removeDT(String data_type) throws FileNotFoundException {

        GLOBAL_ARRAY.remove(data_type);
        updateDataTypeFile();

    }

    public static void addDataType(String DT, Variable_form variables) throws TableDeclearedException, FileNotFoundException {
        set_DT(DT, variables);
        updateDataTypeFile();
    }

    public static String printDataType(String DT) {
        return GLOBAL_ARRAY.get(DT).toString();

    }

    public static void printDataTypes() {

        GLOBAL_ARRAY.forEach((e, s) -> {
            System.out.println(printDataType(e));

        });
    }


    /*
    for an undeclared Table*/
    public static class DataTypeNotFoundException extends ClassNotFoundException {
        DataTypeNotFoundException(String s) {
            super(s);
        }
    }

    /*
    for an already decleard Table*/
    public static class TableDeclearedException extends Exception {
        TableDeclearedException(String s) {
            super(s);
        }
    }
}

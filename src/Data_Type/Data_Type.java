package Data_Type;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Data_Type implements Serializable {
    private static Map<String, Variable_form> GLOBAL_ARRAY = new HashMap<>();
    private static final String JSON_FILE_NAME = "./assets/DATA_TYPE.json";

    /**
     * add DT to the GLOBAL_ARRAY
     */
    public static void set_DT(String DT, Variable_form variables) throws Data_Type.TableDeclaredException, FileNotFoundException {
        if (isDT(DT)) throw new Data_Type.TableDeclaredException(DT + "is laready decleared");
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
            return GLOBAL_ARRAY.get(DT);
        throw new Data_Type.DataTypeNotFoundException(DT);
    }
    //TODO: make our Data_Type read from json file by the startup of the program

    /**
     * read from json file that store our imparitive and Tables
     *
     * @throws Exception if we can't find our file
     */
    public static void loadDataTypeFile() throws IOException, ParseException {

        Object obj = new JSONParser().parse(new FileReader(JSON_FILE_NAME));

        JSONArray jsonarr = (JSONArray) obj;

        jsonarr.forEach(e -> {

            try {

                JSONObject json = (JSONObject) e;
                JSONObject filevar = (JSONObject) json.get("Variable_form");
                boolean isImperative = (Boolean) filevar.get("isImperative");
                String Delimiter = null;
                String HDFSPath = null;
                if (!isImperative) {
                    Delimiter = (String) filevar.get("Delimiter");
                    HDFSPath = (String) filevar.get("HDFSPath");
                }
                JSONArray vararr = (JSONArray) filevar.get("attributes");
                List<Attribute_form> attributes = new ArrayList<>();
                vararr.forEach(x -> {
                    JSONObject fileattr = (JSONObject) x;
                    attributes.add(new Attribute_form(fileattr.get("name").toString(), fileattr.get("type").toString()));
                });
                Variable_form vari = new Variable_form(attributes, isImperative, Delimiter, HDFSPath);
                Data_Type.set_DT((String) json.get("DataType"), vari);
            } catch (Data_Type.TableDeclaredException e1) {
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
        jvar.put("isImperative", s.isImperative());
        if (!s.isImperative()) {
            jvar.put("Delimiter", s.getDelimiter());
            jvar.put("HDFSPath", s.getHDFSPath());
        }
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
    public static void clearDataTypeTables() throws IOException, ParseException, Data_Type.TableDeclaredException {


        JSONArray array = new JSONArray();
        GLOBAL_ARRAY.forEach((e, s) -> {
            if (s.isImperative()) {
                array.add(creatJson(e, s));
            }
        });

        try (FileWriter file = new FileWriter(JSON_FILE_NAME)) {

            file.write(array.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        GLOBAL_ARRAY = new HashMap<String, Variable_form>();

        loadDataTypeFile();
    }

    /**
     * remove a DT unless it's an imperitive
     */
    public static void removeDT(String data_type) throws FileNotFoundException {

        GLOBAL_ARRAY.remove(data_type);
        updateDataTypeFile();

    }

    public static void addDataType(String DT, Variable_form variables) throws Data_Type.TableDeclaredException, FileNotFoundException {
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

    public static boolean isImperative(String DT) {
        return GLOBAL_ARRAY.get(DT).isImperative();
    }

    public static String getHDFSPath(String dataType) {
        return GLOBAL_ARRAY.get(dataType).getHDFSPath();
    }

    public static String getDelimiter(String dataType) {
        return GLOBAL_ARRAY.get(dataType).getDelimiter();
    }

    public static boolean checkIfItAttributes(String data_type, String attributeName) {
        return GLOBAL_ARRAY.get(data_type).isAttribute(attributeName);
    }

    /*
    for an undeclared Scope*/
    public static class DataTypeNotFoundException extends ClassNotFoundException {
        public DataTypeNotFoundException(String DT) {
            super(DT + " dataType is not found");
        }
    }

    /*
    for an already decleard Scope*/
    public static class TableDeclaredException extends Exception {
        TableDeclaredException(String s) {
            super(s);
        }
    }
}
package Data_Type;

import java.io.*;
import java.util.*;

public class Data_Type implements Serializable {
    private static Map<String, Variables> GLOBAL_ARRAY = new HashMap<>();
    private static List<String> MAIN_DATA_TYPE = new ArrayList<>();

    //TODO : check if all details are existed at the end

    //insert new Data Type
    public static void set_DT(String name, Variables obj) {
        GLOBAL_ARRAY.put(name, obj);
//        fillVariables(obj);
    }

    public static void setMainDT() {
        set_DT("int",new Variables(new Variable_DT("int","int")));
        set_DT("real",new Variables(new Variable_DT("real","real")));
        set_DT("string",new Variables(new Variable_DT("string","string")));
        set_DT("boolean",new Variables(new Variable_DT("boolean","boolean")));
    }


    public static void set_DT(String DT_name, Variable_DT...args){
        GLOBAL_ARRAY.put(DT_name,new Variables(args));
    }

    // Auto fill the have objects
//    private static Variables fillVariables(Variables variables){
//        Variables result = new Variables();
//        for (Variable_DT variable: variables.getVARIABLES()) {
//            if(!isMainDT(variable.getType())){
//                if(isDT(variable.getType())){
////                    variable.setDetails(GLOBAL_ARRAY.get(variable.getType()));
//                   result= fillVariables(GLOBAL_ARRAY.get(variable.getType()));
//                }else{
//                    ///TODO : throw Exception
//                }
//
//            }
//        }
//        return result;
//    }

    private static boolean isMainDT(String type){
        return MAIN_DATA_TYPE.indexOf(type) >=0;
    }

    private static boolean isDT(String type){
        return GLOBAL_ARRAY.getOrDefault(type,null)!=null;
    }

    static public Variables get_DT(String name) {
        return (Variables) GLOBAL_ARRAY.get(name);
    }

    private static void flat_DT(Variables flatten_object, Variables variables, String parent) {
        for (Variable_DT v : variables.getVARIABLES()) {
            if (v.getDetails() == null)
                flatten_object.addVariable(new Variable_DT(parent + "_" + v.getName(), v.getType()));
            else
                flat_DT(flatten_object, v.getDetails(), parent + "_" + v.getName());
        }
    }

    static Variables flat_DT(String name) {
        //this should return a one flat of data
        Variables flatten_object = new Variables();
        Variables target = GLOBAL_ARRAY.get(name);
        for (Variable_DT variable : target.getVARIABLES()) {
            if (variable.getDetails() == null) {
                flatten_object.addVariable(variable);
            } else {
                flat_DT(flatten_object, variable.getDetails(), variable.getName());
            }
        }
        return flatten_object;
    }

    static void load_formatter(String fileName) throws IOException, ClassNotFoundException {
        //this should load and transfer the data from the json format to the default format
        //TODO : input : file_name of json file in source '../STORED-DT', output : load HashMap<string,DTDetail> object
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);

        // Method for deserialization of object
        GLOBAL_ARRAY = (HashMap<String, Variables>) in.readObject();
        in.close();
        file.close();
    }

    static void save_formatter(String fileName) throws IOException {
        //TODO : input : GLOBAL_ARRAY, output : json_text
//        String file_name;
//        //this should return a json format of our GLOBAL_ARRAY
//        return "";
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(GLOBAL_ARRAY);

        out.close();
        file.close();
    }

    public static void show(String DTname){
        if(get_DT(DTname)!=null)
            get_DT(DTname).show();
        else
            System.out.println("not found");
    }

    public static void setMainDT(String[] strings) {
        MAIN_DATA_TYPE = Arrays.asList(strings);
    }
}

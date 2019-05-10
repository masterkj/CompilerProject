package codgen.row_functions;

import java.util.ArrayList;

public class Substr implements RowFunction {
    private String param1, param2;
    public Substr(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    @Override
    public ArrayList<String> flat(ArrayList<String> values) {
        ArrayList<String> result = new ArrayList<>();
        values.forEach(e-> {
            result.add(e.substring(Integer.parseInt(this.param1), Integer.parseInt(this.param2)));
        });
        return result;
    }


}

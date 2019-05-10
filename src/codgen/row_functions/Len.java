package codgen.row_functions;

import java.util.ArrayList;

public class Len implements RowFunction {
    @Override
    public ArrayList<String> flat(ArrayList<String> values) {
        ArrayList<String> result = new ArrayList<>();

        values.forEach(e-> {
            result.add(String.valueOf(e.length()));
        });
        return result;
    }
}

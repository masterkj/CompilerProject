package codgen.reducers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mode implements AggregationFunction{

    String mode;

    @Override
    public String reduce(ArrayList<String> values) {

        HashMap<String, Integer> repeats=new HashMap<>();

        values.forEach(v->{
            if(repeats.containsKey(v))
                repeats.put(v,repeats.get(v)+1);
            else
                repeats.put(v,1);
        });

        int max=Collections.max(repeats.values());
        for (Map.Entry<String, Integer> entry : repeats.entrySet()) {
            String s = entry.getKey();
            int d = entry.getValue();
            if (d == max) {
                mode = s;
                break;
            }
        }
        return mode;
    }
}

package codgen.reducers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mode implements AggregationFunction{

    String mode;

    @Override
    public String reduce(ArrayList<String> values) {

        HashMap<String, Double> repeats=new HashMap<>();

        values.forEach(v->{
            if(repeats.containsKey(v))
                repeats.put(v,repeats.get(v)+1);
        });

        double max=Collections.max(repeats.values());
        for (Map.Entry<String, Double> entry : repeats.entrySet()) {
            String s = entry.getKey();
            Double d = entry.getValue();
            if (d == max) {
                mode = s;
                break;
            }
        }
        return mode;
    }
}

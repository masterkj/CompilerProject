package codgen.reducers;

import java.util.ArrayList;

public class Min implements AggregationFunction {
    @Override
    public String reduce(ArrayList<String> values) {
        Integer Min = 1000000000;
        ArrayList<Integer> integerValues = new ArrayList<>();
        values.forEach(e->integerValues.add(Integer.parseInt(e)));

        for(Integer value : integerValues)
            if(Min> value)
                Min = value;
        return String.valueOf(Min);
    }
}

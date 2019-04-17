package codgen.reducers;

import java.util.ArrayList;

public class Sum implements AggregationFunction {
    @Override
    public String reduce(ArrayList<String> values) {
        Integer sum = 0;
        ArrayList<Integer> integerValues = new ArrayList<>();

        values.forEach(e->integerValues.add(Integer.parseInt(e)));

        for(Integer value : integerValues)
            sum+=value;

        return String.valueOf(sum);
    }
}

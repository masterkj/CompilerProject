package codgen.reducers;

import java.util.ArrayList;

public class Avg implements AggregationFunction {
    @Override
    public String reduce(ArrayList<String> values) {
        Double sum = 0.0;
        ArrayList<Double> integerValues = new ArrayList<>();
        values.forEach(e->integerValues.add(Double.parseDouble(e)));

        for(Double value : integerValues)
            sum+=value;
        return String.valueOf(sum/values.size());
    }
}

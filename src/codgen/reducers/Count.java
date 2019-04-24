package codgen.reducers;

import java.util.ArrayList;

public class Count implements AggregationFunction {
    @Override
    public String reduce(ArrayList<String> values) {
        return String.valueOf(values.size());
    }
}

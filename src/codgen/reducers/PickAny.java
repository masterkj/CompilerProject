package codgen.reducers;

import java.util.ArrayList;

public class PickAny implements AggregationFunction {
    @Override
    public String reduce(ArrayList<String> values) {
        return values.get(0);
    }
}

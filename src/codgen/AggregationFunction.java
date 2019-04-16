package codgen;

import java.util.ArrayList;

public interface AggregationFunction {
    String reduce(ArrayList<String> values);
}

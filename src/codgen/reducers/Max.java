package codgen.reducers;

import java.util.ArrayList;

public class Max implements AggregationFunction {
    @Override
    public String reduce(ArrayList<String> values) {
        Integer Max = -1000000000;
        ArrayList<Integer> integerValues = new ArrayList<>();
        values.forEach(e->integerValues.add(Integer.parseInt(e)));

        for(Integer value : integerValues)
            if(Max< value)
                Max = value;
        return String.valueOf(Max);
    }
}

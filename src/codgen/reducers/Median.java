package codgen.reducers;

import java.util.ArrayList;
import java.util.Collections;

public class Median implements AggregationFunction {

    @Override
    public String reduce(ArrayList<String> values) {

        Collections.sort(values);

        if(values.size()%2!=0)
            return values.get((values.size()/2));

        double median=Double.parseDouble(values.get((values.size()/2)-1))+Double.parseDouble(values.get(values.size()/2));
        median/=2;

        return Double.toString(median);


    }
}

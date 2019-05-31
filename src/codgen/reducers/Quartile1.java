package codgen.reducers;

import java.util.ArrayList;
import java.util.Collections;

public class Quartile1 implements AggregationFunction{
    @Override
    public String reduce(ArrayList<String> values) {

        Collections.sort(values);

        if(values.size()==1)
            return values.get(0);

        int mid=values.size()/2;

        if(mid%2!=0)
            return values.get((mid/2));
        double quartile1=Double.parseDouble(values.get((mid/2)-1))+Double.parseDouble(values.get(mid/2));
        quartile1/=2;

        return String.valueOf(quartile1);
    }
}

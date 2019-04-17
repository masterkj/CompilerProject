package codgen.reducers;

import java.util.ArrayList;

public interface AggregationFunction {
    String reduce(ArrayList<String> values);

    static AggregationFunction choseReducer(String aggregationFunctionName){
        if(aggregationFunctionName.equals("sum"))
            return new Sum();
        if(aggregationFunctionName.equals("avg"))
            return new Avg();
        return null;
    }
}

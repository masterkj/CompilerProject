package codgen.reducers;

import java.util.ArrayList;

public interface AggregationFunction {
    String reduce(ArrayList<String> values);

    static AggregationFunction choseReducer(String aggregationFunctionName){
        if(aggregationFunctionName.equals("sum"))
            return new Sum();
        if(aggregationFunctionName.equals("avg"))
            return new Avg();
        if(aggregationFunctionName.equals("min"))
            return new Min();
        if(aggregationFunctionName.equals("max"))
            return new Max();
        if(aggregationFunctionName.equals("count"))
            return new Count();
        if(aggregationFunctionName.equals("median"))
            return new Median();
        if(aggregationFunctionName.equals("mode"))
            return new Mode();
        if(aggregationFunctionName.equals("Q1"))
            return new Quartile1();
        if(aggregationFunctionName.equals("Q3"))
            return new Quartile3();
        if(aggregationFunctionName.equals("std"))
            return new Standard_Deviation();
        return null;
    }
}

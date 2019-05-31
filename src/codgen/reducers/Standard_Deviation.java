package codgen.reducers;

import java.util.ArrayList;

public class Standard_Deviation implements AggregationFunction{

    double sum=0;

    @Override
    public String reduce(ArrayList<String> values) {

        double avg= Double.parseDouble(new Avg().reduce(values));

        values.forEach(v->{
            sum+=Math.pow(Double.parseDouble(v)-avg,2);
        });
        sum/=values.size()-1;
        sum=Math.sqrt(sum);

        return Double.toString(sum);
    }
}

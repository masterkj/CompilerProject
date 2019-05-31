package codgen.reducers;

import java.util.ArrayList;

public class Quartile3 implements AggregationFunction{
    @Override
    public String reduce(ArrayList<String> values) {

        if(values.size()==1)
            return values.get(0);

        boolean odd=values.size()%2!=0;

        int mid=values.size()/2;

        if(mid%2!=0) {
            if (odd)
                return values.get((mid / 2) + mid + 1);
            return values.get((mid / 2) + mid );
        }
        if(odd){
            double quartile3=Double.parseDouble(values.get((mid/2)+mid))+Double.parseDouble(values.get((mid/2)+mid+1));
            quartile3/=2;

            return String.valueOf(quartile3);

        }

        double quartile3=Double.parseDouble(values.get((mid/2)+mid-1))+Double.parseDouble(values.get((mid/2)+mid));
        quartile3/=2;

        return Double.toString(quartile3);
    }
}

package codgen.row_functions;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Round implements RowFunction {

    private int degree;


    public Round() {
        this.degree = 0;

    }

    public Round(String degree) {
        this.degree = Integer.parseInt(degree);
    }

    @Override
    public ArrayList<String> flat(ArrayList<String> values) {

        ArrayList<String> result = new ArrayList<>();
        values.forEach(e -> {
            double number = Double.parseDouble(e);
            if (degree == 0)
                result.add(String.valueOf(Math.round(number)));
            else if (degree > 0)
                result.add(String.valueOf((Math.round((number * Math.pow(10, degree)) / Math.pow(10, degree)))));
            else {
                String fraction=String.valueOf(fractionalPart(number));
                int num = (int) (number/Math.pow(10,degree));
                char up = fraction.charAt(fraction.indexOf(".")+1);
                if(((int)up)>=5)
                    num++;
                num*=Math.pow(10,degree);
                result.add(String.valueOf(num));
            }
        });

        return result;
    }


    public double fractionalPart(double number) {

        int decimal = (int) number;
        double fractional = (number - decimal) * Math.pow(10, degree);
        int decimal2 = (int) fractional;
        return fractional - decimal2;
    }

}

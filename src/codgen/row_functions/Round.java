package codgen.row_functions;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class Round implements RowFunction {

    private String degree;
    private String factor = "0";

    public Round() {
        this.degree = "0";
        this.factor = "0";
    }

    public Round(String degree) {
        this.degree = degree;
    }

    public Round(String degree, String factor) {
        this.degree = degree;
        this.factor = factor;
    }

    @Override
    public ArrayList<String> flat(ArrayList<String> values) {

        ArrayList<String> result = new ArrayList<>();
        values.forEach(e -> {
            double number = Float.parseFloat(e);
            double factor=Double.parseDouble(this.factor);
            double degree =Double.parseDouble(this.degree);
            if (factor == 0)
                if (degree == 0)
                    result.add(String.valueOf(Math.ceil(number)));
                else if (degree > 0) {
                    result.add(String.valueOf((Math.ceil((number * Math.pow(10, degree)) / Math.pow(10, degree)) + fractionalPart(number))));
                } else {
                }
            else if (factor == 1)
                if (degree == 0)
                    result.add(String.valueOf(Math.floor(number)));
                else if (degree > 0) {
                    result.add(String.valueOf((Math.floor((number * Math.pow(10, degree)) / Math.pow(10, degree)) + fractionalPart(number))));
                } else {


                }
                else
                    throw new InvalidParameterException();
        });

        return result;
    }


    public double fractionalPart(double number) {

        double degree=Double.parseDouble(this.degree);
        int decimal = (int) number;
        double fractional = (number - decimal) * Math.pow(10, degree);
        int decimal2 = (int) fractional;
        return fractional - decimal2;
    }

}

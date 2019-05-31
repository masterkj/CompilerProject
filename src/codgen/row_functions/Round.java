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
            float number = Float.parseFloat(e);
            if (degree == 0)
                result.add(String.valueOf(Math.round(number)));
            else if (degree > 0) {
              /*  System.out.println("number : "+ number );
                System.out.println("\tmult : "+number*Math.pow(10.0,degree));
                System.out.println("\tround: "+Math.round(number*Math.pow(10.0,degree)));
                System.out.println("\tdive : "+Math.round((number * Math.pow(10.0, degree)) / Math.pow(10.0, degree)));*/
                result.add(Double.toString(Math.round((number * Math.pow(10.0, degree)) / (float) Math.pow(10.0, degree))));
            }else {
                String fraction=String.valueOf(fractionalPart(number));
                int num = (int) (number/Math.pow(10.0,degree));
                char up = fraction.charAt(fraction.indexOf(".")+1);
                if(((int)up)>=5)
                    num++;
                num*=Math.pow(10.0,degree);
                result.add(Double.toString(num));
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

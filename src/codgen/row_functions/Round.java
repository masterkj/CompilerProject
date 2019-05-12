package codgen.row_functions;

import java.util.ArrayList;

public class Round implements RowFunction {

    private int degree;
    private int factor=0;
    public Round(int degree){
        this.degree=degree;
    }

    public Round(int degree,int factor){
        this.degree=degree;
        this.factor=factor;
    }

    @Override
    public ArrayList<String> flat(ArrayList<String> values) {

        ArrayList<String> result = new ArrayList<>();
        values.forEach(e-> {
            double number=Float.parseFloat(e);
            if(factor==0)
                if(degree==0)
                    result.add(String.valueOf(Math.ceil(number)));
                else if(degree>0) {
                    result.add(String.valueOf((Math.ceil((number*Math.pow(10,degree))/Math.pow(10,degree))+fractionalPart(number))));
                }else
                {}
                else
            if(degree==0)
                result.add(String.valueOf(Math.floor(number)));
            else if(degree>0) {
                result.add(String.valueOf((Math.floor((number*Math.pow(10,degree))/Math.pow(10,degree))+fractionalPart(number))));
            }else {


            }

        });

        return result;
    }


    public double fractionalPart(double number){

    int decimal=(int) number;
    double fractional=(number-decimal)*Math.pow(10,degree);
    int decimal2=(int) fractional;
    return fractional-decimal2;
    }

}

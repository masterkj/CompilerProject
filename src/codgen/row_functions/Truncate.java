package codgen.row_functions;

import java.util.ArrayList;

public class Truncate implements RowFunction {


    int degree;

    public Truncate(String degree) {
        this.degree = Integer.parseInt(degree);
    }
    @Override
    public ArrayList<String> flat(ArrayList<String> values) {
        ArrayList<String> result = new ArrayList<>();
        values.forEach(e -> {
            if(degree==0)
                result.add(e.substring(0,e.indexOf(".")));
            else if(degree>0)
                result.add(e.substring(0,e.indexOf(".")+(int)degree+1));
            else {
                String res=e.substring(0,e.indexOf("."));
                char[] temp=res.toCharArray();
                int index=res.length();
                int i=degree;
                while (i!=0){
                    temp[i]='0';
                }
                result.add(String.valueOf(temp));
            }
        });
        return null;
    }
}

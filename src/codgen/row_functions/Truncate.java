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
            if (degree == 0)
                if (e.contains("."))
                    result.add(e.substring(0, e.indexOf(".")));
                else
                    result.add(e);

            else if (degree > 0)
                if (e.contains("."))
                    result.add(e.substring(0, e.indexOf(".") + (int) degree + 1));
                else
                    result.add(e);
            else {
                String res ;
                if (e.contains("."))
                    res = e.substring(0, e.indexOf("."));
                else
                    res = e;
                char[] temp = res.toCharArray();
                int index = res.length();
                int i = degree;
                while (i < 0) {
                    temp[temp.length - i] = '0';
                    i++;
                }
                result.add(String.valueOf(temp));
            }

        });
        return result;
    }
}

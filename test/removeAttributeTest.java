public class removeAttributeTest {
    public static void main(String[] args) {
        String line = "sdf,2354,234,sdfgf,ett";
        System.out.println(rmAttribute(line,",",4));
    }

    private static String rmAttribute(String line, String delimiter, int rmIndex) {
        if (rmIndex == 0) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == delimiter.charAt(0)) {
                    line = line.substring(i + 1);
                    break;
                }
            }
        } else {
            int index = 0;
            int begin = 0;
            int end = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == delimiter.charAt(0)) {
                    index++;
                    if (index == rmIndex)
                        begin = i;
                    if (index > rmIndex) {
                        end = i;
                        break;
                    }
                }
            }

            if (begin < end)
                line = line.substring(0, begin) + line.substring(end);
            else
                line = line.substring(0, begin);
        }

        return line;
    }
}

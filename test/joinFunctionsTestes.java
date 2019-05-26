import codgen.Join;

public class joinFunctionsTestes {
    public static void main(String[] args) {
        String line = "ww|eeee|tt|yy";
        System.out.println(getCol(line,0,"|"));
    }

    public static String getCol(String line, int colIndex, String delimiter) {
        //get the charIndex of the colIndex
        int currentIndex = 0;
        int beginIndex = 0;
        for (beginIndex = 0; beginIndex < line.length(); beginIndex++) {
            if (currentIndex == colIndex)
                break;
            if (line.charAt(beginIndex) == delimiter.charAt(0))
                currentIndex++;


        }
        int endChar;
        for (endChar = beginIndex; endChar < line.length(); endChar++) {
            if (line.charAt(endChar) == delimiter.charAt(0)) {
                break;
            }
        }
        return line.substring(beginIndex, endChar);
    }
}

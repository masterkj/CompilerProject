public class getColTest {
    public static void main(String[] args) {
        String row="124,23d,g,h,,j,k,,,s";

        System.out.println("col : " +getCol(row,0,","));
        System.out.println("col : " +getCol(row,2,","));
        System.out.println("col : " +getCol(row,3,","));
        System.out.println("col : " +getCol(row,4,","));
        System.out.println("col : " +getCol(row,6,","));
        System.out.println("col : " +getCol(row,8,","));
        System.out.println("col : " +getCol(row,9,","));
    }
    public static String getCol(String line, int colIndex, String delimiter) {
        //get the charIndex of the colIndex
        int currentIndex = 0;
        int beginIndex ;
        for (beginIndex = 0; beginIndex < line.length(); beginIndex++) {
            if (currentIndex == colIndex)
                break;
            if (line.charAt(beginIndex) == delimiter.charAt(0))
                currentIndex++;


        }
        int endChar;
        for (endChar = beginIndex; endChar < line.length(); endChar++) {
            if (line.charAt(endChar) == delimiter.charAt(0))
                break;
        }

        return line.substring(beginIndex, endChar);
    }
}

import java.util.Scanner;

public class MoreMultiplication {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        while (first != 0 && second != 0) {
            int result = first * second;

            String firstStr = first + "";
            String secStr = second + "";
            String resStr = result + "";
            int[][] multiple = new int[secStr.length()][firstStr.length()];

            String resSub1 = "";
            String resSub2 = resStr.substring(resStr.length() - firstStr.length());
            int startingPoint = -1;

            boolean flag = false;

            if (resStr.length() > firstStr.length()) {
                resSub1 = resStr.substring(0, resStr.length() - firstStr.length());
            }

            if (resSub1 != "") {
                startingPoint = secStr.length() - resSub1.length();
            }

            // Calculating the individual boxes first
            for (int i = 0; i < secStr.length(); i++) {
                for (int j = 0; j < firstStr.length(); j++) {
                    int calc = Character.getNumericValue(secStr.charAt(i)) * Character.getNumericValue(firstStr.charAt(j));
                    multiple[i][j] = calc;
                }
            }

            String border = createBorder(firstStr);
            String boxBorder = createBoxBorder(firstStr); // Create the division for each box section
            String secondLine = createSecLine(firstStr); // Include the first number

            // Printing out the output
            System.out.println(border);
            System.out.println(secondLine);

            for (int i = 0; i < secStr.length(); i++) {
                System.out.println(boxBorder);
                printTop(multiple[i], flag);
                printMiddle(secStr.charAt(i), firstStr.length());
                
                if (startingPoint <= i && startingPoint != -1) {
                    printBottomAns(multiple[i], secStr, i - startingPoint, resSub1);
                    flag = true;
                } else {
                    // Print the bottom line without the ans
                    printBottom(multiple[i], secStr);
                }
            }

            System.out.println(boxBorder);
            printSub2(resSub2, flag);
            System.out.println(border);

            first = sc.nextInt();
            second = sc.nextInt();
        }
    }

    public static String createBorder(String str) {
        String result = "+";

        int counter = 3 + 4 * str.length();
        for (int i = 0; i < counter; i++) {
            result += "-";
        }

        result += "+";

        return result;
    }

    public static String createSecLine(String str) {
        String result = "|   ";
        String blanks = "   ";

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += blanks;
        }

        result += "|";
        return result;
    }

    public static String createBoxBorder(String str) {
        String result = "| ";
        String template = "+---";

        for (int i = 0; i < str.length(); i++) {
            result += template;
        }

        result += "+ |";
        return result;
    }

    public static void printTop(int[] num, boolean flag) {
        String result = "|";

        if (flag) {
            result += "/";
        } else {
            result += " ";
        }

        for (int i = 0; i < num.length; i++) {
            result += "|";
            int currNum = num[i];

            if (currNum < 9) {
                result += "0";
            } else {
                result += (currNum / 10);
            }

            result += " /";
        }

        result += "| |";
        System.out.println(result);
    }

    public static void printMiddle(char mid, int firstLen) {
        String result = "| ";

        for (int i = 0; i < firstLen; i++) {
            result += "| / ";
        }

        result += "|";
        result += mid;
        result += "|";
        System.out.println(result);
    }
    
    public static void printBottomAns(int[] num, String str, int counter, String sub) {
        String result = "|";

        result += sub.charAt(counter);

        for (int i = 0; i < num.length; i++) {
            result += "|/ ";
            result += (num[i] % 10);
        }

        result += "| |";
        System.out.println(result);
    }

    // This function is without the ans
    public static void printBottom(int[] num, String str) {
        String result = "| ";

        for (int i = 0; i < num.length; i++) {
            result += "|/ ";
            result += (num[i] % 10);
        }

        result += "| |";
        System.out.println(result);
    }

    public static void printSub2(String resSub2, boolean flag) {
        String result = "|";
        
        if (flag) {
            result += "/";
        } else {
            result += " ";
        }

        for (int i = 0; i < resSub2.length(); i++) {
            result += " ";
            result += resSub2.charAt(i);
            result += " ";

            if (i != resSub2.length() - 1) {
                result += "/";
            } else {
                result += " ";
            }
        }

        result += "  |";

        System.out.println(result);
    }
}

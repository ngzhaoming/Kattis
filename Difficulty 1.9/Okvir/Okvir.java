import java.util.Scanner;

public class Okvir {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();

        int top = sc.nextInt();
        int left = sc.nextInt();
        int right = sc.nextInt();
        int bottom = sc.nextInt();

        int height = top + n + bottom;
        int width = left + len + right;

        int last = top + n;
        
        for (int i = 0; i < height; i++) {
            String currString = "";
            char currChar = getChar(i);

            if (i < top || i >= last) {
                for (int j = 0; j < width; j++) {
                    currString += currChar;
                    currChar = toggle(currChar);
                }
            } else {
                // This is the middle part
                for (int j = 0; j < left; j++) {
                    currString += currChar;
                    currChar = toggle(currChar);
                }

                currString += sc.next();
                for (int j = 0; j < len; j++) {
                    currChar = toggle(currChar);
                }

                for (int j = 0; j < right; j++) {
                    currString += currChar;
                    currChar = toggle(currChar);
                }
            }

            System.out.println(currString);
        }
    }

    public static char getChar(int i) {
        return (i % 2 == 0) ? '#' : '.';
    }

    public static char toggle(char i) {
        return (i == '#') ? '.' : '#';
    }
}

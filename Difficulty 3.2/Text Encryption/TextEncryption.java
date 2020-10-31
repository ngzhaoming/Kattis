import java.util.Scanner;
import java.lang.String;

public class TextEncryption {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 0) {
            sc.nextLine();
            String curr = sc.nextLine();
            curr = curr.replaceAll("\\s","");
            curr = curr.toUpperCase();

            char[] arr = new char[curr.length()];
            int length = curr.length();

            int index = 0;
            int start = 1;

            for (int i = 0; i < length; i++) {
                char currChar = curr.charAt(i);
                arr[index] = currChar;
                index = (index + n);

                if (index >= length) {
                    index = start;
                    start++;
                }
            }

            for (int i = 0; i < length; i++) {
                System.out.print(arr[i]);
            }

            System.out.println();

            n = sc.nextInt();
        }
    }
}

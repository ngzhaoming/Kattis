import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class FbiUniversal {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = {2, 4, 5, 7, 8, 10, 11, 13};
        String index = "0123456789ACDEFHJKLMNPRTVWX";

        for (int i = 0; i < n; i++) {
            System.out.print(sc.nextInt() + " ");
            String curr = sc.next();
            char checksum = curr.charAt(8);
            long valCheck = (long) index.indexOf(checksum);
            long baseTen = 0;
            long power = 7;

            long total = 0;
            for (int j = 0; j < curr.length() - 1; j++) {
                char currChar = curr.charAt(j);
                long multiplier = arr[j];

                switch (currChar) {
                    case 'B':
                        currChar = '8';
                        break;
                    
                    case 'G':
                        currChar = 'C';
                        break;

                    case 'I':
                        currChar = '1';
                        break;

                    case 'O':
                        currChar = '0';
                        break;

                    case 'Q':
                        currChar = '0';
                        break;

                    case 'S':
                        currChar = '5';
                        break;

                    case 'U':
                        currChar = 'V';
                        break;

                    case 'Y':
                        currChar = 'V';
                        break;

                    case 'Z':
                        currChar = '2';
                        break;

                    default:
                        break;
                }

                long currVal = (long) index.indexOf(currChar);
                baseTen += (long) (Math.pow(27, power) * currVal);
                power--;
                total += (multiplier * currVal);
            }
            long remain = total % 27;

            if (remain == valCheck) {
                System.out.print(baseTen);
            } else {
                System.out.print("Invalid");
            }

            System.out.println();
        }
    }
}

import java.util.Scanner;

public class ProgressiveScramble {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String order = " abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < n; i++) {
            String curr = sc.nextLine();

            char action = curr.charAt(0);
            String cut = curr.substring(2);
            int[] arr = new int[cut.length()];
            String result = "";

            for (int j = 0; j < cut.length(); j++) {
                char currChar = cut.charAt(j);
                arr[j] = order.indexOf(currChar);
            }

            if (action == 'e') {
                // This is encryption
                int[] addition = new int[cut.length()];
                addition[0] = arr[0];

                for (int j = 1; j < addition.length; j++) {
                    addition[j] = addition[j - 1] + arr[j];
                }

                for (int j = 0; j < addition.length; j++) {
                    int index = (addition[j] % 27);
                    result += order.charAt(index);
                }
            } else {
                // This is decryption
                int[] addition = new int[cut.length()];
                addition[0] = arr[0];

                for (int j = 1; j < addition.length; j++) {
                    addition[j] = (arr[j] - arr[j - 1] + 27) % 27;
                }

                for (int j = 0; j < addition.length; j++) {
                    result += order.charAt(addition[j]);
                }
            }

            System.out.println(result);
        }
    }
}

//For decryption do (curr - prev) % 27

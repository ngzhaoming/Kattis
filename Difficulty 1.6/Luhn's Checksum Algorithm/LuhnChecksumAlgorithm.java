import java.util.Scanner;

public class LuhnChecksumAlgorithm{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String initial = sc.next();
            long total = 0;
            int counter = -1;
            int j = 0;

            if (initial.length() % 2 == 0) counter = 0;
            else counter = 1;

            while (j < initial.length()) {
                char curr = initial.charAt(j);
                int value = Character.getNumericValue(curr);
                if (j == counter) {
                    int newVal = value * 2;
                    if (newVal > 9) {
                        value = (newVal % 10) + (newVal / 10);
                        total += value;
                    } else {
                        total += newVal;
                    }
                    counter += 2;
                } else {
                    total += value;
                }
                j++;
            }

            if (total % 10 == 0) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
    }
}

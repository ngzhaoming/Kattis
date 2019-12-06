import java.util.Scanner;

public class TheEasiestProblem{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int currInt = sc.nextInt();
            if (currInt == 0) {
                break;
            } else {
                int value = countDigits(currInt);
                int counter = 11;
                int totalValue = counter * currInt;
                while (value != countDigits(totalValue)) {
                    counter++;
                    totalValue = counter * currInt;
                }
                System.out.println(counter);
            }
        }
    }

    public static int countDigits(int value) {
        int total = 0;
        while (value > 0) {
            total += value % 10;
            value /= 10;
        }

        return total;
    }
}

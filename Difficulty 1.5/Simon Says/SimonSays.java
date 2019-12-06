import java.util.Scanner;

public class SimonSays{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("Simon") && input[1].equals("says")) {
                for (int j = 2; j < input.length; j++) {
                    if (j != input.length - 1) {
                        System.out.print(input[j] + " ");
                    } else {
                        System.out.print(input[j]);
                    }
                }
                System.out.println();
            }
        }
    }
}

import java.util.Scanner;

public class MathProblem{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int total = sc.nextInt();

        int curr = 0;
        int count = 0;

        for (int i = 0;  i < total /  first + 1; i++) {
            for (int j = 0; j < total / second + 1; j++) {
                for (int k = 0; k < total / third + 1; k++) {
                    curr = i * first + j * second + k * third;
                    if (curr == total) {
                        System.out.println(i + " " + j + " " + k);
                        count++;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("impossible");
        }
    }
}

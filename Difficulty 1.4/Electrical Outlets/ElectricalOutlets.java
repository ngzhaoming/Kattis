import java.util.Scanner;

public class ElectricalOutlets {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int total = sc.nextInt();

            int result = 0;
            for (int j = 0; j < total; j++) {
                result += sc.nextInt();
            }

            result -= (total - 1);
            System.out.println(result);
        }
    }
}

import java.util.Scanner;

public class Relocation{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int q = sc.nextInt();
        int[] companies = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            companies[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int action = sc.nextInt();
            if (action == 1) {
                companies[sc.nextInt()] = sc.nextInt();
            } else {
                System.out.println(Math.abs(companies[sc.nextInt()] - 
                                    companies[sc.nextInt()]));
            }
        }
    }
}

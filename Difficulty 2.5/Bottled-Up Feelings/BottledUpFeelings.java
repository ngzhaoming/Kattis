import java.util.Scanner;

public class BottledUpFeelings{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double total = sc.nextDouble();
        double vol1 = sc.nextDouble();
        double vol2 = sc.nextDouble();
        double diff = vol1 - vol2;
        double amount = total / vol1;
        int amount2 = 0;
        if (amount % 1 != 0) {
            amount = (int) amount + 1;
        }

        double check = amount * vol1;
        while (check != total && amount >= 0) {
            if (check > total) {
                check -= diff;
                amount--;
                amount2++;
            } else {
                check += vol2;
                amount2++;
            }
        }

        if (check == total && amount >= 0 && amount2 >= 0) {
            System.out.println(String.format("%d %d", (int) amount, amount2));
        } else {
            System.out.println("Impossible");
        }
    }
}

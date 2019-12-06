import java.util.Scanner;

public class ProvincesAndGold{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int buyingPower = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt();

        if (buyingPower <= 1) {
            System.out.println("Copper");
        } else if (buyingPower == 2) {
            System.out.println("Estate or Copper");
        } else if (buyingPower <= 4) {
            System.out.println("Estate or Silver");
        } else if (buyingPower == 5) {
            System.out.println("Duchy or Silver");
        } else if (buyingPower <= 7) {
            System.out.println("Duchy or Gold");
        } else if (buyingPower >= 8) {
            System.out.println("Province or Gold");
        }
    }
}

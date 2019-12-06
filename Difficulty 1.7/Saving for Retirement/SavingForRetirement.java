import java.util.Scanner;
import java.lang.Math;

public class SavingForRetirement{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long bobTotal = Math.abs(sc.nextLong() - sc.nextLong()) * sc.nextLong();
        long aliceTotal = 0;
        long aliceAge = sc.nextLong();
        long aliceSavings = sc.nextLong();
        while (aliceTotal <= bobTotal) {
            aliceAge++;
            aliceTotal += aliceSavings;
        }
        System.out.println(aliceAge);
    }
}

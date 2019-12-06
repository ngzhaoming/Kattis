import java.util.Scanner;

public class ShatteredCake{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long width = sc.nextLong();
        long N = sc.nextLong();
        long totalArea = 0;
        for (long i = 0; i < N; i++) {
            totalArea += sc.nextInt() * sc.nextInt();
        }
        System.out.println(totalArea / width);
    }
}

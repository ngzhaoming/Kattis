import java.util.Scanner;
import java.lang.Math;

public class PizzaCrust{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double C = sc.nextDouble();
        double cheese = Math.PI * Math.pow((R - C), 2); 
        double totalArea = Math.PI * Math.pow(R, 2);
        double percentage = cheese / totalArea * 100;
        System.out.println(String.format("%.6f", percentage));
    }
}

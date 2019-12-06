import java.util.Scanner;

public class Spavanac{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int H, M;
        H = sc.nextInt();
        M = sc.nextInt();
        int totalCalc = H * 60 + M - 45;
        String result;

        if (totalCalc < 0) { // 0000 to 2359
            result = 23 + " " + (60 + totalCalc);
        } else {
            result = (totalCalc / 60) + " " + (totalCalc % 60);
        }

        System.out.println(result);
    }
}

import java.util.Scanner;

public class CandleBox{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        int rita = sc.nextInt();
        int theo = sc.nextInt();
        int ritaActual = 0;
        int theoActual = 0;
        int ritaAge = 4;
        int theoAge = ritaAge - diff;
        while (ritaActual + theoActual != rita + theo) {
            ritaActual += ritaAge;
            if (theoAge > 2) {
                theoActual += theoAge;
            }
            ritaAge++;
            theoAge++;
        }
        System.out.println(rita - ritaActual);
    }
}

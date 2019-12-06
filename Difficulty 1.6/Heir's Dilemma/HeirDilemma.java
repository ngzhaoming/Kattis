import java.util.Scanner;

public class HeirDilemma{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long range1 = sc.nextLong(); 
        long range2 = sc.nextLong();
        int counter = 0;
        for (long i = range1; i <= range2; i++) {
            long temp = i;
            boolean flag = true;
            int[] list = new int[10];
            while (temp > 0) {
                int curr = (int) temp % 10;
                if (curr != 0 && list[curr] == 0 && i % curr == 0) {
                    list[curr]++;
                    temp /= 10;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

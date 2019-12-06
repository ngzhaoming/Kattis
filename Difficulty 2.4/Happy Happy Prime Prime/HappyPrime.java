import java.util.Scanner;

public class HappyPrime{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int dataNum = sc.nextInt();
            int num = sc.nextInt();
            if (isPrime(num) && check(num)) {
                System.out.println(String.format("%d %d YES", dataNum, num));
            } else {
                System.out.println(String.format("%d %d NO", dataNum, num));
            }
        }
    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < (num / 2) + 1; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static boolean check(int num) {
        if (num < 10) {
            if (num == 7) {
                return true;
            } else {
                return false;
            }
        } else {
            while (num >= 10) {
                int temp = num;
                int total = 0;
                while (temp > 0) {
                    int remain = temp % 10;
                    total += (remain * remain);
                    temp /= 10;
                }
                num = total;
            }
            if (num == 1 || num == 7) {
                return true;
            } else {
                return false;
            }
        }
    }
}

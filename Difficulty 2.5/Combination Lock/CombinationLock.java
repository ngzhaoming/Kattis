import java.util.Scanner;
import java.lang.Math;

public class CombinationLock{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int start = sc.nextInt();
            int first = sc.nextInt();
            int second = sc.nextInt();
            int third = sc.nextInt();
            if (start == 0 && first == 0 && second == 0 && third == 0) {
                break;
            }

            int degree = 1080;
            degree += addDegreeClockwise(start, first);
            degree += addDegreeAnti(first, second);
            degree += addDegreeClockwise(second, third);
            System.out.println(degree);
        }
    }

    public static int addDegreeClockwise(int start, int end) {
        if (start < end) {
            return (40 - Math.abs(start - end)) * 9;
        } else if (start > end) {
            return (start - end) * 9;
        } else {
            return 0;
        }
    }

    public static int addDegreeAnti(int start, int end) {
        if (start < end) {
            return (end - start) * 9;
        } else if (start > end) {
            return (40 - Math.abs(start - end)) * 9;
        } else {
            return 0;
        }
    }
}

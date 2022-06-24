import java.util.Scanner;

public class zoom{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int interval = sc.nextInt();

        int counter = 0;
        boolean flag = true;

        for (int i = 0; i < total; i++) {
            counter++;
            int curr = sc.nextInt();

            if (counter == interval) {
                if (!flag) {
                    System.out.print(" ");
                    System.out.print(curr);
                } else {
                    System.out.print(curr);
                    flag = false;
                }

                counter = 0;
            }
        }

        System.out.println();
    }
}

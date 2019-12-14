import java.util.Scanner;

public class Kafkaesque {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int total = 1;
        int position = 0;

        int[] queue = new int[n];

        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            queue[i] = curr;
        }

        while (counter < n) {
            int curr = queue[counter];
            if (curr > position) {
                position = curr;
                counter++;
            } else {
                position = 0;
                total++;
            }
        }

        System.out.println(total);
    }
}

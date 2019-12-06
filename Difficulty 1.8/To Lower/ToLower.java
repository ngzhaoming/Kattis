import java.util.Scanner;

public class ToLower{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int counter = 0;
        for (int i = 0; i < m; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                String line = sc.nextLine();
                if (!line.matches("[a-zA-Z][a-z]*")) {
                    flag = false;
                }
            }
            if (flag) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

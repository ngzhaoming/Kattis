import java.util.Scanner;

public class pink {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int total = 0;
        for (int i = 0; i < n; i++) {
            String curr = sc.nextLine().toLowerCase();
            if (curr.contains("pink") || curr.contains("rose")) {
                total++;
            }
        }

        if (total == 0) {
            System.out.println("I must watch Star Wars with my daughter");
        } else {
            System.out.println(total);
        }
    }
}

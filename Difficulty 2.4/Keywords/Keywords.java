import java.util.Scanner;
import java.util.HashSet;

public class Keywords {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hash = new HashSet<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String currString = sc.nextLine();
            currString = currString.toLowerCase();
            currString = currString.replace('-', ' ');

            if (!hash.contains(currString)) {
                hash.add(currString);
            }
        }

        System.out.println(hash.size());
    }
}

import java.util.Scanner;
import java.util.HashSet;

public class Homework {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        String[] str = sc.nextLine().split(";");

        for (int i = 0; i < str.length; i++) {
            String[] curr = str[i].split("-");

            if (curr.length > 1) {
                int start = Integer.parseInt(curr[0]);
                int end = Integer.parseInt(curr[1]);

                for (int j = start; j <= end; j++) {
                    set.add(j);
                }
            } else {
                set.add(Integer.parseInt(curr[0]));
            }
        }

        System.out.println(set.size());
    }
}

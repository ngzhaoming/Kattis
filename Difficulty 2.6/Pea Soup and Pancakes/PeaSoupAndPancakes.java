import java.util.Scanner;
import java.util.TreeSet;

public class PeaSoupAndPancakes{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < n; i++) {
            int items = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            TreeSet<String> mySet = new TreeSet<>();
            for (int j = 0; j < items; j++) {
                String food = sc.nextLine();
                if (food.equals("pea soup") || food.equals("pancakes")) {
                    mySet.add(food);
                }
            }

            if (mySet.size() == 2) {
                System.out.println(name);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Anywhere is fine I guess");
        }
    }
}

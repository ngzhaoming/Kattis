import java.util.Scanner;

public class TowerConstruction {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int base = 0;

        for (int i = 0; i < n; i++) {
            int currBrick = sc.nextInt(); 

            if (i == 0) {
                total++;
                base = currBrick;
            } else {
                //This is not the first brick
                if (currBrick > base) {
                    total++;
                }

                base = currBrick;
            }
        }

        System.out.println(total);
    }
}

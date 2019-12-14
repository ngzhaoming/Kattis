import java.util.Scanner;

public class DrinkingSong {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();

        for (int i = n; i > 0; i--) {
            if (i > 2) {
                System.out.println(i + " bottles of " + word + " on the wall, " 
                    + i + " bottles of " + word + ".\nTake one down, pass it around, " 
                        + (i - 1) + " bottles of " + word + " on the wall.");
                System.out.println();
            } else if (i == 1) {
                System.out.println(i + " bottle of " + word + " on the wall, "
                    + i + " bottle of " + word + ".\nTake it down, pass it around," + 
                    " no more bottles of " + word + ".");
            } else {
                System.out.println(i + " bottles of " + word + " on the wall, " 
                    + i + " bottles of " + word + ".\nTake one down, pass it around, " 
                        + (i - 1) + " bottle of " + word + " on the wall.");
                System.out.println();
            }
        }
    }
}

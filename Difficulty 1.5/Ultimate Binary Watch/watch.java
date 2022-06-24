import java.util.Scanner;
import java.util.HashMap;

public class watch {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> m = new HashMap<>();
        String[] arr = new String[4];
        String time = sc.nextLine();

        m.put(0, "....");
        m.put(1, "*...");
        m.put(2, ".*..");
        m.put(3, "**..");
        m.put(4, "..*.");
        m.put(5, "*.*.");
        m.put(6, ".**.");
        m.put(7, "***.");
        m.put(8, "...*");
        m.put(9, "*..*");

        for (int i = 0; i < time.length(); i++) {
            arr[i] = m.get(Character.getNumericValue(time.charAt(i))); 
        }

        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (j == 2) {
                    System.out.print("  ");
                }

                System.out.print(arr[j].charAt(i));

                if (j < arr.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

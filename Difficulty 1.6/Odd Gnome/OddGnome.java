import java.util.Scanner;

public class OddGnome{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] list = sc.nextLine().split(" ");
            int curr = Integer.parseInt(list[1]); 
            for (int j = 2; j < list.length; j++) {
                int expected = curr + 1;
                int succ = Integer.parseInt(list[j]);
                if (succ != expected) {
                    System.out.println(j);
                } else {
                    curr = succ;
                }
            }
        }
    }
}

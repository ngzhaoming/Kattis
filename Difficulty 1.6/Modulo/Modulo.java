import java.util.Scanner;
import java.util.HashSet;

public class Modulo{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> mySet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            mySet.add(sc.nextInt() % 42);
        }
        System.out.println(mySet.size());
    }
}

import java.util.Scanner;
import java.util.TreeSet;

public class ICPCAwards{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        TreeSet<String> mySet = new TreeSet<>();
        
        while(counter < 12) {
            String school = sc.next();
            String name = sc.next();

            if (!mySet.contains(school)) {
                mySet.add(school);
                System.out.println(school + " " + name);
                counter++;
            }
        }
    }
}

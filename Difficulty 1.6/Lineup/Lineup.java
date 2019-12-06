import java.util.Scanner;

public class Lineup{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 3;
        boolean pattern = true;
        String pat = "";
        String prev = sc.next();
        String curr = sc.next();
        int result = prev.compareTo(curr);
        if (result > 0) {
            pat = "DECREASING";
        } else {
            pat = "INCREASING";
        }
        prev = curr;
        while(pattern && counter <= n) {
            curr = sc.next();
            result = prev.compareTo(curr);
            if (result > 0 && pat.equals("DECREASING")) {
                prev = curr;    
            } else if (result < 0 && pat.equals("INCREASING")) {
                prev = curr;
            } else {
                pattern = false;
            }
            counter++;
        }

        if (pattern) {
            System.out.println(pat);
        } else {
            System.out.println("NEITHER");
        }
    }
}

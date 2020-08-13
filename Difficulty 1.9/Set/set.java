import java.util.Scanner;

public class set {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String[] set = new String[12];

        for (int i = 0; i < 12; i++) {
            set[i] = sc.next();
        }

        boolean gotSet = false;

        for (int i = 0; i < 12; i++) {
            for (int j = i + 1; j < 12; j++) {
                for (int k = j + 1; k < 12; k++) {
                    String c1 = set[i];
                    String c2 = set[j];
                    String c3 = set[k];

                    boolean verdict = check(c1.charAt(0), c2.charAt(0), c3.charAt(0)) && 
                        check(c1.charAt(1), c2.charAt(1), c3.charAt(1)) && 
                        check(c1.charAt(2), c2.charAt(2), c3.charAt(2)) && 
                        check(c1.charAt(3), c2.charAt(3), c3.charAt(3));

                    if (verdict) {
                        System.out.println((i + 1) + " " + (j + 1) + " " + (k + 1));
                        gotSet = true;
                    }
                }
            }
        }

        if (!gotSet) {
            System.out.println("no sets");
        }
    }

    public static boolean check(char c1, char c2, char c3) {
        boolean verdict = false;

        if (c1 == c2 && c2 == c3) {
            verdict = true;
        }

        if (c1 != c2 && c1 != c3 && c2 != c3) {
            verdict = true;
        }

        return verdict;
    }
}

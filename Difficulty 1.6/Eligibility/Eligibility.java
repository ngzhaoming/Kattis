import java.util.Scanner;

public class Eligibility{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String secDate = sc.next();
            String birth = sc.next();
            String[] secondDate = secDate.split("/");
            String[] birthDate = birth.split("/");
            int courses = sc.nextInt();
            if (Integer.parseInt(secondDate[0]) >= 2010) {
                System.out.println(name + " eligible");
            } else if (Integer.parseInt(birthDate[0]) >= 1991) {
                System.out.println(name + " eligible");
            } else if (courses >= 41) {
                System.out.println(name + " ineligible");
            } else {
                System.out.println(name + " coach petitions");
            }
        }
    }
}

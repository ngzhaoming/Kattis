import java.util.Scanner;

public class DetailedDifferences{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String first = sc.next();
            String second = sc.next();
            System.out.println(first);
            System.out.println(second);

            for (int j = 0; j < first.length(); j++) {
                char firstChar = first.charAt(j);
                char secondChar = second.charAt(j);

                if (firstChar == secondChar) {
                    System.out.print(".");
                } else {
                    System.out.print("*");        
                }
            }

            System.out.println();
            System.out.println();
        }
    }
}

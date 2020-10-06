import java.util.Scanner;

public class MatrixInverse {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while(sc.hasNext()) {
            System.out.println("Case " + counter + ":");
            counter++;
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int deter = (a*d) - (b*c);
            sc.nextLine();

            int newD = (d / deter);
            int newB = (-b / deter);
            int newC = (-c / deter);
            int newA = (a / deter);

            System.out.println(newD + " " + newB);
            System.out.println(newC + " " + newA);
        }
    }
}

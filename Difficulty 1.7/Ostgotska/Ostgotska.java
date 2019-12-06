import java.util.Scanner;

public class Ostgotska{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = sc.nextLine().split(" ");
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            String curr = list[i];
            if (curr.matches("[a-z]*(ae)[a-z]*")) {
                counter++;
            }
        }

        double percent = (double) counter / list.length;
        if (percent < 0.4) {
            System.out.println("haer talar vi rikssvenska");
        } else {
            System.out.println("dae ae ju traeligt va");
        }
    }
}

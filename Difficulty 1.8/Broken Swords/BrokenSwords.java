import java.util.Scanner;

public class BrokenSwords{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int broken = sc.nextInt();
        sc.nextLine();

        int top = broken * 2;
        int left = broken * 2;

        for (int i = 0; i < broken; i++) {
            String inpt = sc.nextLine();

            for (int j = 0; j < 4; j++) {
                if (j < 2) {
                    top -= Character.getNumericValue(inpt.charAt(j));
                } else {
                    left -= Character.getNumericValue(inpt.charAt(j));
                }
            }
        }

        int sword = Math.min(top, left) / 2;
        int topVal = top - sword * 2;
        int leftVal = left - sword * 2;

        System.out.println(sword + " " + topVal + " " + leftVal); 
    }
}

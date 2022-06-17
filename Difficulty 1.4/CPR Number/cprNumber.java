import java.util.Scanner;

public class cprNumber {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int total = 0;

        total += Character.getNumericValue(str.charAt(0))*4;
        total += Character.getNumericValue(str.charAt(1))*3;
        total += Character.getNumericValue(str.charAt(2))*2;
        total += Character.getNumericValue(str.charAt(3))*7;
        total += Character.getNumericValue(str.charAt(4))*6;
        total += Character.getNumericValue(str.charAt(5))*5;
        total += Character.getNumericValue(str.charAt(7))*4;
        total += Character.getNumericValue(str.charAt(8))*3;
        total += Character.getNumericValue(str.charAt(9))*2;
        total += Character.getNumericValue(str.charAt(10));

        if (total % 11 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

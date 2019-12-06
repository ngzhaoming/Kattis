import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;

public class Yoda{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String v1 = sc.next();
        String v2 = sc.next();
        String newV1 = "";
        String newV2 = "";
        int min = Math.min(v1.length(), v2.length());
        while (v1.length() != 0 && v2.length() != 0) {
            int val1 = Character.getNumericValue(v1.charAt(v1.length() - 1));
            int val2 = Character.getNumericValue(v2.charAt(v2.length() - 1));
            if (val1 > val2) {
                newV1 = val1 + newV1;
            } else if (val1 == val2) {
                newV1 = val1 + newV1;
                newV2 = val2 + newV2;
            } else {
                newV2 = val2 + newV2;
            }
            v1 = v1.substring(0, v1.length() - 1);
            v2 = v2.substring(0, v2.length() - 1);
        }

        newV1 = v1 + newV1;
        newV2 = v2 + newV2;
        if (newV1.length() == 0) {
            System.out.println("YODA");
        } else {
            System.out.println(Integer.parseInt(newV1));
        }

        if (newV2.length() == 0) {
            System.out.println("YODA");
        } else {
            System.out.println(Integer.parseInt(newV2));
        }
    }
}

import java.util.Scanner;

public class eyeOfSauron {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int left = 0;
        int right = 0;
        boolean isLeft = true;
        
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar == '(') {
                i++;
                isLeft = false;
                continue;
            }

            if (isLeft) {
                left++;
            } else {
                right++;
            }
        }

        if (left == right) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
    }
}

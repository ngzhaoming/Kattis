import java.util.Scanner;

public class Oktalni{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = "";
        for (int i = input.length() - 1; i >= 2; i = i - 3) {
            int total = 0;
            if (input.charAt(i) == '1') {
                total += 1;
            }
            if (input.charAt(i - 1) == '1') {
                total += 2;
            }
            if (input.charAt(i - 2) == '1') {
                total += 4;
            }
            ans = total + ans;
        }
        int remaining = input.length() % 3;
        int remTotal = 0;
        if (remaining == 1) {
            if (input.charAt(0) == '1') {
                remTotal += 1;
            }
        } else if (remaining == 2) {
            if (input.charAt(1) == '1') {
                remTotal += 1;
            }
            if (input.charAt(0) == '1') {
                remTotal += 2;
            }
        }

        if (remTotal > 0) {
            ans = remTotal + ans;
        }
        
        System.out.println(ans);
    }
}

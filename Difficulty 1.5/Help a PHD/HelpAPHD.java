import java.util.Scanner;

public class HelpAPHD{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            char currChar = input.charAt(1);
            if (currChar == '=') {
                System.out.println("skipped");
            } else {
                String[] formula = input.split("[+]");
                System.out.println(Integer.parseInt(formula[0]) +
                                    Integer.parseInt(formula[1]));
            }
        }
    }
}

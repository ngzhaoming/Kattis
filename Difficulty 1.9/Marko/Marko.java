import java.util.Scanner;

public class Marko{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] regex = new String[10];
        regex[2] = "[abc]";
        regex[3] = "[def]";
        regex[4] = "[ghi]";
        regex[5] = "[jkl]";
        regex[6] = "[mno]";
        regex[7] = "[pqrs]";
        regex[8] = "[tuv]";
        regex[9] = "[wxyz]";
        String regExp = "";
        int n = sc.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.next();
        }

        String input = sc.next();
        for (int i = 0; i < input.length(); i++) {
            int val = Integer.parseInt(input.charAt(i) + "");
            regExp += regex[val];
        }

        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].matches(regExp)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

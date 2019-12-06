import java.util.Scanner;

public class SoftPasswords {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String actual = sc.nextLine();
        String typed = sc.nextLine();
        boolean flag = false;

        if (typed.equals(actual)) {
            flag = true;
        } else if (prependCheck(actual, typed)) {
            flag = true;
        } else if (appendCheck(actual, typed)) {
            flag = true;
        } else if (toggleCase(typed).equals(actual)) {
            flag = true;
        } else {
            // empty block
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean prependCheck(String actual, String typed) {
        if (actual.substring(1).equals(typed)  && Character.isDigit(actual.charAt(0))) {
            return true;
        } else {
            return false;
        } 
    }

    public static boolean appendCheck(String actual, String typed) {
        if (actual.substring(0, actual.length() - 1).equals(typed)  && Character.isDigit(actual.charAt(actual.length() - 1))) {
            return true;
        } else {
            return false;
        } 
    }

    public static String toggleCase(String typed) {
        String result = "";
        for (int i = 0; i < typed.length(); i++) {
            char currChar = typed.charAt(i);
            if (Character.isDigit(currChar)) {
                result += currChar;
            } else {
                if (Character.isLowerCase(currChar)) {
                    result += Character.toUpperCase(currChar);
                } else {
                    result += Character.toLowerCase(currChar);
                }
            }
        }

        return result;
    }
}

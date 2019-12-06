import java.util.Scanner;
import java.util.Stack;

public class TheGrandAdventure{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Stack<Character> backpack = new Stack<>();
            boolean flag = true;
            String input = sc.nextLine();
            for(int j = 0; j < input.length(); j++) {
                char currChar = input.charAt(j);
                if (currChar == '$' || currChar == '|' ||
                        currChar == '*') {
                    backpack.push(currChar);
                } else if (currChar == 'b') {
                    if (!backpack.isEmpty()) {
                        char item = backpack.pop();
                        if (item != '$') {
                            flag = false;
                            break;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                } else if (currChar == 't') {
                    if (!backpack.isEmpty()) {
                        char item = backpack.pop();
                        if (item != '|') {
                            flag = false;
                            break;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                } else if (currChar == 'j') {
                    if (!backpack.isEmpty()) {
                        char item = backpack.pop();
                        if (item != '*') {
                            flag = false;
                            break;
                        }
                    } else {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag) {
                if (backpack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}

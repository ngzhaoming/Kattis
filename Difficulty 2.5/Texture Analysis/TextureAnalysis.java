import java.util.Scanner;

public class TextureAnalysis{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equals("END")) {
                break;
            }
            String flag = "EVEN";
            boolean first = true;
            int white = 0;
            int next = 0;
            for (int i = 1; i < input.length(); i++) {
                char currChar = input.charAt(i);
                if (first && currChar == '.') {
                    white++;
                } else if (first) {
                    first = false;
                } else if (currChar == '.') {
                    next++;
                } else {
                    if (next == white) {
                        next = 0;
                    } else {
                        flag = "NOT EVEN";
                    }
                }
            }
            System.out.println(String.format("%d %s", counter, flag));
            counter++;
        }
    }
}

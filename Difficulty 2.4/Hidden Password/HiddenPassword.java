import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HiddenPassword{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        ArrayList<Character> code = new ArrayList<>();
        for (int i = 0; i < input[0].length(); i++) {
            code.add(input[0].charAt(i));
        }

        boolean flag = true;
        for (int i = 0; i < input[1].length(); i++) {
            char currChar = input[1].charAt(i);
            int index = code.indexOf(currChar);
            if (index > 0) {
                flag = false;
                break;
            } else if (index == 0) {
                code.remove(0);
            }
        }

        if (flag) {
            if (code.isEmpty()) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        } else {
            System.out.println("FAIL");
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationEncryption{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = br.readLine()).equals("0")) {
            String[] details = s.split(" ");
            String input = br.readLine();
            String result = "";
            int keyLen = Integer.parseInt(details[0]);
            int add = (input.length() % keyLen);
            int counter = 0;
            if (add > 0) {
                add = keyLen  - add;
                for (int i = 0; i < add; i++) {
                    input += " ";
                }
            }

            while(counter < input.length()) {
                for (int i = 1; i <= keyLen; i++) {
                    int currVal = Integer.parseInt(details[i]) - 1;
                    char currChar = input.charAt(currVal + counter);
                    result += currChar;
                }
                counter += keyLen;
            }
            System.out.println("'" + result + "'");
        }
    }
}

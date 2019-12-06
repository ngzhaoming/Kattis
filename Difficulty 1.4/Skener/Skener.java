import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Skener{
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" "); // Create the column then copy
        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char currChar = s.charAt(i);
                for (int j = 0; j < Integer.parseInt(input[3]); j++) {
                    result += currChar;
                }
            }

            for (int i = 0; i < Integer.parseInt(input[2]); i++) {
                System.out.println(result);
            }
        }
    }
}

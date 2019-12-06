import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChartingProgress{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int length = -1;
        int currTotalStar = 0;
        while ((s = br.readLine()) != null) {
            if (s.isEmpty()) { // set completed reset numbers;
                length =  -1;
                currTotalStar = 0;
                continue;
            } else {
                if (length == -1) { //Have not initialize
                    length = s.length();
                }
    
                String result = "";
                int numStars = 0;
                for (int i = 0; i < s.length(); i++) {
                    char currChar = s.charAt(i);
                    if (currChar == '*') {
                        numStars++;
                    }
                }

                int startDots = length - currTotalStar - numStars;
                for (int i = 0; i < startDots; i++) {
                    result += ".";
                }

                for (int i = 0; i < numStars; i++) {
                    result += "*";
                }

                for (int i = 0; i < currTotalStar; i++) {
                    result += ".";
                }
                currTotalStar += numStars;
                System.out.println(result);
            }
        }
    }
}

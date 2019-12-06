import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class GuessingGame{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int guess = Integer.parseInt(br.readLine());
            boolean flag = true;
            int highest = 10;
            int lowest = 1;
            if (guess == 0) {
                break;
            } else {
                String s;
                while (!(s = br.readLine()).equals("right on")) {
                    if (s.equals("too low") && flag) {
                        lowest = Math.max(guess + 1, lowest);
                    } else if (s.equals("too high") && flag) {
                        highest = Math.min(guess - 1, highest);
                    }

                    if (flag && highest < lowest) {
                        flag = false;
                    }

                    guess = Integer.parseInt(br.readLine());
                }
            }

            if (flag && (guess < lowest || guess > highest)) {
                flag = false;
            }
            
            if (flag) {
                System.out.println("Stan may be honest");
            } else {
                System.out.println("Stan is dishonest");
            }
        }
    }
}

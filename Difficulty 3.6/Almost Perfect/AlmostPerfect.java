import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlmostPerfect{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            long val = Long.parseLong(s);
            long limit = val;
            long total = 1; 
            for (long i = 2; i < limit; i++) {
                if (val % i == 0) {
                    long division = val / i;
                    if (division != i) {
                        total = total + i + division;
                    } else {
                        total += i;
                    }
                }
                limit = val / i;
            }

            if (total == val) {
                System.out.println(val + " perfect");
            } else if (total >= val - 2 && total <= val + 2) {
                System.out.println(val + " almost perfect");
            } else {
                System.out.println(val + " not perfect");
            }
        }
    }
}

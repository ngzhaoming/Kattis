import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class SecretSanta{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double input = Double.parseDouble(br.readLine());
        if (input < 100000) {
            double fac = 1;
            double counter = 2;
            double result = 1;
            while (counter <= input) {
                fac *= counter;
                if (counter % 2 ==  0) {
                    result += (-1 / fac);
                } else {
                    result += (1 / fac);
                }
                counter++;
            }

            System.out.println(String.format("%.8f", result));
        } else {
            System.out.println(0.63212056);
        }
    }
}

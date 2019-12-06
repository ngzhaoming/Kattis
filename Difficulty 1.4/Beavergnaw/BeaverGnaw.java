import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class BeaverGnaw{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            String[] input = s.split(" ");
            double D = Double.parseDouble(input[0]);
            double volEat = Double.parseDouble(input[1]);
            if (D == 0) {
                break;
            }

            double smallD = Math.cbrt((Math.PI * Math.pow(D, 3) - 6 * volEat)
                                / Math.PI);
            System.out.println(String.format("%.9f", smallD));
        }
    }
}

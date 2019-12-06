import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
import java.math.BigInteger;

public class ZebrasAndOcelots{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            animals.add(br.readLine());
        }

        Collections.reverse(animals);

        int val;
        BigInteger total = new BigInteger("0");
        while ((val = animals.indexOf("O")) >= 0) {
            total.add(new BigInteger(Math.pow(2, val) + ""));
            animals.set(val, "Z");
        }
        System.out.println(total);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.math.BigInteger;
import java.util.Iterator;

public class AnagramCounting{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            BigInteger num = fac(s.length());
            HashMap<Character, Integer> myMap = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char currChar = s.charAt(i);
                int val = myMap.getOrDefault(currChar, 0) + 1;
                myMap.put(currChar, val);
            }

            Iterator it = myMap.keySet().iterator();
            BigInteger denom = new BigInteger(1 + "");
            while (it.hasNext()) {
                char next = (char) it.next();
                int val = myMap.get(next);
                if (val > 1) {
                    denom = denom.multiply(fac(val));
                }
            }

            num = num.divide(denom);

            System.out.println(num);
        }
    }

    public static BigInteger fac(int n) {
        BigInteger val = new BigInteger(1 + "");
        for (int i = 2; i <= n; i++) {
            val = val.multiply(new BigInteger(i + ""));
        }
        return val;
    }
}

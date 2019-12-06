import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.Math;

public class JudgingTroubles{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> domMap = new HashMap<>();
        HashMap<String, Integer> katMap = new HashMap<>();
        String s;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            int val = domMap.getOrDefault(s, 0) + 1; 
            domMap.put(s, val);
        }

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            int val = katMap.getOrDefault(s, 0) + 1; 
            katMap.put(s, val);
        }

        Iterator<String> domIt = domMap.keySet().iterator();

        int total = 0;
        while (domIt.hasNext()) {
            String verdict = domIt.next();
            int domVerdict = domMap.get(verdict);
            int katVerdict = 0;
            if (katMap.containsKey(verdict)) {
                katVerdict = katMap.get(verdict);
            }
            total += Math.min(katVerdict, domVerdict);
        }

        System.out.println(total);
    }
}

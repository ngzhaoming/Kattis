import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class VariableArithmetic{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> myMap = new HashMap<>();
        String s;
        while (!(s = br.readLine()).equals("0")) {
            String[] eqn = s.split(" ");
            if (eqn.length >= 3 && eqn[1].equals("=")) {
                myMap.put(eqn[0], Integer.parseInt(eqn[2]));
            } else {
                int total = 0;
                String result = "";
                for (int i = 0; i < eqn.length; i = i + 2) {
                    String curr = eqn[i];
                    if (curr.matches("[0-9]++")) { // This is number
                        total += Integer.parseInt(curr);
                    } else {
                        if (myMap.containsKey(curr)) {
                            int val = myMap.get(curr);
                            total += val;
                        } else {
                            result += curr + " + ";
                        }
                    }
                }

                if (total > 0) {
                    result = total + " + " + result;
                }

                if (result.charAt(result.length() - 2) == '+') {
                    result = result.substring(0, result.length() - 3);
                }
                System.out.println(result);
            }
        }
    }
}

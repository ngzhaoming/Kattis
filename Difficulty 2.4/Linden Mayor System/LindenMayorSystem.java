import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LindenMayorSystem{
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] values = br.readLine().split(" ");
        HashMap<String, String> convert = new HashMap<>();
        int times = Integer.parseInt(values[1]);
        for (int i = 0; i < Integer.parseInt(values[0]); i++) {
            String[] command = br.readLine().split(" -> ");
            convert.put(command[0], command[1]);
        }

        String result = br.readLine();
        for (int i = 0; i < times; i++) {
            for (int j = 0; j < result.length(); j++) {
                String currChar = result.charAt(j) + "";
                if (convert.containsKey(currChar)) {
                    String conversion = convert.get(currChar);
                    int val = conversion.length();
                    result = result.substring(0, j) + conversion + result.substring(j + 1);
                    j = j + val - 1;
                }
            }
        }
        System.out.println(result);
    }
}

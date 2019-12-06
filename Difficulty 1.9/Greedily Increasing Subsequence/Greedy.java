import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] input = br.readLine().split(" ");
        int highest = -100;
        int total = 0;
        String result = "";
        for (int i = 0; i < input.length; i++) {
            int currVal = Integer.parseInt(input[i]);
            if (currVal > highest) {
                highest = currVal;
                total++;
                result += currVal + " ";
            }
        }

        System.out.println(total);
        System.out.println(result.substring(0, result.length() - 1));
    }
}

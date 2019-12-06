import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pivot2{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] numList = new int[len];
        int[] sorted = new int[len];
        for (int i = 0; i < len; i++) {
            int val = Integer.parseInt(input[i]);
            numList[i] = val;
            sorted[i] = val;
        }
        Arrays.sort(sorted);
        int total = 0;
        for (int i = 0; i < len; i++) {
            if (sorted[i] == numList[i]) {
                total++;
            }
        }
        System.out.println(total);
    }
}

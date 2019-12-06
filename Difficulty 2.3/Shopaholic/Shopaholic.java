import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Shopaholic{
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] items = new int[Integer.parseInt(br.readLine())];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < items.length; i++) {
            items[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(items);
        long total =  0;
        if (items.length >= 3) {
            for (int i = items.length - 3; i >= 0; i = i - 3) {
                total += items[i];
            }
        }
        System.out.println(total);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Pivot{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        ArrayList<Integer> rightSub = new ArrayList<>();
        int leftHighest = -10000;
        for (int i = 0; i < len; i++) {
            int val = Integer.parseInt(input[i]); 
            rightSub.add(val);
        }

        Collections.sort(rightSub);

        int total = 0;
        for (int i = 0; i < len; i++) {
            int currVal = Integer.parseInt(input[i]);
            rightSub.remove((Object) currVal);
            if (i == len - 1) {
                if (currVal >= leftHighest) {
                    total++;
                }
            } else {
                int rightLowest = rightSub.get(0);
                if (currVal >= leftHighest && currVal < rightLowest) {
                    total++;
                }
            }
            
            if (currVal > leftHighest) {
                leftHighest = currVal;
            }
        }
        System.out.println(total);
    }
}

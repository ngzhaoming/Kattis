import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosestSums {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int counter = 1;
        while(true) {
            String read = br.readLine();
            
            try {
                int n = Integer.parseInt(read);
                ArrayList<Long> list = new ArrayList<>();
    
                for (int i = 0; i < n; i++) {
                    list.add(Long.parseLong(br.readLine()));
                }
    
                int k = Integer.parseInt(br.readLine());
    
                ArrayList<Long> sums = new ArrayList<>();
    
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        long curr = list.get(i);
                        long next = list.get(j);
                        long sum = curr + next;
                        sums.add(sum);
                    }
                }
    
                Collections.sort(sums);
    
                System.out.println("Case " + counter + ":");
                counter++;
    
                for (int i = 0; i < k; i++) {
                    long test = Long.parseLong(br.readLine());
                    long first = sums.get(0);
                    long diff = Math.abs(test - first);
                    long number = first;
    
                    for (int j = 1; j < sums.size(); j++) {
                        long currNum = sums.get(j);
                        long currDiff = Math.abs(test - currNum);
                        if (currDiff <= diff) {
                            diff = currDiff;
                            number = currNum;
                        } else {
                            break;
                        }
                    }
    
                    System.out.println("Closest sum to " + test + " is " + number + ".");
                }
            } catch (Exception e) {
                break;
            }
        }
    }
}

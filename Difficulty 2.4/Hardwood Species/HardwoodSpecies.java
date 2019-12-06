import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class HardwoodSpecies{
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> list = new HashMap<>();
        ArrayList<String> treeList = new ArrayList<>();
        double total = 0;
        String s;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            if (!list.containsKey(s)) {
                treeList.add(s);
            }
            list.put(s, list.getOrDefault(s, 0.0) + 1);
            total++;
        }

        Collections.sort(treeList);
        for (int i = 0; i < treeList.size(); i++) {
            String currTree = treeList.get(i);
            double valCal = list.get(currTree);
            double result = valCal / total * 100; 
            System.out.println(String.format("%s %f", currTree, result));
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class CompoundWords{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> wordList = new ArrayList<>();
        HashSet<String> track = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        String s;
        while ((s = br.readLine()) != null) {
            String[] input = s.split(" ");
            for (int i = 0; i < input.length; i++) {
                wordList.add(input[i]);
            }
        }

        for (int i = 0; i < wordList.size(); i++) {
            String part1 = wordList.get(i);
            for (int j = 0; j < wordList.size(); j++) {
                if (i != j) {
                    String conc = part1 + wordList.get(j);
                    if (!track.contains(conc)) {
                        result.add(conc);
                        track.add(conc);
                    }
                }
            }
        }

        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class RhymingSlang{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int listNum = Integer.parseInt(br.readLine());
        HashSet<String> mySet = new HashSet<>();
        for (int i = 0; i < listNum; i++) {
            String[] input = br.readLine().split(" ");
            boolean flag = false;
            for (int j = 0; j < input.length; j++) {
                String currSyll = input[j];
                int lenSyll = currSyll.length();
                if (word.length() >= lenSyll) {
                    String subWord = word.substring(word.length() - lenSyll);
                    if (subWord.equals(currSyll)) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                for (int j = 0; j < input.length; j++) {
                    mySet.add(input[j]);
                }
            }
        }

        int phraseNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < phraseNum; i++) {
            String[] input = br.readLine().split(" ");
            String last = input[input.length - 1];
            int lastLen = last.length();
            Iterator<String> it = mySet.iterator();
            boolean flag = false;
            while (it.hasNext()) {
                String currSyll = it.next() + "";
                int lenSyll = currSyll.length();
                if (lastLen >= lenSyll) {
                    String subLast = last.substring(lastLen - lenSyll);
                    if (subLast.equals(currSyll)) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

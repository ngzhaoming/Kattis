import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class ACMContestScoring{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> numWrong = new HashMap<>();
        HashMap<String, Integer> timeCorrect = new HashMap<>();
        long score = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            } else {
                String ques = sc.next();
                String verdict = sc.next();
                if (verdict.equals("right")) {
                    if (!numWrong.containsKey(ques)) {
                        numWrong.put(ques, 0);
                    }
                    timeCorrect.put(ques, n);
                } else {
                    if (numWrong.containsKey(ques)) {
                        int wrong = numWrong.get(ques);
                        numWrong.replace(ques, wrong + 1);
                    } else {
                        numWrong.put(ques, 1);
                    }
                }
            }
        }

        Iterator it = timeCorrect.keySet().iterator();
        
        while (it.hasNext()) {
            String curr = it.next() + "";
            score = score + timeCorrect.get(curr) + numWrong.get(curr) * 20;
        }

        System.out.println(String.format("%d %d", timeCorrect.size(), score));
    }
}

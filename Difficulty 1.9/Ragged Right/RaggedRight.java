import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;

public class RaggedRight{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> para = new ArrayList<>();
        ArrayList<Integer> len = new ArrayList<>();
        while (sc.hasNext()) {
            String input = sc.nextLine();
            para.add(input);
            len.add(input.length());
        }

        Collections.sort(len);
        long max = len.get(len.size() - 1);
        long total = 0;

        for (int i = 0; i < para.size() - 1; i++) {
            String curr = para.get(i);
            long currLen = curr.length();
            long penalty = (long) Math.pow((max - currLen), 2);
            total += penalty;
        }

        System.out.println(total);
    }
}

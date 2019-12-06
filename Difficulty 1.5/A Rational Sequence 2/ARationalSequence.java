import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ARationalSequence{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            String[] input = sc.next().split("/");
            Pair pair = new Pair(Integer.parseInt(input[0]),
                Integer.parseInt(input[1]));
            ArrayDeque<Pair> list = new ArrayDeque<>();
            while (pair.x != 1 || pair.y != 1) {
                list.offerFirst(new Pair(pair.x, pair.y));
                if (pair.x > pair.y) {
                    pair.x -= pair.y;
                } else {
                    pair.y -= pair.x;
                }
            }

            int total = 1;
            while(!list.isEmpty()) {
                Pair currPair = list.poll();
                total *= 2;
                if (currPair.x > currPair.y) {
                    total++;
                }
            }

            System.out.println(String.format("%d %d", num, total));
        }
    }
}

class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

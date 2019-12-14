import java.util.Scanner;
import java.util.Stack;

public class PairingSocks {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Long> arr = new Stack<>();
        Stack<Long> aux = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            arr.push(sc.nextLong());
        }

        long total = 0;
        while (!arr.empty()) {
            long curr = arr.peek();
            if (aux.size() != 0) {
                long auxVal = aux.peek();
                if (auxVal == curr) {
                    aux.pop();
                    arr.pop();
                } else {
                    long arrVal = arr.pop();
                    aux.push(arrVal);
                }
            } else {
                long arrVal = arr.pop();
                aux.push(arrVal);
            }
            total++;
        }

        if (aux.size() > 0) {
            System.out.println("impossible");
        } else {
            System.out.println(total);
        }
    }
}

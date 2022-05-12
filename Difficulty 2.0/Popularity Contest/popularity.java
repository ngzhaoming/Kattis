import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class popularity {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int m = sc.nextInt();

	HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

	for (int i = 1; i <= n; i++) {
		map.put(i, new HashSet<Integer>());
	}	

	for (int i = 0; i < m; i++) {
		int first = sc.nextInt();
		int second = sc.nextInt();

		HashSet<Integer> currFirst = map.get(first);
		currFirst.add(second);
		map.put(first, currFirst);

		HashSet<Integer> currSecond = map.get(second);
		currSecond.add(first);
		map.put(second, currSecond);
	}

	for (int i = 1; i <= n; i++) {
		HashSet<Integer> currSet = map.get(i); 
		int diff = currSet.size() - i;
		if (i == n) {
			System.out.print(diff);
		} else {
			System.out.print(diff + " ");
		}	
	}

	System.out.println();
    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FroshWeek{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> todo = new ArrayList<>();
        ArrayList<Integer> quiet = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            todo.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            quiet.add(sc.nextInt());
        }

        Collections.sort(todo);
        Collections.sort(quiet);

        int counter = 0;
        while (!todo.isEmpty() && !quiet.isEmpty()) {
            int largestTodo = todo.get(todo.size() - 1);
            int largestQuiet = quiet.get(quiet.size() - 1);
            if (largestTodo <= largestQuiet) {
                quiet.remove(quiet.size() - 1);
                todo.remove(todo.size() - 1);
                counter++;
            } else {
                todo.remove(todo.size() - 1);
            }
        }

        System.out.println(counter);
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class ReachableRoads {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int nodes = sc.nextInt();
            int counter = 0;
            int paths = sc.nextInt();
            sc.nextLine();

            Graph mg = new Graph(nodes);

            for (int j = 0; j < paths; j++) {
                String[] line = sc.nextLine().split(" ");
                int start = Integer.parseInt(line[0]);
                int end = Integer.parseInt(line[1]);
                ArrayList<Integer> modified = mg.matrix.get(start);
                ArrayList<Integer> modified2 = mg.matrix.get(end);
                modified.add(end);
                modified2.add(start);
                mg.matrix.set(start, modified);
                mg.matrix.set(end, modified2);
            }

            for (int j = 0; j < mg.visited.length; j++) {
                if (mg.visited[j] == false) {
                    counter++;
                    mg.DFS(j);
                }
            }

            System.out.println(counter - 1);
        }
    }
}

class Graph {
    boolean[] visited;
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

    public Graph(int nodes) {
        visited = new boolean[nodes];
        for (int j = 0; j < nodes; j++) {
            ArrayList<Integer> arr = new ArrayList<>();
            matrix.add(arr);
        }
    }

    public void DFS(int num) {
        visited[num] = true;
        ArrayList<Integer> currList = matrix.get(num);
        for (int i = 0; i < currList.size(); i++) {
            int index = currList.get(i);
            if (visited[index] == false) {
                DFS(index);
            }
        }
    }
}

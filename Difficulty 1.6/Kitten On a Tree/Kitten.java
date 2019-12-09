import java.util.Scanner;

public class Kitten {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] graph = new int[101];

        int kitten = sc.nextInt();
        sc.nextLine();

        while (sc.hasNext()) {
            String[] arr = sc.nextLine().split(" ");
            int parent = Integer.parseInt(arr[0]);
            if (parent == -1) {
                break;
            } else {
                // First number is the parent node
                for (int i = 1; i < arr.length; i++) {
                    int curr = Integer.parseInt(arr[i]);
                    graph[curr] = parent;
                }
            }
        }

        String result = kitten + "";

        while (kitten != 0) {
            result = result + " " + graph[kitten];
            kitten = graph[kitten];
        }

        System.out.println(result.substring(0, result.length() - 2));
    }
}

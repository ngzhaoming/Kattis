import java.util.Scanner;
import java.util.HashMap;

public class HayPoints{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> myMap = new HashMap<>();
        int n = sc.nextInt();
        int desc = sc.nextInt();
        for (int i = 0; i < n; i++) {
            myMap.put(sc.next(), sc.nextInt());
        }

        sc.nextLine();
        for (int i = 0; i < desc; i++) {
            long total = 0;
            while(sc.hasNext()) {
                String lines = sc.nextLine();
                if (lines.equals(".")) {
                    break;
                } else {
                    String[] line = lines.split(" ");
                    for(int j = 0; j < line.length; j++) {
                        String currWord = line[j];
                        if (myMap.containsKey(currWord)) {
                            total += myMap.get(currWord);
                        }
                    }
                }
            }
            System.out.println(total);
        }
    }
}

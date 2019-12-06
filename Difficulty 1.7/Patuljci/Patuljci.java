import java.util.Scanner;
import java.util.ArrayList;

public class Patuljci{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < 9; i++) {
            int curr = sc.nextInt();
            list.add(curr);
            total += curr;
        }
        int diff = total - 100;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int num1 = list.get(i);
                int num2 = list.get(j);
                int sum = num1 + num2;
                if (sum == diff) {
                    list.remove((Integer) num1); 
                    list.remove((Integer) num2);
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

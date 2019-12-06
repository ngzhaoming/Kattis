import java.util.Scanner;
import java.util.TreeSet;

public class EngineeringEnglish{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> list = new TreeSet<>();
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                String curr = input[i];
                String temp = curr.toUpperCase();
                if (list.contains(temp)) {
                    if (i == input.length - 1) {
                        System.out.print(".");
                    } else {
                        System.out.print(". ");
                    }
                } else {
                    list.add(temp);
                    if (i == input.length - 1) {
                        System.out.print(curr);
                    } else {
                        System.out.print(curr + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}

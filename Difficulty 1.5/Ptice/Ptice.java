import java.util.Scanner;
import java.util.ArrayList;

public class Ptice{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int adrian = 0;
        int bruno = 0;
        int gordan = 0;
        char[] adrianAns = {'A', 'B', 'C'};
        char[] brunoAns = {'B', 'A', 'B', 'C'};
        char[] gordanAns = {'C', 'C', 'A', 'A', 'B', 'B'};

        String input = sc.next();
        for (int i = 0; i < n; i++) {
            char currAns = input.charAt(i);    
            if (currAns == adrianAns[(i) % 3]) {
                adrian++;
            }
            if (currAns == brunoAns[(i) % 4]) {
                bruno++;
            }
            if (currAns == gordanAns[(i) % 6]) {
                gordan++;
            }
        }

        int highest = adrian;
        ArrayList<String> list = new ArrayList<>();
        list.add("Adrian");
        if (bruno > highest) {
            highest = bruno;
            list.clear();
            list.add("Bruno");
        } else if (bruno == highest) {
            list.add("Bruno");
        }

        if (gordan > highest) {
            highest = gordan;
            list.clear();
            list.add("Goran");
        } else if (gordan == highest) {
            list.add("Goran");
        }

        System.out.println(highest);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

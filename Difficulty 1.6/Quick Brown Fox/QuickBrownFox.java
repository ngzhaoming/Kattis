import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;

public class QuickBrownFox{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().toLowerCase();
            TreeSet<Character> letters = new TreeSet<>();
            letters.add('a');
            letters.add('b');
            letters.add('c');
            letters.add('d');
            letters.add('e');
            letters.add('f');
            letters.add('g');
            letters.add('h');
            letters.add('i');
            letters.add('j');
            letters.add('k');
            letters.add('l');
            letters.add('m');
            letters.add('n');
            letters.add('o');
            letters.add('p');
            letters.add('q');
            letters.add('r');
            letters.add('s');
            letters.add('t');
            letters.add('u');
            letters.add('v');
            letters.add('w');
            letters.add('x');
            letters.add('y');
            letters.add('z');

            for (int j = 0; j < input.length(); j++) {
                char currChar = input.charAt(j);
                letters.remove(currChar);
            }

            if (letters.size() == 0) {
                System.out.println("pangram");
            } else {
                System.out.print("missing ");
                Iterator it = letters.iterator();
                while(it.hasNext()) {
                    System.out.print(it.next());
                }
                System.out.println();
            }
        }
    }
}

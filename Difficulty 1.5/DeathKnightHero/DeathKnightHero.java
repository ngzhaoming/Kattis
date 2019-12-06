import java.util.Scanner;

public class DeathKnightHero{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = n;
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            char prevInput = input.charAt(0);
            for (int j = 1; j < input.length(); j++) {
                char currInput = input.charAt(j);
                if (prevInput == 'C' && currInput == 'D') {
                    counter--;
                }
                prevInput = currInput;
            }
        }

        System.out.println(counter);
    }
}

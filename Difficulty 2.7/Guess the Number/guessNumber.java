import java.util.Scanner;

public class guessNumber {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);        
        int lower = 0;
        int upper = 1001;
        int guesses = guess(lower, upper);

        System.out.println(guesses);

        while(sc.hasNext()) {
            String verdict = sc.nextLine();
            if (verdict.equals("lower")) {
                upper = guesses;
                guesses = guess(lower, upper);
            } else if (verdict.equals("higher")) {
                lower = guesses;
                guesses = guess(lower, upper);
            } else {
                break;
            }
            System.out.println(guesses);
        }
    }

    public static int guess(int lower, int upper) {
        return (lower + upper) / 2;
    }
}

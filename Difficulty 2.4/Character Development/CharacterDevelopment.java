import java.util.Scanner;

public class CharacterDevelopment{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong(); 
        long curr = 1;
        long addition = 2;
        long result = 0;
        long counter = 1;
        while (counter < num) {
            result += curr;
            curr += addition;
            addition *= 2;
            counter++;
        }

        if (num == 0 || num == 1) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}

import java.util.Scanner;

public class TripleTexting {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int subLen = word.length() / 3;
        
        String subOne = word.substring(0, subLen);
        String subTwo = word.substring(subLen, subLen * 2);
        String subThree = word.substring(subLen * 2, subLen * 3);

        if (subOne.equals(subTwo) || subOne.equals(subThree)) {
            System.out.println(subOne);
        } else {
            System.out.println(subTwo);
        }
    }
}

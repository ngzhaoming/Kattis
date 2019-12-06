import java.util.Scanner;
import java.util.HashMap;

public class WordsNumbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> numWords = new HashMap<>();

        numWords.put("0", "zero");
        numWords.put("1", "one");
        numWords.put("2", "two");
        numWords.put("3", "three");
        numWords.put("4", "four");
        numWords.put("5", "five");
        numWords.put("6", "six");
        numWords.put("7", "seven");
        numWords.put("8", "eight");
        numWords.put("9", "nine");
        numWords.put("10", "ten");
        numWords.put("11", "eleven");
        numWords.put("12", "twelve");
        numWords.put("13", "thirteen");
        numWords.put("14", "fourteen");
        numWords.put("15", "fifteen");
        numWords.put("16", "sixteen");
        numWords.put("17", "seventeen");
        numWords.put("18", "eighteen");
        numWords.put("19", "nineteen");
        numWords.put("20", "twenty");
        numWords.put("30", "thirty");
        numWords.put("40", "forty");
        numWords.put("50", "fifty");
        numWords.put("60", "sixty");
        numWords.put("70", "seventy");
        numWords.put("80", "eighty");
        numWords.put("90", "ninety");

        while(sc.hasNext()) {
            String input = sc.nextLine();

            String result = "";
            boolean isNumber = false;
            boolean capital = true;
            String number = "";

            for(int i = 0; i < input.length(); i++) {
                char currChar = input.charAt(i);

            }

            System.out.println(result);
        }
    }
}

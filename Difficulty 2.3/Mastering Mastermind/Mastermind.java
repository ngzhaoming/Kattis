import java.util.Scanner;
import java.util.HashMap;

public class Mastermind {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String correct = sc.next();
        String guess = sc.next();
        HashMap<Character, Integer> correctHash = new HashMap<>();
        HashMap<Character, Integer> guessHash = new HashMap<>();

        int r = 0;
        int s = 0;

        for (int i = 0; i < correct.length(); i++) {
            char currCorrect = correct.charAt(i);
            char currGuess = guess.charAt(i);

            if (currCorrect == currGuess) {
                r++;
            } else {
                if (correctHash.containsKey(currGuess) && guessHash.containsKey(currCorrect)) {
                    int currVal = correctHash.get(currGuess);
                    int newVal = currVal - 1;
                    if (newVal == 0) {
                        correctHash.remove(currGuess);
                    } else {
                        correctHash.replace(currGuess, currVal, newVal);
                    }
                    s++;

                    int currVal1 = guessHash.get(currCorrect);
                    int newVal1 = currVal1 - 1;
                    if (newVal1 == 0) {
                        guessHash.remove(currCorrect);
                    } else {
                        guessHash.replace(currCorrect, currVal1, newVal1);
                    }
                    s++;
                } else if (correctHash.containsKey(currGuess)) {
                    int currVal = correctHash.get(currGuess);
                    int newVal = currVal - 1;
                    if (newVal == 0) {
                        correctHash.remove(currGuess);
                    } else {
                        correctHash.replace(currGuess, currVal, newVal);
                    }
                    s++;

                    int correctValue = correctHash.getOrDefault(currCorrect, 0);
                    int newCorrectValue = correctValue + 1;
                    if (newCorrectValue == 1) {
                        correctHash.put(currCorrect, newCorrectValue);
                    } else {
                        correctHash.replace(currCorrect, correctValue, newCorrectValue);
                    }
                } else if (guessHash.containsKey(currCorrect)) {
                    int currVal = guessHash.get(currCorrect);
                    int newVal = currVal - 1;
                    if (newVal == 0) {
                        guessHash.remove(currCorrect);
                    } else {
                        guessHash.replace(currCorrect, currVal, newVal);
                    }
                    s++;

                    int guessValue = guessHash.getOrDefault(currGuess, 0);
                    int newGuessValue = guessValue + 1;

                    if (newGuessValue == 1) {
                        guessHash.put(currGuess, newGuessValue);
                    } else {
                        guessHash.replace(currGuess, guessValue, newGuessValue);
                    }
                } else {
                    int correctValue = correctHash.getOrDefault(currCorrect, 0);
                    int guessValue = guessHash.getOrDefault(currGuess, 0);
                    int newCorrectValue = correctValue + 1;
                    int newGuessValue = guessValue + 1;

                    if (newCorrectValue == 1) {
                        correctHash.put(currCorrect, newCorrectValue);
                    } else {
                        correctHash.replace(currCorrect, correctValue, newCorrectValue);
                    }

                    if (newGuessValue == 1) {
                        guessHash.put(currGuess, newGuessValue);
                    } else {
                        guessHash.replace(currGuess, guessValue, newGuessValue);
                    }
                }
            }
        }

        System.out.println(r + " " + s);
    }
}

import java.util.Scanner;

public class PigLatin{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            String newSentence = "";
            for (int i = 0; i < input.length; i++) {
                String currWord = input[i];
                boolean flag = true;
                while (true) {
                    char fL = currWord.charAt(0);
                    if (fL == 'a' || fL == 'e' || fL == 'i' ||
                            fL == 'o' || fL == 'u' || fL == 'y') {
                        if (flag) {
                            currWord += "yay";
                            newSentence += (currWord + " ");
                            break;
                        } else {
                            currWord += "ay";
                            newSentence += (currWord + " ");
                            break;
                        }
                    } else {
                        currWord = currWord.substring(1, currWord.length()) + fL;
                        flag = false;
                    }
                }
            }
            System.out.println(newSentence.substring(0, newSentence.length() - 1));
        }
    }
}

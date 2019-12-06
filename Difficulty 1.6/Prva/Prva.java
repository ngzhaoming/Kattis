import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Prva{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dim = br.readLine().split(" ");
        String[] list = new String[Integer.parseInt(dim[0])];
        ArrayList<String> words = new ArrayList<>();
        String s;

        int counter = 0;
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            list[counter] = s;
            counter++;
        }

        String currWord = "";
        for (int i = 0; i < list.length; i++) { //Checking for horizonal
            String currLine = list[i];
            for (int j = 0; j < currLine.length(); j++) {
                char currChar = currLine.charAt(j);
                if (currChar == '#') {
                    if (currWord.length() > 1) {
                        words.add(currWord);
                    }
                    currWord = "";
                } else {
                    currWord = currWord + currChar;
                }

                if (j == currLine.length() - 1) {
                    if (currWord.length() > 1) {
                        words.add(currWord);
                    }
                    currWord = "";
                }
            }
        }

        for (int i = 0; i < Integer.parseInt(dim[1]); i++) {
            for (int j = 0; j < list.length; j++) {
                String currLine = list[j];
                char currChar = currLine.charAt(i);
                if (currChar == '#') {
                    if (currWord.length() > 1) {
                        words.add(currWord);
                    }
                    currWord = "";
                } else {
                    currWord = currWord + currChar;
                }

                if (j == list.length - 1) {
                    if (currWord.length() > 1) {
                        words.add(currWord);
                    }
                    currWord = "";
                }
            }
        }

        Collections.sort(words);
        System.out.println(words.get(0));
    }
}

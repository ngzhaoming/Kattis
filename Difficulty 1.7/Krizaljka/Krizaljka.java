import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Krizaljka{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String word1 = input[0];
        String word2 = input[1];

        int index1 = 1000000;
        int index2 = 1000000;
        for (int i = 0; i < word2.length(); i++) {
            char currChar = word2.charAt(i);
            int val = word1.indexOf(currChar + "");
            if (val >= 0 && val < index1) {
                index1 = val; //First word branch out
                index2 = i; //Second word branch out
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            String result = "";
            if (i == index2) {
                System.out.println(word1);
            } else {
                for(int j = 0; j < index1; j++) {
                    result += ".";
                }

                result += word2.charAt(i);

                for (int j = 0; j < word1.length() - index1 - 1; j++) {
                    result += ".";
                }
                System.out.println(result);
            }
        }
    }
}

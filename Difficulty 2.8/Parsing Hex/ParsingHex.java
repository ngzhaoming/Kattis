import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.Character;

public class ParsingHex{
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<String> hexLine = new ArrayList<>();
        while ((s = br.readLine()) != null && !s.isEmpty()) {
            String result = "";
            int step = 0;
            for (int i = 0; i < s.length(); i++) {
                String currChar = s.charAt(i) + "";
                if (i == s.length() - 1) { //Last character in the line
                    if (step == 2 && currChar.matches("[0-9a-fA-F]")) {
                        result += currChar;
                    }

                    if (!result.isEmpty()) {
                        hexLine.add(result);
                    }

                    step = 0;
                    result = "";
                } else {
                    if (step == 0 && currChar.equals("0")) {
                        step = 1;
                        result += currChar;
                    } else if (step == 1 && (currChar.equals("x") ||
                        currChar.equals("X"))) {
                        step = 2;
                        result += currChar;
                    } else if (step == 2 && currChar.matches("[0-9a-fA-F]")) {
                        result += currChar;
                    } else if (step > 0 && !currChar.matches("[0-9a-fA-FxX]")) {
                        if (result.length() > 2) {
                            hexLine.add(result);
                        }
                        step = 0;
                        result = "";
                    }
                }
            }
        }

        for (int i = 0; i < hexLine.size(); i++) {
            String line = hexLine.get(i);
            long decimal = hexConversion(line);
            System.out.println(String.format("%s %d", line, decimal)); 
        }
    }

    public static long hexConversion(String s) {
        long answer = 0;
        int counter = 0;
        for (int i = s.length() - 1; i >= 2; i--) {
            char currChar = s.charAt(i);
            int val;
            if (currChar == 'a' || currChar == 'A') {
                val = 10;
            } else if (currChar == 'b' || currChar == 'B') {
                val = 11;
            } else if (currChar == 'c' || currChar == 'C') {
                val = 12;
            } else if (currChar == 'd' || currChar == 'D') {
                val = 13;
            } else if (currChar == 'e' || currChar == 'E') {
                val = 14;
            } else if (currChar == 'f' || currChar == 'F') {
                val = 15;
            } else {
                val = Character.getNumericValue(currChar); 
            }
            answer += (Math.pow(16, counter) * val);
            counter++;
        }

        return answer;
    }
}

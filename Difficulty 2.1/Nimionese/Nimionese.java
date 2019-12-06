import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.Character;

public class Nimionese{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        char[] con = {'b', 'c', 'd', 'g', 'k', 'n', 'p', 't'}; 
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            String[] syllabus = input[i].split("-");
            String newWord = "";
            String startCon = ""; //Keep track of the first hard constant
            for (int j = 0; j < syllabus.length; j++) {
                String currSyll = syllabus[j];
                for (int k = 0; k < currSyll.length(); k++) {
                    char currChar = currSyll.charAt(k);
                    char tempChar = Character.toLowerCase(currChar);
                    if (j == 0 && k == 0) { //First letter of a new word
                        //Have to check for hard constant
                        int min = 100;
                        for (int l = 0; l < con.length; l++) {
                            int diffVal = (int) Math.abs((int) con[l] - (int) tempChar);
                            if (diffVal < min) {
                                min = diffVal;
                                startCon = con[l] + "";
                            }
                        }
                        if (currChar == tempChar) {
                            newWord += startCon;
                        } else {
                            newWord += startCon.toUpperCase();    
                        }
                        tempChar = startCon.charAt(0);
                    } else if (j == 0) { 
                        //Immunity for the first syllabus
                        newWord += currChar;
                    } else { //Not the last syllabus
                        if (Character.toString(tempChar).matches("[bcdgknpt]")) {
                            if (currChar >= 65 && currChar <= 90) {
                                newWord += startCon.toUpperCase();
                            } else {
                                newWord += startCon;
                            }
                        } else {
                            newWord += currChar;
                        }
                    }
                }
            }
            if (Character.toString(newWord.charAt(newWord.length() - 1)).toLowerCase().matches("[bcdgknpt]")) {
                char lastChar = newWord.charAt(newWord.length() - 1);
                int index = -1;
                int mini = 100;
                char[] myList = {'a', 'o', 'u'};
                String[] actual = {"ah", "oh", "uh"};
                for (int m = 0; m < myList.length; m++) {
                    int difference = Math.abs((int) myList[m] - (int) lastChar);
                    if (difference < mini) {
                        mini = difference;
                        index = m;
                    }
                }
                newWord += actual[index];
            }
            result.append(newWord + " ");
        }

        System.out.println(result.toString().substring(0, result.length() - 1));
    }
}

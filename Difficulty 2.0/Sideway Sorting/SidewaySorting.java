import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SidewaySorting {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row == 0 && col == 0) {
                break;
            }

            // This is to return the result
            String[] result = new String[row];
            for (int i = 0; i < result.length; i++) {
                result[i] = "";
            }

            String[] words = new String[row];
            ArrayList<Words> myArr = new ArrayList<>();
            sc.nextLine();

            for (int i = 0; i < row; i++) {
                words[i] = sc.nextLine();
            }

            for (int i = 0; i < col; i++) {
                String word = "";
                for (int j = 0; j < row; j++) {
                    word += words[j].charAt(i);
                }
                myArr.add(new Words(word, i));
            }

            Collections.sort(myArr, new wordSorter());

            for (int i = 0; i < myArr.size(); i++) {
                String currWord = myArr.get(i).word;
                for (int j = 0; j < currWord.length(); j++) {
                    String arrCurr = result[j];
                    arrCurr += currWord.charAt(j);
                    result[j] = arrCurr;
                }
            }

            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }
}

class Words {
    String word;
    int order;

    public Words(String word, int order) {
        this.word = word;
        this.order = order;
    }
}

class wordSorter implements Comparator<Words> {
    public int compare(Words w1, Words w2) {
        int diff = (w1.word).compareToIgnoreCase(w2.word); 

        if (diff == 0) {
            return w1.order - w2.order;
        }

        return diff;
    }
}

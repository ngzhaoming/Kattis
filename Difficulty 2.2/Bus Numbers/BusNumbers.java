import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.Arrays;

public class BusNumbers{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        int prev = list[0];
        int rangeStart = prev;
        int rangeEnd = prev;
        for (int i = 1; i < list.length; i++) {
            int curr = list[i];
            if (curr == (prev + 1)) {
                rangeEnd = curr;
            } else {
                if (rangeStart == rangeEnd) {
                    finalString.append(rangeStart + " ");
                } else if (rangeStart + 1 == rangeEnd) {
                    finalString.append(rangeStart + " ");
                    finalString.append(rangeEnd + " ");
                } else {
                    finalString.append(String.format("%d-%d ", rangeStart
                        , rangeEnd));
                }
                rangeStart = curr;
                rangeEnd = curr;
            }
            prev = curr;

            if (i == list.length - 1) { //Last element
                if (rangeStart == rangeEnd) {
                    finalString.append(rangeStart + " ");
                } else if (rangeStart + 1 == rangeEnd) {
                    finalString.append(rangeStart + " ");
                    finalString.append(rangeEnd + " ");
                } else {
                    finalString.append(String.format("%d-%d ", rangeStart
                        , rangeEnd));
                }
                rangeStart = curr;
                rangeEnd = curr;
                
            }
        }
        System.out.println(finalString.toString()
                .substring(0, finalString.length() - 1));
    }
}

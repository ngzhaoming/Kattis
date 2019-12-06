import java.util.Scanner;
import java.util.HashSet;

public class NoDuplicates{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String flag = "yes";
        HashSet<String> track = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            String currWord = input[i];
            if (track.contains(currWord)) {
                flag = "no";
                break;
            } else {
                track.add(currWord);
            }
        }

        System.out.println(flag);
    }
}

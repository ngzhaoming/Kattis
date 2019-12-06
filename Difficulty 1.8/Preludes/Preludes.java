import java.util.Scanner;
import java.util.HashMap;

public class Preludes{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> notes = new HashMap<>();
        notes.put("A#", "Bb");
        notes.put("Bb", "A#");
        notes.put("C#", "Db");
        notes.put("Db", "C#");
        notes.put("D#", "Eb");
        notes.put("Eb", "D#");
        notes.put("F#", "Gb");
        notes.put("Gb", "F#");
        notes.put("G#", "Ab");
        notes.put("Ab", "G#");
        int counter = 1;
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            if (notes.containsKey(input[0])) {
                System.out.println(String.format("Case %d: %s %s", counter, notes.get(input[0]), input[1]));
            } else {
                System.out.println(String.format("Case %d: UNIQUE", counter));
            }
            counter++;
        }
    }
}

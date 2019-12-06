import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.List;

public class ReverseRot{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> list = Arrays.asList('A', 'B', 'C', 'D', 'E',
                                    'F', 'G', 'H', 'I', 'J', 'K', 'L',
                                    'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                                    'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                                    '_', '.');
        int rotation = sc.nextInt();
        while (rotation != 0) {
            String input = sc.next();
            StringBuilder converted = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                int index = (list.indexOf(input.charAt(i)) + rotation) % 28; 
                converted.append(list.get(index));
            }
            System.out.println(converted.reverse().toString());
            rotation = sc.nextInt();
        }
    }
}

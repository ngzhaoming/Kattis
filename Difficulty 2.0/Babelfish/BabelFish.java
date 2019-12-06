import java.util.Scanner;
import java.util.TreeMap;

public class BabelFish{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, String> myMap = new TreeMap<>();
        while (sc.hasNext()) {
            String input = sc.nextLine();
            if (input.length() == 0) {
                break;
            } else {
                String[] inputList = input.split(" ");
                myMap.put(inputList[1], inputList[0]);
            }
        }
        while (sc.hasNext()) {
            String asked = sc.nextLine();
            if (myMap.containsKey(asked)) {
                System.out.println(myMap.get(asked));
            } else {
                System.out.println("eh");
            }
        }
    }
}

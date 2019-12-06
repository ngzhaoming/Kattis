import java.util.Scanner;
import java.util.ArrayList;

public class DigitalDisplay{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[][] colon = {{"     "}, {"     "},
                        {"  o  "}, {"     "},
                        {"  o  "}, {"     "}, {"     "}};
        String[][] one = {{"    +"}, {"    |"}, 
                        {"    |"}, {"    +"},
                        {"    |"}, {"    |"}, {"    +"}};
        String[][] two = {{"+---+"}, {"    |"}, 
                        {"    |"}, {"+---+"},
                        {"|    "}, {"|    "}, {"+---+"}};
        String[][] three = {{"+---+"}, {"    |"}, 
                        {"    |"}, {"+---+"},
                        {"    |"}, {"    |"}, {"+---+"}};
        String[][] four = {{"+   +"}, {"|   |"}, 
                        {"|   |"}, {"+---+"},
                        {"    |"}, {"    |"}, {"    +"}};
        String[][] five = {{"+---+"}, {"|    "}, 
                        {"|    "}, {"+---+"},
                        {"    |"}, {"    |"}, {"+---+"}};
        String[][] six = {{"+---+"}, {"|    "}, 
                        {"|    "}, {"+---+"},
                        {"|   |"}, {"|   |"}, {"+---+"}};
        String[][] seven = {{"+---+"}, {"    |"}, 
                        {"    |"}, {"    +"},
                        {"    |"}, {"    |"}, {"    +"}};
        String[][] eight = {{"+---+"}, {"|   |"}, 
                        {"|   |"}, {"+---+"},
                        {"|   |"}, {"|   |"}, {"+---+"}};
        String[][] nine = {{"+---+"}, {"|   |"}, 
                        {"|   |"}, {"+---+"},
                        {"    |"}, {"    |"}, {"+---+"}};
        String[][] zero = {{"+---+"}, {"|   |"}, 
                        {"|   |"}, {"+   +"},
                        {"|   |"}, {"|   |"}, {"+---+"}};
        String[][][] take = {zero, one, two, three, four, five, six,
                        seven, eight, nine, colon}; 
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(":"); 
            if (input[0].equals("end")) {
                System.out.println("end");
                break;
            }
            
            ArrayList<String[][]> print = new ArrayList<>();
            print.add(take[Character.getNumericValue(input[0].charAt(0))]);
            print.add(take[Character.getNumericValue(input[0].charAt(1))]);
            print.add(take[10]);
            print.add(take[Character.getNumericValue(input[1].charAt(0))]);
            print.add(take[Character.getNumericValue(input[1].charAt(1))]);
            for (int k = 0; k < 7; k++) {
                String result = "";
                for (int l = 0; l < 5; l++) {
                    String[][] curr = print.get(l);
                    result += curr[k][0];
                    if (l == 0 || l == 3) {
                        result += "  ";
                    }
                }
                System.out.println(result);
            }
            System.out.println();
            System.out.println();
        }
    }
    
}

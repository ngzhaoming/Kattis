import java.util.Scanner;
import java.util.ArrayList;

public class ImperialMeasurement{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double[] units = {1000, 12, 3, 22, 10, 8, 3};
        ArrayList<String> measure = new ArrayList<>();

        measure.add("th");
        measure.add("in");
        measure.add("ft");
        measure.add("yd");
        measure.add("ch");
        measure.add("fur");
        measure.add("mi");
        measure.add("lea");

        // Getting the input conversion
        String[] input = sc.nextLine().split(" ");
        double val = Double.parseDouble(input[0]);
        String given = input[1];
        String transform = input[3];

        switch(given) {
            case "thou":
                given = "th";
                break;
            case "inch":
                given = "in";
                break;
            case "foot":
                given = "ft";
                break;
            case "yard":
                given = "yd";
                break;
            case "chain":
                given = "ch";
                break;
            case "furlong":
                given = "fur";
                break;
            case "mile":
                given = "mi";
                break;
            case "league":
                given = "lea";
                break;
        }

        switch(transform) {
            case "thou":
                transform = "th";
                break;
            case "inch":
                transform = "in";
                break;
            case "foot":
                transform = "ft";
                break;
            case "yard":
                transform = "yd";
                break;
            case "chain":
                transform = "ch";
                break;
            case "furlong":
                transform = "fur";
                break;
            case "mile":
                transform = "mi";
                break;
            case "league":
                transform = "lea";
                break;
        }

        int start = measure.indexOf(given);
        int end = measure.indexOf(transform);
        int diff = start - end;

        if (diff > 0) {
            // Have to multiply when going down
            // Start is better than end
            while(diff != 0) {
                double multiply = units[start - 1];
                val *= multiply;
                start--;
                diff--;
            }
        }
        
        if (diff < 0) {
            while(diff != 0) {
                double divide = units[start];
                val /= divide;
                start++;
                diff++;
            }
        }

        if (val % 1 == 0) {
            System.out.println((long) val);
        } else {
            System.out.println(val);
        }
        
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class AsciiAddition{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] ascii = new String[7];
        for(int i = 0; i < 7; i++) {
            ascii[i] = sc.nextLine();
        }

        int length = ascii[0].length();
        String eqn = "";
        for(int i = 0; i < length; i += 6) {
            String value = "";
            for (int j = 0; j < 7; j++) {
                value += ascii[j].substring(i, i + 5);
            }
            eqn += asciiChecker(value);
        }

        String[] eqnArr = eqn.split("\\+");
        int result = Integer.parseInt(eqnArr[0]) + Integer.parseInt(eqnArr[1]);
        convertAscii(result);
    }

    public static void printArray(String[] arr) {
        for(int i = 0; i < 7; i++) {
            System.out.println(arr[i]);
        }
    }

    public static String asciiChecker(String curr) {
        switch(curr) {
            case "xxxxxx...xx...xx...xx...xx...xxxxxx":
                return "0";
            case "....x....x....x....x....x....x....x":
                return "1";
            case "xxxxx....x....xxxxxxx....x....xxxxx":
                return "2";
            case "xxxxx....x....xxxxxx....x....xxxxxx":
                return "3";
            case "x...xx...xx...xxxxxx....x....x....x":
                return "4";
            case "xxxxxx....x....xxxxx....x....xxxxxx":
                return "5";
            case "xxxxxx....x....xxxxxx...xx...xxxxxx":
                return "6";
            case "xxxxx....x....x....x....x....x....x":
                return "7";
            case "xxxxxx...xx...xxxxxxx...xx...xxxxxx":
                return "8";
            case "xxxxxx...xx...xxxxxx....x....xxxxxx":
                return "9";
            case ".......x....x..xxxxx..x....x.......":
                return "+";
            default:
                return "none";
        }
    }

    public static void convertAscii(int value) {
        ArrayList<String> ans = new ArrayList<>();
        String zero = "xxxxxx...xx...xx...xx...xx...xxxxxx";
        String one = "....x....x....x....x....x....x....x";
        String two = "xxxxx....x....xxxxxxx....x....xxxxx";
        String three = "xxxxx....x....xxxxxx....x....xxxxxx";
        String four = "x...xx...xx...xxxxxx....x....x....x";
        String five = "xxxxxx....x....xxxxx....x....xxxxxx";
        String six = "xxxxxx....x....xxxxxx...xx...xxxxxx";
        String seven = "xxxxx....x....x....x....x....x....x";
        String eight = "xxxxxx...xx...xxxxxxx...xx...xxxxxx";
        String nine = "xxxxxx...xx...xxxxxx....x....xxxxxx";

        String[] arr = (value + "").split("");

        for (int i = 0 ; i < 35; i += 5) {
            String result = "";
            for (int j = 0; j < arr.length; j++) {
                switch(arr[j]) {
                    case "0":
                        result += zero.substring(i, i + 5);
                        break;
                    case "1":
                        result += one.substring(i, i + 5);
                        break;
                    case "2":
                        result += two.substring(i, i + 5);
                        break;
                    case "3":
                        result += three.substring(i, i + 5);
                        break;
                    case "4":
                        result += four.substring(i, i + 5);
                        break;
                    case "5":
                        result += five.substring(i, i + 5);
                        break;
                    case "6":
                        result += six.substring(i, i + 5);
                        break;
                    case "7":
                        result += seven.substring(i, i + 5);
                        break;
                    case "8":
                        result += eight.substring(i, i + 5);
                        break;
                    case "9":
                        result += nine.substring(i, i + 5);
                        break;
                    default:
                        break;
                }

                if (j != arr.length - 1) {
                    result += ".";
                }
            }

            ans.add(result);
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}

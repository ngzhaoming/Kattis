import java.util.Scanner;

public class TimeBomb {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] ascii = new String[5];
        for(int i = 0; i < 5; i++) {
            ascii[i] = sc.nextLine();
        }

        boolean verdict = getVerdict(ascii);

        if (verdict) {
            System.out.println("BEER!!");
        } else {
            System.out.println("BOOM!!");
        }
    }

    public static void printArray(String[] arr) {
        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static boolean getVerdict(String[] arr) {
        int len = arr[0].length();
        boolean verdict = true;
        String number = "";
        
        for (int i = 0; i < len; i += 4) {
            String curr = "";
            for (int j = 0; j < 5; j++) {
                curr += arr[j].substring(i, i + 3);
            }
            int val = asciiChecker(curr);

            if (val < 10) {
                number += val;
            } else {
                verdict = false;
                break;
            }
        }

        if (verdict) {
            long value = Long.parseLong(number); 
            if (value % 6 != 0) {
                verdict = false;
            }
        }

        return verdict;
    }

    public static int asciiChecker(String curr) {
        switch(curr) {
            case "**** ** ** ****":
                return 0;
            case "  *  *  *  *  *":
                return 1;
            case "***  *****  ***":
                return 2;
            case "***  ****  ****":
                return 3;
            case "* ** ****  *  *":
                return 4;
            case "****  ***  ****":
                return 5;
            case "****  **** ****":
                return 6;
            case "***  *  *  *  *":
                return 7;
            case "**** ***** ****":
                return 8;
            case "**** ****  ****":
                return 9;
            default:
                return 11;
        }
    }
}

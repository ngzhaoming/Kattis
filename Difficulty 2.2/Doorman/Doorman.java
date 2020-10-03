import java.util.Scanner;
import java.util.ArrayList;

public class Doorman {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        ArrayList<Character> arr = new ArrayList<>();
        int total = 0;
        int count = 0;

        for(int i = 0; i < line.length(); i++) {
            char currChar = line.charAt(i);
            arr.add(currChar);
        }

        while(arr.size() > 0) {
            if (arr.size() >= 2) {
                char first = arr.get(0);
                char second = arr.get(1);

                if (count == limit) {
                    //No more men allowed
                    if (first == 'W') {
                        count--;
                        total++;
                        arr.remove(0);
                    } else if (second == 'W') {
                        count--;
                        total++;
                        arr.remove(1);
                    } else {
                        break;
                    }
                } else if (count == -limit) {
                    if (first == 'M') {
                        count++;
                        total++;
                        arr.remove(0);
                    } else if (second == 'M') {
                        count++;
                        total++;
                        arr.remove(1);
                    } else {
                        break;
                    }
                } else {
                    if (first == 'M') {
                        count++;
                    } else {
                        count--;
                    }
                    total++;
                    arr.remove(0);
                }
            } else {
                char currChar = arr.get(0); 
                if (currChar == 'M') {
                    count++;
                } else {
                    count--;
                }

                if (count > limit || count < -limit) {
                    break;
                }
                total++;
                arr.remove(0);
            }
        }

        System.out.println(total);
    }
}

import java.util.Scanner;
import java.util.HashMap;

public class Metaprogramming{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("define")) {
                if (list.containsKey(input[2])) {
                    list.replace(input[2], Integer.parseInt(input[1]));
                } else {
                    list.put(input[2], Integer.parseInt(input[1]));
                }
            } else {
                if (list.containsKey(input[1]) && list.containsKey(input[3])) {
                    int val1 = list.get(input[1]);
                    int val2 = list.get(input[3]);
                    if (input[2].equals("<")) {
                        if (val1 < val2) {
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }
                    } else if (input[2].equals("=")) {
                        if (val1 == val2) {
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }
                    } else {
                        if (val1 > val2) {
                            System.out.println("true");
                        } else {
                            System.out.println("false");
                        }
                    }
                } else {
                    System.out.println("undefined");
                }
            }
        }
    }
}

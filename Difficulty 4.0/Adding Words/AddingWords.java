import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class AddingWords{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> list = new HashMap<>();
        HashSet<Integer> num = new HashSet<>();
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("clear")) {
                list.clear();
                num.clear();
            } else if (input[0].equals("def")) {
                if (list.containsKey(input[1])) {
                    int val = list.get(input[1]);
                    num.remove(val);
                    list.replace(input[1], Integer.parseInt(input[2]));
                    num.add(Integer.parseInt(input[2]));
                } else {
                    list.put(input[1], Integer.parseInt(input[2]));
                    num.add(Integer.parseInt(input[2]));
                }
            } else { // This is calc
                int currVal = 0;
                String ans = "";
                String action = "";
                for (int i = 1; i < input.length - 1; i++) {
                    String currInput = input[i];
                    if (i % 2 != 0) {
                        if (list.containsKey(currInput)) {
                            if (i == 1) {
                                currVal = list.get(currInput);
                            } else {
                                if (action.equals("+")) {
                                    currVal += list.get(currInput);
                                } else if (action.equals("-")) {
                                    currVal -= list.get(currInput);
                                }
                            }
                        } else {
                            ans = "unknown";
                            break;
                        }
                    } else {
                        action = currInput;
                    }
                }
                if (num.contains(currVal) && ans.equals("")) {
                    Iterator it = list.keySet().iterator();
                    while (it.hasNext()) {
                        String next = it.next() + "";
                        int checkVal = list.get(next);
                        if (checkVal == currVal) {
                            ans = next;
                            break;
                        }
                    }
                } else {
                    ans = "unknown";
                }

                for (int i = 1; i < input.length; i++) {
                    System.out.print(input[i] + " ");
                }
                System.out.print(ans);
                System.out.println();
            }
        }
    }
}

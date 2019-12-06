import java.util.Scanner;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ConquestCampaign{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();
        HashSet<String> mySet = new HashSet<>();
        long r = sc.nextLong();
        long c = sc.nextLong();
        long total = r * c;
        int n = sc.nextInt();
        int flag = 1;
        long counter = 1;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (!mySet.contains(line)) {
                mySet.add(line);
                queue1.add(line);
            }
        }
        while (mySet.size() < total) {
            if (flag == 1) { //Use from queue1 and store in queue2
                while (!queue1.isEmpty()) {
                    String[] curr = queue1.poll().split(" ");
                    int X = Integer.parseInt(curr[0]);
                    int Y = Integer.parseInt(curr[1]);
                    if (X - 1 >= 1) {
                        String newStr = (X - 1) + " " + Y;
                        if (!mySet.contains(newStr)) {
                            mySet.add(newStr);
                            queue2.add(newStr);
                        }
                    }
                    if (X + 1 <= r) {
                        String newStr = (X + 1) + " " + Y;
                        if (!mySet.contains(newStr)) {
                            mySet.add(newStr);
                            queue2.add(newStr);
                        }
                    }
                    if (Y - 1 >= 1) {
                        String newStr = X + " " + (Y - 1);
                        if (!mySet.contains(newStr)) {
                            mySet.add(newStr);
                            queue2.add(newStr);
                        }
                    }
                    if (Y + 1 <= c) {
                        String newStr = X + " " + (Y + 1);
                        if (!mySet.contains(newStr)) {
                            mySet.add(newStr);
                            queue2.add(newStr);
                        }
                    }
                }
                flag = 2;
            } else {
                while (!queue2.isEmpty()) {
                    String[] curr = queue2.poll().split(" ");
                    int X = Integer.parseInt(curr[0]);
                    int Y = Integer.parseInt(curr[1]);
                    if (X - 1 >= 1) {
                        String newStr = (X - 1) + " " + Y;
                        if (!mySet.contains(newStr)) {
                            mySet.add(newStr);
                            queue1.add(newStr);
                        }
                    }
                    if (X + 1 <= r) {
                        String newStr = (X + 1) + " " + Y;
                        if (!mySet.contains(newStr)) {
                            mySet.add(newStr);
                            queue1.add(newStr);
                        }
                    }
                    if (Y - 1 >= 1) {
                        String newStr = X + " " + (Y - 1);
                        if (!mySet.contains(newStr)) {
                            mySet.add(newStr);
                            queue1.add(newStr);
                        }
                    }
                    if (Y + 1 <= c) {
                        String newStr = X + " " + (Y + 1);
                        if (!mySet.contains(newStr)) {
                            mySet.add(newStr);
                            queue1.add(newStr);
                        }
                    }
                }
                flag = 1;
            }

            counter++;
        }
        
        System.out.println(counter);
    }
}

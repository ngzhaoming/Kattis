import java.util.*;
import java.io.*;

public class Teque {

    public static HashMap<Integer, Integer> front = new HashMap<>();
    public static HashMap<Integer, Integer> back = new HashMap<>();

    public static int frontStart = 0;
    public static int backStart = 0;

    public static int frontEnd = 0;
    public static int backEnd = 0;
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            int num = Integer.parseInt(command[1]);

            if (command[0].equals("push_back")) {
                back.put(backEnd, num);
                backEnd++;
                balance();
            } else if (command[0].equals("push_front")) {
                frontStart -= 1;
                front.put(frontStart, num);
                balance();
            } else if (command[0].equals("push_middle")) {
                if (front.size() == back.size()) {
                    backStart--;
                    back.put(backStart, num);
                } else {
                    // The back hash has more elements
                    front.put(frontEnd, back.get(backStart));
                    back.replace(backStart, num);
                    frontEnd++;
                }
            } else {
                if (num < front.size()) {
                    out.write(front.get(frontStart + num) + "\n");
                } else {
                    num -= front.size();
                    out.write(back.get(backStart + num) + "\n");
                }
            }
        }
        out.flush();
    }

    private static void balance() {
        if (front.size() > back.size()) {
            frontEnd--;
            backStart--;
            back.put(backStart, front.get(frontEnd));
            front.remove(frontEnd);
        }

        if (back.size() > front.size() + 1) {
            front.put(frontEnd, back.get(backStart));
            back.remove(backStart);
            frontEnd++;
            backStart++;
        }
    }
}
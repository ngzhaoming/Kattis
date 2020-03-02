import java.util.*;
import java.io.*;

public class Teque_Skeletal {

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

            } else if (command[0].equals("push_front")) {

            } else if (command[0].equals("push_middle")) {

            } else {
                // This is the get function call
            }
        }
        out.flush();
    }
}
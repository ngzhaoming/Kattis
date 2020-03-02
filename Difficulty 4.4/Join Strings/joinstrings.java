import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class joinstrings {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int storage = 0;

        int num = Integer.parseInt(br.readLine());
        StringBuilder[] arr = new StringBuilder[num];

        for (int i = 0; i < num; i++) {
            arr[i] = new StringBuilder(br.readLine());
        }

        String line = "";
        while((line = br.readLine()) != null) {
            System.out.println(line);
            String[] input = line.split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            arr[a - 1] = arr[a - 1].append(arr[b - 1]);

            storage = a;
        }

        // System.out.println(arr[storage].toString());
    }
}

import java.util.Scanner;

public class NumberTree {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long height = Long.parseLong(input[0]);

        long total = (long) Math.pow(2, height + 1) - 1;

        long end = 1;
        
        if (input.length == 1) {
            // Just give the parent node
            System.out.println(total);
        } else {
            // Find the end of the node
            String inst = input[1];
            for (int i = 0; i < inst.length(); i++) {
                char currChar = inst.charAt(i);
                if (currChar == 'L') {
                    end *= 2;
                } else {
                    end = end * 2 + 1;         
                }
            }

            System.out.println(total - end + 1);
        }
    }
}

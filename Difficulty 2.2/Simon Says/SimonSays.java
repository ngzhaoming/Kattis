import java.util.Scanner;

public class SimonSays{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            if (input.matches("(simon says)[\\s\\S]*")) {
                String output = "";
                String[] list = input.split(" ");
                for (int j = 2; j < list.length; j++) {
                    output = output + list[j];
                    if (j != list.length - 1) {
                        output += " ";
                    }
                }
                System.out.println(output);
            } else {
                System.out.println();
            }
        }
    }
}

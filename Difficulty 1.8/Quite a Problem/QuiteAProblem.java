import java.util.Scanner;

public class QuiteAProblem{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] list = sc.nextLine().split(" ");
            boolean flag = true;
            for (int i = 0; i < list.length; i++) {
                String curr = list[i].toUpperCase();
                if (curr.matches("[\\S]*[P](ROBLEM)[\\S]*")) {
                    System.out.println("yes");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("no");
            }
        }
    }
}

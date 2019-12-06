import java.util.Scanner;

public class BabyBites{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 1;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String currInput = sc.next();
            if (currInput.length() == 6) { //This is mumble
                count++;
            } else if (currInput.length() < 6) {
                if (count != Integer.parseInt(currInput)) {
                    flag = false;
                    break;
                } else {
                    count++;
                }
            }
        }

        if (flag) {
            System.out.println("makes sense");
        } else {
            System.out.println("something is fishy");
        }
    }
}

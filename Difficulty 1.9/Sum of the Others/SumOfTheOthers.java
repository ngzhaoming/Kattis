import java.util.Scanner;

public class SumOfTheOthers{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] list = sc.nextLine().split(" ");
            int[] listNum = new int[list.length];
            int total = 0;
            for (int i = 0; i < list.length; i++) {
                int val = Integer.parseInt(list[i]);
                total += val;
                listNum[i] = val;
            }

            int num = 0;
            for (int i = 0; i < listNum.length; i++) {
                int change = total - listNum[i];
                if (change == listNum[i]) {
                    num = listNum[i];
                    break;
                }
            }
            System.out.println(num);
        }
    }
}

import java.util.Scanner;

public class SavingPrincessPeach{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int x = sc.nextInt();
        int counter = 0;
        int[] list = new int[total];
        for(int i = 0; i < x; i++) {
            list[sc.nextInt()]++;
        }
        for(int i = 0; i < list.length; i++) {
            if (list[i] == 0) {
                counter++;
                System.out.println(i);
            }
        }
        int result = total - counter;
        System.out.println(String.format("Mario got %d of the dangerous obstacles.", result));
    }
}

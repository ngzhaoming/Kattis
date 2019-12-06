import java.util.Scanner;

public class OneChicken{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int chicken = sc.nextInt();
        int diff = chicken - people;
        if (diff > 0) {
            if (diff > 1) {
                System.out.println(String.format("Dr. Chaz will have %d pieces of chicken left over!", diff));
            } else {
                System.out.println(String.format("Dr. Chaz will have %d piece of chicken left over!", diff));
            }
        } else {
            int diff2 = people - chicken;
            if (diff2 > 1) {
                System.out.println(String.format("Dr. Chaz needs %d more pieces of chicken!", diff2));
            } else {
                System.out.println(String.format("Dr. Chaz needs %d more piece of chicken!", diff2));
            }
        }
    }
}

import java.util.Scanner;

public class EventPlanning{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int budget = sc.nextInt();
        int hotels = sc.nextInt();
        int weeks = sc.nextInt();
        int currLowest = 1000000;
        for (int i = 0; i < hotels; i++) {
            int priceCurr = sc.nextInt();
            if (priceCurr < currLowest && (priceCurr * people) <= budget) {
                sc.nextLine();
                String[] list = sc.nextLine().split(" ");
                for (int j = 0; j < weeks; j++) {
                    int currRoom = Integer.parseInt(list[j]);
                    if (currRoom >= people) {
                        currLowest = priceCurr;
                        break;
                    }
                }
            } else {
                sc.nextLine();
                sc.nextLine();
                continue;
            }
        }

        if (currLowest == 1000000) {
            System.out.println("stay home");
        } else {
            System.out.println(currLowest * people);
        }
    }
}

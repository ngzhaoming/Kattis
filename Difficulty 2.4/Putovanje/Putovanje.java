import java.util.Scanner;

public class Putovanje{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cap = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }

        int highest = 0;
        int currCap = 0;
        int currFruitCount = 0;
        for (int i = 0;  i < n; i++) {
            for (int j = i; j < n; j++) { // Decides to start eating
                int currFruit = list[j];
                if ((currCap + currFruit) < cap) {
                    currCap += currFruit;
                    currFruitCount++;
                } else if ((currCap + currFruit) == cap) { 
                    currFruitCount++;
                    if (currFruitCount > highest) {
                        highest = currFruitCount;
                    }
                    currCap = 0;
                    currFruitCount = 0;
                    break;
                }

                if (j == n - 1) {
                    if (currFruitCount > highest) {
                        highest = currFruitCount;
                    }
                    currFruitCount = 0;
                    currCap = 0;
                }
            }
        }
        System.out.println(highest);
    }
}

import java.util.Scanner;

public class Hardware {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int[] quan = new int[10];

            String address = sc.nextLine();
            String num = sc.nextLine();

            // Print out the street and number of addresses first
            System.out.println(address);
            System.out.println(num);

            int value = Integer.parseInt(num.split(" ")[0]);

            int counter = 0;

            while (counter != value) {
                String[] currLine = sc.nextLine().split(" ");

                if (currLine.length > 1) {
                    int start = Integer.parseInt(currLine[1]);
                    int end = Integer.parseInt(currLine[2]);
                    int interval = Integer.parseInt(currLine[3]);
                    for (int j = start; j <= end; j = j + interval) {
                        quan = countVal(quan, j);
                        counter++;
                    }
                } else {
                    quan = countVal(quan, Integer.parseInt(currLine[0]));
                    counter++;
                }
            }

            int total = 0;
            for (int j = 0; j < quan.length; j++) {
                int currVal = quan[j];
                total += currVal;
                System.out.println("Make " + quan[j] + " digit " + j);
            }

            if (total == 1) {
                System.out.println("In total " + total + " digit");
            } else {
                System.out.println("In total " + total + " digits");
            }
        }
    }

    public static int[] countVal(int[] quan, int value) {
        while (value > 0) {
            int digit = value % 10;
            quan[digit]++;
            value /= 10;
        }

        return quan;
    }
}

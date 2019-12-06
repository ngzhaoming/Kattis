import java.util.Scanner;

public class CarouselRides{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean flag = false;
            if (n == 0 && m == 0) {
                break;
            }
            double lowest = Double.MAX_VALUE;
            int lowTix = -1;
            int lowTotal = -1;
            for (int i = 0; i < n; i++) {
                int tickets = sc.nextInt();
                int totalPrice = sc.nextInt();
                if (tickets <= m) {
                    double one = (double) totalPrice / tickets;
                    if (one < lowest) {
                        lowest = one;
                        lowTix = tickets;
                        lowTotal = totalPrice;
                        flag = true;
                    } else if (one == lowest) {
                        if (tickets > lowTix) {
                            lowTix = tickets;
                            lowTotal = totalPrice;
                            flag = true;
                        }
                    }
                }
            }

            if (flag) {
                System.out.println(String.format("Buy %d tickets for $%d", lowTix, lowTotal));
            } else {
                System.out.println("No suitable tickets offered");
            }
        }
    }
}

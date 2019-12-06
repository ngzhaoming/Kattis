import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Splat{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) { //How many pictures
            int drops = sc.nextInt();
            ArrayList<Paint> list = new ArrayList<>();
            for (int j = 0; j < drops; j++) {
                Paint paint = new Paint(sc.nextDouble(), sc.nextDouble(), 
                                    sc.nextDouble(), sc.next());
                list.add(paint);
            }
            int test = sc.nextInt();
            String result = "white";
            for (int j = 0; j < test; j++) {
                double X2 = sc.nextDouble();
                double Y2 = sc.nextDouble();
                for (int k = list.size() - 1; k >= 0; k--) {
                    Paint currPaint = list.get(k);
                    if (currPaint.inside(X2, Y2)) {
                        result = currPaint.colour;
                        break;
                    }
                }
                System.out.println(result);
                result = "white";
            }
        }
    }
}

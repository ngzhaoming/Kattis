import java.util.Scanner;

public class ConvexPolygonArea{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double area = 0;
            int coor = sc.nextInt();
            double[] xList = new double[coor + 1];
            double[] yList = new double[coor + 1];
            for (int j = 0; j < coor; j++) {
                double xval = sc.nextDouble();
                double yval = sc.nextDouble();
                if (j == 0) {
                    xList[coor] = xval;
                    yList[coor] = yval;
                } 

                xList[j] = xval; 
                yList[j] = yval;
            }

            for (int j = 0; j < coor; j++) {
                area = area + (xList[j] * yList[j + 1]) - (yList[j] * xList[j + 1]);
            }

            area /= 2;

            if (area % 1 == 0) {
                System.out.println((int) area);
            } else {
                System.out.println(area);
            }
        }
    }
}

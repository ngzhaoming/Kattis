import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class HittingTheTargets{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<shapes> shapeList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            if (type.equals("rectangle")) {
                shapes s1 = new shapes(type, sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble(), sc.nextDouble());
                shapeList.add(s1);
            } else {
                shapes s2 = new shapes(type, sc.nextDouble(), sc.nextDouble(),
                    sc.nextDouble());
                shapeList.add(s2);
            }
        }

        int shots = sc.nextInt();
        for (int i = 0; i < shots; i++) {
            double currX = sc.nextDouble();
            double currY = sc.nextDouble();
            int counter = 0;
            for (int j = 0; j < shapeList.size(); j++) {
                shapes currShape = shapeList.get(j);
                if (currShape.shape.equals("rectangle")) {
                    if (currX >= currShape.x1 && currX <= currShape.x2
                        && currY >= currShape.y1 && currY <= currShape.y2) {
                        counter++;
                    }
                } else { //circle
                    double xX = Math.pow((currX - currShape.x1), 2);
                    double yY = Math.pow((currY - currShape.y1), 2);
                    if ((xX + yY) <= Math.pow(currShape.radius, 2)) {
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
    }
}

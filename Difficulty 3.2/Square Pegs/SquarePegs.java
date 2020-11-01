import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class SquarePegs {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Double> land = new ArrayList<>();
        ArrayList<Double> house = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            land.add(sc.nextDouble());
        }

        for (int i = 0; i < m; i++) {
            house.add(sc.nextDouble());
        }
            
        for (int i = 0; i < k; i++) {
            double curr = sc.nextDouble();
            double square = Math.pow(curr, 2); 
            double diag = Math.sqrt(square + square) / 2;
            house.add(diag);
        }

        Collections.sort(land);
        Collections.sort(house);
        Collections.reverse(house);

        int total = 0;

        for(int i = 0; i < land.size(); i++) {
            double currSize = land.get(i);
            for(int j = 0; j < house.size(); j++) {
                double currHouse = house.get(j);

                if (currHouse < currSize) {
                    total++;
                    house.remove(currHouse);
                    break;
                }
            }
        }

        System.out.println(total);
    }
}

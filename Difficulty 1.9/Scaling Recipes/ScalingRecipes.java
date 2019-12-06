import java.util.Scanner;
import java.util.ArrayList;

public class ScalingRecipes{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int ingredients = sc.nextInt();
            double portion = sc.nextDouble();
            double desired = sc.nextDouble();
            double scaling = desired / portion;
            double sWeight = 0;
            ArrayList<Food> foodList = new ArrayList<>();
            sc.nextLine();
            for (int j = 0; j < ingredients; j++) {
                String[] list = sc.nextLine().split(" ");
                if (list[2].equals("100.0")) {
                    sWeight  = Double.parseDouble(list[1]) * scaling;
                }
                Food food = new Food(list[0], list[1], list[2]);
                foodList.add(food);
            }

            System.out.println(String.format("Recipe # %d", i + 1));
            for (int j = 0; j < foodList.size(); j++) {
                Food currFood = foodList.get(j);
                if (currFood.percentage.equals("100.0")) {
                    System.out.println(String.format("%s %.1f", currFood.name, sWeight));
                } else {
                    System.out.println(String.format("%s %.1f", currFood.name, (Double.parseDouble(currFood.percentage) * sWeight) / 100));
                }
            }
            System.out.println("----------------------------------------");
        }
    }
}

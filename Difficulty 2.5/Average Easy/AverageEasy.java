import java.util.Scanner;
import java.util.ArrayList;

public class AverageEasy {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // For each individual test case
            int cs = sc.nextInt();
            int ec = sc.nextInt();

            double csTotal = 0.0;
            double ecTotal = 0.0;

            ArrayList<Double> csList = new ArrayList<>();
            ArrayList<Double> ecList = new ArrayList<>();
            int total = 0;

            for (int j = 0; j < cs; j++) {
                double curr = sc.nextDouble();
                csList.add(curr);
                csTotal += curr;
            }

            for (int j = 0; j < ec; j++) {
                double curr = sc.nextDouble();
                ecList.add(curr);
                ecTotal += curr;
            }

            double csAverage = csTotal / (double)cs;
            double ecAverage = ecTotal / (double)ec;

            for (int j = 0; j < cs; j++) {
                double currVal = csList.get(j);
                double newCs = (csTotal - currVal) / (double)(cs - 1);
                double newEc = (ecTotal + currVal) / (double)(ec + 1);
                if (newCs > csAverage && newEc > ecAverage) {
                    total++;
                }
            }

            System.out.println(total);
        }
    }
}

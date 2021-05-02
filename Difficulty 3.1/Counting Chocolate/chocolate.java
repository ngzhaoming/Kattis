import java.util.Scanner;

public class chocolate {
    static int memorize[][];

    public static int minDiffSubsets(int arr[], int i, int calculatedSum, int total) {
        if (memorize[i][calculatedSum] != -1) {
            return memorize[i][calculatedSum];
        }
  
        /**
         * If i=0, then the sum of one subset has been calculated as we have reached the last
         * element. The sum of another subset is totalSum - calculated sum. We need to return the
         * difference between them.
         */
        if(i == 0) {
            return Math.abs((total - calculatedSum) - calculatedSum);
        }

        //Including the ith element
        int iElementIncluded = minDiffSubsets(arr, i-1, arr[i-1] + calculatedSum, total);

        //Excluding the ith element
        int iElementExcluded = minDiffSubsets(arr, i-1, calculatedSum, total);

        int res = Math.min(iElementIncluded, iElementExcluded);
        memorize[i][calculatedSum] = res;
        return res;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        int total = 0;
        for (int i = 0; i < N; i++) {
            int currVal = sc.nextInt();
            list[i] = currVal;
            total += currVal;
        }

        if (total % 2 != 0) {
            System.out.println("NO");
            return;
        }

        memorize = new int[N + 1][total + 1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= total; j++) {
                memorize[i][j] = -1;
            }
        }

        int res = minDiffSubsets(list, N, 0, total);
        if (res == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
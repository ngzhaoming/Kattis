public class MinimumSubsetSum {

  static int dp[][];
  public static int minDiffSubsets(int arr[], int i, int calculatedSum, int totalSum) {

        if (dp[i][calculatedSum] != -1) {
          return dp[i][calculatedSum];
        }

        /**
         * If i=0, then the sum of one subset has been calculated as we have reached the last
         * element. The sum of another subset is totalSum - calculated sum. We need to return the
         * difference between them.
         */
        if(i == 0) {
          return Math.abs((totalSum - calculatedSum) - calculatedSum);
        }

        //Including the ith element
        int iElementIncluded = minDiffSubsets(arr, i-1, arr[i-1] + calculatedSum,
            totalSum);

        //Excluding the ith element
        int iElementExcluded = minDiffSubsets(arr, i-1, calculatedSum, totalSum);

        int res = Math.min(iElementIncluded, iElementExcluded);
        dp[i][calculatedSum] = res;
        return res;
  }

  public static void util(int arr[]) {
        int totalSum = 0;
        int n = arr.length;
        for(Integer e : arr) totalSum += e;
        dp = new int[n+1][totalSum+1];
        for(int i=0; i <= n; i++)
          for(int j=0; j <= totalSum; j++)
            dp[i][j] = -1;

        int res = minDiffSubsets(arr, n, 0, totalSum);
        System.out.println("The min difference between two subset is " + res);
  }


  public static void main(String[] args) {
        util(new int[]{1, 4, 3, 12, 13, 1});
  }

}

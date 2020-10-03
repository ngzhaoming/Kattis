import java.util.Scanner;

public class RadioCommercial {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int price = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            arr[i] = (sc.nextInt() - price);
        }

        System.out.println(Kadanes(arr));
    }

    public static int Kadanes(int[] array){
        int n = array.length;
        int[] dp = new int[n];

        //base condition
        dp[0] = array[0];

        int answer = Integer.MIN_VALUE; //Keeps track of the current max subarray

        for(int i = 1; i < n; i++){
            dp[i] = Math.max(dp[i - 1], 0) + array[i]; //Check whether previous is profitable
            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }
}

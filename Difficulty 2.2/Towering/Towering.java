import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Towering {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int first = sc.nextInt();
        int second = sc.nextInt();
        
        ArrayList<int[]> result = listPermutations(arr);
        
        for (int i = 0; i < result.size(); i++) {
            int[] currPerm = result.get(i);

            int total1 = currPerm[0] + currPerm[1] + currPerm[2];
            int total2 = currPerm[3] + currPerm[4] + currPerm[5];

            if (total1 == first && total2 == second) {
                int[] first1 = {currPerm[0], currPerm[1], currPerm[2]};
                int[] second2 = {currPerm[3], currPerm[4], currPerm[5]};
                Arrays.sort(first1);
                Arrays.sort(second2);

                for (int j = 2; j >= 0; j--) {
                    System.out.print(first1[j] + " ");
                }

                for (int j = 2; j >= 0; j--) {
                    if (j != 0) {
                        System.out.print(second2[j] + " ");
                    } else {
                        System.out.print(second2[j]);
                        System.out.println();
                    }
                    
                }
                break;
            }
        }
    }

    public static ArrayList<int[]> listPermutations(int[] a) {
        ArrayList<int[]> results= new ArrayList<int[]>();
        listPermutations(a, 0, results);
        return results;
    }
     
    public static void listPermutations(int[] a, int start, List<int[]> result) {
        if (start >= a.length) {
            result.add(a.clone());
        } else {
            for (int i = start; i < a.length; i++) {
                swap(a, start, i);
                listPermutations(a, start+1, result);
                swap(a, start, i);
            }
        } 
    }
     
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

import java.util.Scanner;
import java.util.TreeSet;

public class Veci{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> mySet = new TreeSet<>();
        String input = sc.next();
        permutate("", input, mySet);
        if (mySet.higher(Integer.parseInt(input)) == null) {
            System.out.println(0);
        } else {
            System.out.println(mySet.higher(Integer.parseInt(input)));
        }
    }

    public static void permutate(String prefix, String remaining, TreeSet<Integer> mySet) {
        if (remaining.length() <= 0) {
            mySet.add(Integer.parseInt(prefix));
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permutate(prefix + remaining.charAt(i), 
                    remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()),
                        mySet);
            }
        }
    }

    public static void arrPermutate(int[] arr, int start, ArrayList<int[]> result) {
        if (start >= arr.length) {
            result.add(arr.clone());
        } else {
            for (int i = 0; i < arr.length; i++) {
                swap(arr, start, i);
                arrPermutate(arr, start + 1, result);
                swap(arr, start, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Redistribution{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<tuple> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr.add(new tuple(i, val));
        }

        Collections.sort(arr, new sortTuple());

        boolean verdict = checker(arr);

        if (verdict) {
            System.out.println("impossible");
        } else {
            for (int i = n - 1; i >= 0; i--) {
                if (i != 0) {
                    System.out.print(arr.get(i).getPos() + " ");
                } else {
                    System.out.print(arr.get(i).getPos());
                } 
            }
            System.out.println();
        }
    }

    public static boolean checker(ArrayList<tuple> arr) {
        int highest = arr.get(arr.size() - 1).val;
        int total = 0;

        for (int i = 0; i < arr.size() - 1; i++) {
            total += arr.get(i).val;
        }

        if (total < highest) {
            return true;
        }

        return false;
    }
}

class tuple {
    int pos = 0;
    int val = 0;

    public tuple(int pos, int val) {
        this.pos = pos;
        this.val = val;
    }

    public int getPos() {
        return pos + 1;
    }
}

class sortTuple implements Comparator<tuple> {
    public int compare(tuple a, tuple b) {
        return a.val - b.val;
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class WhatDoesTheFoxSay{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < input.length; j++) {
                list.add(input[j]);
            }

            ArrayList<String> sounds = new ArrayList<>(); 
            while (sc.hasNext()) {
                input = sc.nextLine().split(" ");
                if (input[0].equals("what")) {
                    list.removeAll(sounds);
                    break;
                } else {
                    sounds.add(input[2]);
                }
            }

            for (int j = 0; j < list.size(); j++) {
                if (j != list.size() - 1) {
                    System.out.print(list.get(j) + " ");
                } else {
                    System.out.print(list.get(j));
                }
            }
            System.out.println();
        }
    }
}

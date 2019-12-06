import java.util.Scanner;

public class CardTrick {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        String one = "1";
        String two = "2 1";
        String three = "3 1 2";
        String four = "2 1 4 3";
        String five = "3 1 4 5 2";
        String six  = "4 1 6 3 2 5";
        String seven = "5 1 3 4 2 6 7";
        String eight = "3 1 7 5 2 6 8 4";
        String nine = "7 1 8 6 2 9 4 5 3";
        String ten = "9 1 8 5 2 4 7 6 3 10";
        String eleven = "5 1 6 4 2 10 11 7 3 8 9";
        String twelve = "7 1 4 9 2 11 10 8 3 6 5 12";
        String thirteen= "4 1 13 11 2 10 6 7 3 5 12 9 8";

        for (int i = 0; i < testCase; i++) {
            int currnum = sc.nextInt();
            if (currnum == 1) {
                System.out.println(one);
            } else if (currnum == 2) {
                System.out.println(two);
            } else if (currnum == 3) {
                System.out.println(three);
            } else if (currnum == 4) {
                System.out.println(four);
            } else if (currnum == 5) {
                System.out.println(five);
            } else if (currnum == 6) {
                System.out.println(six);
            } else if (currnum == 7) {
                System.out.println(seven);
            } else if (currnum == 8) {
                System.out.println(eight);
            } else if (currnum == 9) {
                System.out.println(nine);
            } else if (currnum == 10) {
                System.out.println(ten);
            } else if (currnum == 11) {
                System.out.println(eleven);
            } else if (currnum == 12) {
                System.out.println(twelve);
            } else {
                System.out.println(thirteen);
            }
        }
    }

    public static int[] createArray(int num) {
        int[] result = new int[num];
        int currIndex = 0;
        for (int i = 0; i < num; i++) {
            result[(currIndex + i + 1) % num] = i + 1;
            currIndex += i + 2;
        }

        return result;
    }

    public static void printArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            if (i == result.length - 1) {
                System.out.print(result[i]);
                System.out.println();
            } else {
                System.out.print(result[i] + " ");
            }
        }
    }
}

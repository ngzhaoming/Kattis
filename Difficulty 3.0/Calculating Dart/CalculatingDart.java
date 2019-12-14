import java.util.Scanner;
import java.util.ArrayList;

public class CalculatingDart {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int required = sc.nextInt();
        ArrayList<Tuple> list = new ArrayList<>();
        int mul1 = 0;
        int mul2 = 0;
        int mul3 = 0;
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        for (int i = 0; i < 4; i++) {
            int result = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 1; l <= 20; l++) {
                        for (int m = 1; m <= 20; m++) {
                            for (int n = 1; n <= 20; n++) {
                                result = i * l + j * m + k * n;
                                if (result == required) {
                                    list.add(new Tuple(i, l));
                                    list.add(new Tuple(j, m));
                                    list.add(new Tuple(k, n));
                                    break;
                                }
                            }
                            if (result == required) {
                                break;
                            }
                        }
                        if (result == required) {
                            break;
                        }
                    }
                    if (result == required) {
                        break;
                    }
                }
                if (result == required) {
                    break;
                }
            }
            if (result == required) {
                break;
            }
        }

        printArray(list);
    }

    public static void printArray(ArrayList<Tuple> arr) {
        for (int i = 0; i < arr.size(); i++) {
            Tuple curr = arr.get(i);
            if (curr.multiplier.equals("None")) {
            } else {
                System.out.println(curr.multiplier + " " + curr.value);
            }
        }

        if (arr.size() == 0) {
            System.out.println("impossible");
        }
    }
}

class Tuple {
    int value;
    String multiplier;

    public Tuple(int mul, int value) {
        this.value = value;

        if (mul == 1) {
            multiplier = "single";
        } else if (mul == 2) {
            multiplier = "double";
        } else if (mul == 3) {
            multiplier = "triple";
        } else {
            multiplier = "None";
        }         
    }
}

import java.util.Scanner;

public class BestCompromise{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int len = sc.nextInt();
            String[] bin = new String[n];
            sc.nextLine();

            //store all the binary into an array
            for (int j = 0; j < n; j++) {
                bin[j] = sc.nextLine();
            }

            String result = "";
            for (int j = 0; j < len; j++) {
                int zero = 0;
                int one = 0;
                for (int k = 0; k < n; k++) {
                    char currChar = bin[k].charAt(j);
                    if (currChar == '0') {
                        zero++;
                    } else {
                        one++;
                    }
                }

                if (zero > one) {
                    result += "0";
                } else {
                    result += "1";
                }
            }

            System.out.println(result);
        }
    }
}

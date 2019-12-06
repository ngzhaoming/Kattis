import java.util.Scanner;

public class MosquitoMultiplication{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int adult = sc.nextInt();
            int pupae = sc.nextInt();
            int child = sc.nextInt();
            int laid = sc.nextInt(); //To multiply with adults
            int survive = sc.nextInt(); // To divide with  child 
            int hatch = sc.nextInt(); // To divide with pupae 
            int n = sc.nextInt();
            int temp = adult;
            for (int i = 0; i < n; i++) {
                adult = pupae / hatch;
                pupae = child / survive;
                child = temp * laid;
                temp = adult;
            }
            System.out.println(adult);
        }
    }
}

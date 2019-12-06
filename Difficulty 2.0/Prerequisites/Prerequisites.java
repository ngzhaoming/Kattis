import java.util.Scanner;
import java.util.HashSet;

public class Prerequisites{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            
            int category = sc.nextInt();
            boolean flag = true;
            HashSet<Integer> list = new HashSet<>();
            for (int i = 0; i < n; i++) {
                //Adding all the mods that he has selected
                list.add(sc.nextInt());
            }
            sc.nextLine();

            for (int i = 0; i < category; i++) {
                int counter = 0;
                String[] details = sc.nextLine().split(" ");
                
                if (flag) {
                    int total = Integer.parseInt(details[0]);
                    int min = Integer.parseInt(details[1]);
                    for (int j = 2; j < details.length; j++) {
                        int currMod = Integer.parseInt(details[j]);
                        if (list.contains(currMod)) {
                            counter++;
                        }
                    }

                    if (counter < min) {
                        flag = false;
                    }
                } 
            }

            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}

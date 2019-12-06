import java.util.Scanner;
import java.util.ArrayList;

public class Semafori{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = sc.nextInt();
        ArrayList<Traffic> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Traffic t1 = new Traffic(sc.nextInt(), sc.nextInt(),
                sc.nextInt());
            list.add(t1);
        }

        int currDist = 0;
        int currTime = 0;
        for (int i = 0; i < list.size(); i++) {
            Traffic currTraf = list.get(i);
            currTime += (currTraf.dist - currDist);
            currDist = currTraf.dist;
            //Calculate whether it is red or green
            checkState(currTraf, currTime);

            if (currTraf.state.equals("red")) {
                currTime += currTraf.waitingTime;
            }
        }

        if (currDist < length) {
            currTime += (length - currDist);
            currDist = length;
        }

        System.out.println(currTime);
    }

    public static void checkState(Traffic currTraf, int currTime) {
        int left = currTime % currTraf.cycle;
        if (left < currTraf.red) {
            currTraf.waitingTime = currTraf.red - left;  
        } else {
            currTraf.state = "green";
        }
    }
}

import java.util.Scanner;

public class Gerrymandering {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int totalVotes = 0;
        int totalWasted = 0; 
        int precincts = sc.nextInt();
        int numDist = sc.nextInt();
        district[] dist = new district[numDist];
        
        for (int i = 0; i < numDist; i++) {
            dist[i] = new district();
        }

        for (int i = 0; i < precincts; i++) {
            int distVal = sc.nextInt() - 1;
            int aVote = sc.nextInt();
            int bVote = sc.nextInt();
            totalVotes += aVote + bVote;

            dist[distVal].addA(aVote);
            dist[distVal].addB(bVote);
        }

        for (int i = 0; i < numDist; i++) {
            district currDist = dist[i];
            totalWasted += currDist.countWasted();
            System.out.println(currDist);
        }

        System.out.println(String.format("%.10f", (double) Math.abs(totalWasted) / totalVotes));
    }
}

class district {
    int A = 0;
    int B = 0;
    int aWasted = 0;
    int bWasted = 0;

    public void addA(int value) {
        A += value;
    }

    public void addB(int value) {
        B += value;
    }

    public int countWasted() {
        int totalDis = A + B;
        int winMark = totalDis / 2 + 1;

        if (A > B) {
            bWasted = B;
            aWasted = A - winMark;
        } else {
            aWasted = A;
            bWasted = B - winMark;
        }

        return aWasted - bWasted;
    }

    @Override    
    public String toString() {
        String result = "";
        if (A > B) {
            result += "A " + aWasted + " " + bWasted;
        } else {
            result += "B " + aWasted + " " + bWasted;
        }

        return result;
    }
}

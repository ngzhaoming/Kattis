import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

public class Recount{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> myList = new TreeMap<>();
        while (sc.hasNext()) {
            String name = sc.nextLine() + "";
            if (name.equals("***")) {
                break;
            } else {
                if (myList.containsKey(name)) {
                    int votes = myList.get(name);
                    myList.replace(name, votes + 1);
                } else {
                    myList.put(name, 1);
                }
            }
        }
        
        ArrayList<String> highestVotes = new ArrayList<>();
        Iterator names = myList.keySet().iterator();
        int currHighest = -1;
        while (names.hasNext()) {
            String currName = names.next() + "";
            int votes = myList.get(currName);
            if (votes > currHighest) {
                highestVotes.clear();
                highestVotes.add(currName);
                currHighest = votes;
            } else if (votes == currHighest) {
                highestVotes.add(currName);
            }
        }
        
        if (highestVotes.size() == 1) {
            System.out.println(highestVotes.get(0));
        } else {
            System.out.println("Runoff!");
        }
    }
}

import java.util.Scanner;

public class MusicalNotation {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int notes = sc.nextInt();
        sc.nextLine();

        String[] arr = sc.nextLine().split(" ");

        char[] startNotes = {'G', 'F', 'E', 'D', 'C', 'B', 'A',
            'g', 'f', 'e', 'd', 'c', 'b', 'a'};

        for (int j = 0; j < startNotes.length; j++) { 
            String result = "";
            char noteRecord = startNotes[j];
            result += noteRecord + ": ";
            char filler = getFiller(noteRecord);
            // Traversing through the array of notes
            for (int i = 0; i < arr.length; i++) {
                String currLetter = arr[i];
                char note = currLetter.charAt(0);
                int times = 1;

                if (currLetter.length() > 1) {
                    times = Integer.parseInt(currLetter.substring(1));
                }
                

                for (int k = 0; k < times; k++) {
                    if (note == noteRecord) {
                        result += "*";
                    } else {
                        result += filler;
                    }
                }

                if (i != (arr.length - 1)) {
                    result += filler;
                }
            }
            System.out.println(result);
        }
    }

    public static char getFiller(char note) {
        if (note == 'F' || note == 'D' || note == 'B'
            || note == 'g' || note == 'e' || note == 'a') {
            return '-';
        } else {
            return ' ';
        }
    }
}

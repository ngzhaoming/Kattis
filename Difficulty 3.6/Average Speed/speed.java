import java.util.Scanner;

public class speed {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double currSpeed = 0.0;
        double total = 0.0;
        double prevTime = 0.0;
        double prevDist = 0.0;
        while (sc.hasNext()) {
            String[] arr = sc.nextLine().split(" ");

            String[] timestamp = arr[0].split(":");
            double timeSec = 0.0;
            timeSec += Double.parseDouble(timestamp[0]) * 3600;
            timeSec += Double.parseDouble(timestamp[1]) * 60;
            timeSec += Double.parseDouble(timestamp[2]);

            total += (timeSec - prevTime) * currSpeed;
            prevTime = timeSec;

            // Add the distance first before changing speed
            if (arr.length == 2) {
                currSpeed = Double.parseDouble(arr[1]) / 3600;
            } else {
                System.out.printf("%s %.2f km\n", arr[0], total);     
            }
        }
    }
}

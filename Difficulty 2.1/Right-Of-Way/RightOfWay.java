import java.util.Scanner;

public class RightOfWay {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String start = sc.next(); 
        String end = sc.next();
        String other = sc.next();
        
        boolean flag = true;

        switch(start) {
            case "North":
                if (end.equals("South") && other.equals("West")) {
                    flag = false;
                    break;
                }

                if (end.equals("East") && (other.equals("West") || other.equals("South"))) {
                    flag = false;
                    break;
                }
                break;

            case "South":
                if (end.equals("North") && other.equals("East")) {
                    flag = false;
                    break;
                }

                if (end.equals("West") && (other.equals("East") || other.equals("North"))) {
                    flag = false;
                    break;
                }
                break;

            case "East":
                if (end.equals("West") && other.equals("North")) {
                    flag = false;
                    break;
                }

                if (end.equals("South") && (other.equals("West") || other.equals("North"))) {
                    flag = false;
                    break;
                }
                break;

            case "West":
                if (end.equals("East") && other.equals("South")) {
                    flag = false;
                    break;
                }

                if (end.equals("North") && (other.equals("East") || other.equals("South"))) {
                    flag = false;
                    break;
                }
                break;

            default:
                break;
        }

        if (flag) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}

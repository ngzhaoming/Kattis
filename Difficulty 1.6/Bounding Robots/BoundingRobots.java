import java.util.Scanner;

public class BoundingRobots {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int length = sc.nextInt();

        while (width != 0 && length != 0) {
            int cases = sc.nextInt();
            int robWid = 0;
            int robLen = 0;
            int actWid = 0;
            int actLen = 0;

            for (int i = 0; i < cases; i++) {
                String direction = sc.next();
                int dist = sc.nextInt();

                if (direction.equals("u")) {
                    robLen += dist;
                    actLen += dist;

                    if (actLen >= length) {
                        actLen = length - 1;
                    }
                }

                if (direction.equals("d")) {
                    robLen -= dist;
                    actLen -= dist;

                    if (actLen < 0) {
                        actLen = 0;
                    }
                }

                if (direction.equals("l")) {
                    robWid -= dist;
                    actWid -= dist;

                    if (actWid < 0) {
                        actWid = 0;
                    }
                }

                if (direction.equals("r")) {
                    robWid += dist;
                    actWid += dist;

                    if (actWid >= width) {
                        actWid = width - 1;
                    }
                }
            }

            System.out.println("Robot thinks " + robWid + " " + robLen);
            System.out.println("Actually at " + actWid + " " + actLen);
            System.out.println();

            width = sc.nextInt();
            length = sc.nextInt();
        }
    }
}

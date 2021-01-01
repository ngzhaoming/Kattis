import java.util.Scanner;

public class astro {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            String month = sc.next();
            sc.nextLine();

            if (month.equals("Jan")) {
                if (day <= 20) {
                    System.out.println("Capricorn");
                } else {
                    System.out.println("Aquarius");
                }
            } else if (month.equals("Feb")) {
                if (day <= 19) {
                    System.out.println("Aquarius");
                } else {
                    System.out.println("Pisces");
                }
            } else if (month.equals("Mar")) {
                if (day <= 20) {
                    System.out.println("Pisces");
                } else {
                    System.out.println("Aries");
                }
            } else if (month.equals("Apr")) {
                if (day <= 20) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Taurus");
                }
            } else if (month.equals("May")) {
                if (day <= 20) {
                    System.out.println("Taurus");
                } else {
                    System.out.println("Gemini");
                }
            } else if (month.equals("Jun")) {
                if (day <= 21) {
                    System.out.println("Gemini");
                } else {
                    System.out.println("Cancer");
                }
            } else if (month.equals("Jul")) {
                if (day <= 22) {
                    System.out.println("Cancer");
                } else {
                    System.out.println("Leo");
                }
            } else if (month.equals("Aug")) {
                if (day <= 22) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Virgo");
                }
            } else if (month.equals("Sep")) {
                if (day <= 21) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Libra");
                }
            } else if (month.equals("Oct")) {
                if (day <= 22) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Scorpio");
                }
            } else if (month.equals("Nov")) {
                if (day <= 22) {
                    System.out.println("Scorpio");
                } else {
                    System.out.println("Sagittarius");
                }
            } else {
                // block is dec
                if (day <= 21) {
                    System.out.println("Sagittarius");
                } else {
                    System.out.println("Capricorn");
                }

            }
        }
    }
}

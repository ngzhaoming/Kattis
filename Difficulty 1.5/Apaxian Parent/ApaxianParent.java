import java.util.Scanner;

public class ApaxianParent {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String child = sc.next();
        String parent = sc.next();
        String lastChar = child.substring(child.length() - 1);
        
        if (lastChar.equals("e")) {
            System.out.println(child + "x" + parent);
        } else if (lastChar.equals("a") || lastChar.equals("i") || lastChar.equals("o") || lastChar.equals("u")) {
            child = child.substring(0, child.length() - 1);
            System.out.println(child + "ex" + parent);
        } else if (child.substring(child.length() - 2).equals("ex")) {
            System.out.println(child + parent);
        } else {
            System.out.println(child + "ex" + parent);
        }
    }
}

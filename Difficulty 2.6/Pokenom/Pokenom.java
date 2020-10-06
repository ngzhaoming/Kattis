import java.util.Scanner;
import java.util.HashSet;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Pokenom {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> pq1 = new ArrayList<>();
        ArrayList<Student> pq2 = new ArrayList<>();
        ArrayList<Student> pq3 = new ArrayList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long att = sc.nextLong();    
            long def = sc.nextLong();    
            long hp = sc.nextLong();    

            Student st = new Student(i, att, def, hp);
            pq1.add(st);
            pq2.add(st);
            pq3.add(st);
        }

        Collections.sort(pq1, new StudentAttComparator());
        Collections.sort(pq2, new StudentDefComparator());
        Collections.sort(pq3, new StudentHpComparator());

        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < k; i++) {
            int currPok = pq1.get(i).name;
            hash.add(currPok);
        }

        for (int i = 0; i < k; i++) {
            int currPok = pq2.get(i).name;
            hash.add(currPok);
        }

        for (int i = 0; i < k; i++) {
            int currPok = pq3.get(i).name;
            hash.add(currPok);
        }

        System.out.println(hash.size());        
    }
}

class StudentAttComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.att < s2.att) {
            return 1;
        } else if (s1.att > s2.att) {
            return -1;
        } else {
            return 0;
        }
    }
}

class StudentDefComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.def < s2.def) {
            return 1;
        } else if (s1.def > s2.def) {
            return -1;
        } else {
            return 0;
        }
    }
}

class StudentHpComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.hp < s2.hp) {
            return 1;
        } else if (s1.hp > s2.hp) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Student {
    public int name;
    public long att;
    public long def;
    public long hp;

    public Student(int name, long att, long def, long hp) {
        this.name = name;
        this.att = att;
        this.def = def;
        this.hp = hp;
    }
}

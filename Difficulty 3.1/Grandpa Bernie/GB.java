import java.io.BufferedInputStream;
import java.util.*;

public class GB {

    private Map<String, List<Integer>> memories;
    private Set<String> sorted;

    public GB(int capacity) {
        this.memories = new HashMap<>(capacity);
        this.sorted = new HashSet<>(capacity);
    }

    public void addMemory(String country, Integer year) {
        List<Integer> years = memories.get(country);
        if (years == null) {
            years = new ArrayList<>();
            memories.put(country, years);
        }
        years.add(year);
    }

    public Integer getYear(String country, int order) {
        List<Integer> years = memories.get(country);
        if (!sorted.contains(country)) {
            Collections.sort(years);
            memories.put(country, years);
            sorted.add(country);
        }
        return years.get(order - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int n = Integer.parseInt(sc.next());
        GB gb = new GB(n);
        for (int i = 0; i < n; i++) {
            gb.addMemory(sc.next(), sc.nextInt());
        }
        int q = Integer.parseInt(sc.next());
        for (int i = 0; i < q; i++) {
            System.out.print(gb.getYear(sc.next(), sc.nextInt()));
            System.out.print(System.lineSeparator());
        }
    }
}

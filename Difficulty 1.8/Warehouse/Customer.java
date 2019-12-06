public class Customer implements Comparable<Customer>{
    String name;
    int value;

    public Customer(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + " " + value;
    }

    @Override
    public int compareTo(Customer c) {
        int diff = this.value - c.value;
        if (diff > 0) {
            return -1;
        } else if (diff == 0) {
            int nameDiff = this.name.compareTo(c.name);
            if (nameDiff > 0) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 1;
        }
    }
}

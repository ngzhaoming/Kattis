import java.util.*;

public class cups {
    String colour;
    int size;

    public cups (String colour, int size) {
        this.colour = colour;
        this.size = size;
    }

    @Override
    public String toString() {
        return colour;
    }
}

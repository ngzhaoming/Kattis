public class Letters {
    char letter;
    int num;

    public Letters (char letter, int num) {
        this.letter = letter;
        this.num = num;
    }

    @Override
    public String toString() {
        String result = letter + "";
        return result;
    }
}

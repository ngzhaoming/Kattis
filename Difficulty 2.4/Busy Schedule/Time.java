public class Time {
    String type;
    int hour, min;
    Time (String[] list) {
        String[] time = list[0].split(":");
        hour = Integer.parseInt(time[0]);
        min = Integer.parseInt(time[1]);
        type = list[1];
    }

    public String toString() {
        return String.format("%d:%02d %s", hour, min, type);
    }
}

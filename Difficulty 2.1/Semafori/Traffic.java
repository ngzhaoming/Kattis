public class Traffic {
    int dist, red, green, cycle;
    String state = "red";
    int waitingTime = 0;

    Traffic (int dist, int red, int green) {
        this.dist = dist;    
        this.red = red;
        this.green = green;
        this.cycle = red + green;
    }
}

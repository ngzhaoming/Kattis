public class shapes {
    String shape;
    double x1, x2;
    double y1, y2;
    double radius;

    shapes(String shape, double x1, double y1, double x2, double y2) {
        this.shape = shape;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    shapes(String shape, double x1, double y1, double radius) {
        this.shape = shape;
        this.x1 = x1;
        this.y1 = y1;
        this.radius = radius;
    }
}

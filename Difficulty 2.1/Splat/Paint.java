import java.lang.Math;

public class Paint {
    double X, Y, vol;
    String colour;
    Paint(double X, double Y, double vol, String colour) {
        this.X = X;
        this.Y = Y;
        this.vol = vol;
        this.colour = colour;
    }

    public boolean inside(double X2,double Y2) {
        double radiusSq = vol / Math.PI;
        double eqn = Math.pow((this.X - X2), 2) + Math.pow((this.Y - Y2), 2);
        if (eqn <= radiusSq) {
            return true;
        } else {
            return false;
        }
    }
}

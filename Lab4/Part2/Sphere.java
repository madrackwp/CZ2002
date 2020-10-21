package Part2;

public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }

    public double calArea() {
        return 4 * super.calArea();
    }
}

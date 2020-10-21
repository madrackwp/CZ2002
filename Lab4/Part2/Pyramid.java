package Part2;

public class Pyramid extends Triangle {

    public Pyramid(double width, double height) {
        super(width, height);
    }

    public double calArea() {
        return 4 * super.calArea() + super.getWidth() * super.getWidth();
    }
}

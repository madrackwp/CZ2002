package Part2;

public class Cuboid extends Shape {

    private double height;
    private double width;
    private double length;
    private Rectangle rectA;
    private Rectangle rectB;
    private Rectangle rectC;

    public Cuboid(double width, double length, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.rectA = new Rectangle(this.height, this.length);
        this.rectB = new Rectangle(this.height, this.width);
        this.rectC = new Rectangle(this.length, this.width);
    }

    public double calArea() {
        return 2 * (rectA.calArea() + rectB.calArea() + rectC.calArea());
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }
}

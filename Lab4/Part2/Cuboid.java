package Part2;

public class Cuboid extends Rectangle {

    private double height;
    private Rectangle rect;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    double cuboidLength = super.getLength();
    double cuboidWidth = super.getWidth();

    private Rectangle rectA = new Rectangle(this.height, cuboidLength);
    private Rectangle rectB = new Rectangle(this.height, cuboidWidth);
    private Rectangle rectC = new Rectangle(cuboidWidth, cuboidLength);

    public double calArea() {
        return 2 * (rectA.calArea() + rectB.calArea() + rectC.calArea());
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return super.getWidth();
    }

    public double getLength() {
        return super.getLength();
    }

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(1, 2, 3);

        System.out.println(cuboid.calArea());
    }

}

package Part2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // public Rectangle() {
    // this(0, 0);
    // }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calArea() {
        return this.length * this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

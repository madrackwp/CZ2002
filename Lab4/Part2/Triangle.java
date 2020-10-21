package Part2;

public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double calArea() {
        return 0.5 * this.height * this.width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }
}

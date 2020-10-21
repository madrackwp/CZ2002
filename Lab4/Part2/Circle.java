package Part2;

public class Circle extends Shape {
    private final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calArea() {
        return pi * radius * radius;
    }

    public double getRadius() {
        return this.radius;
    }
}

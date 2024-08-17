package ra.bt4;

public class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Circle:" + (PI * radius * radius));
    }
}

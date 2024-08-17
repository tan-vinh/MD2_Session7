package ra.bt4;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Yellow", 5);
        Rectangle rect = new Rectangle("Red", 10, 20);

        c.getArea();
        c.display();

        rect.getArea();
        rect.display();
    }
}

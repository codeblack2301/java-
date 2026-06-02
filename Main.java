public class Main {

    public static void main(String[] args) {
        // Shape shape = new Shape();

        Circle circle = new Circle(5.00);
        Triangle triangle = new Triangle(23, 24);
        Rectangle rectangle = new Rectangle(23, 24);

        circle.display();
        triangle.display();
        rectangle.display();

        double value = circle.area();

        System.out.println(value);

    }

}
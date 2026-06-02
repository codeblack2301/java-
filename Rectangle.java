public class Rectangle extends Shape {
    double base;
    double hight;

    Rectangle(double base, double hight) {
        this.base = base;
        this.hight = hight;
    }

    @Override
    double area() {
        return base * hight;
    }
}

public class Triangle extends Shape {

    double base;
    double hight;

    Triangle(double base, double hight) {
        this.base = base;
        this.hight = hight;
    }

    @Override
    double area() {
        return base * hight / 2;
    }

}

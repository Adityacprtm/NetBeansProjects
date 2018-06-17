package TesTos;

public class Rectangle {

    double width;
    double height;

    public Rectangle(double newWidth, double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

}

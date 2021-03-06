package ShapeAndCircle;

/**
 * Created by RENT on 2017-08-22.
 */
public class Circle extends Shape {
    private double _radius = 1.0d;

    Circle() {
    }

    Circle(double radius) {
        _radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        _radius = radius;
    }

    public double getRadius() {
        return _radius;
    }

    public void setRadius(double radius) {
        _radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(_radius, 2d);
    }

    public double getPerimeter() {
        return 2 * Math.PI * _radius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Shape shape = new Shape();

        sb.append("A Circle with radius =")
                .append(_radius)
                .append(", which is a subclass of")
                .append(super.toString());

        return sb.toString();
    }
}

package Circle;

/**
 * Created by RENT on 2017-08-18.
 */
public class Circle {
    private double _radious = 1.0;
    private String _color = "red";

    public Circle(){}
    public Circle(double r){
        _radious = r;
    }

    public double get_radious() {
        return _radious;
    }

    public void set_radious(double radius) {
        _radious = radius;
    }
    public Circle(double r,String color){
        _radious = r;
        _color = color;
    }
    public String getColor(){
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radious,2d);
    }
    public String toString(){
        return "Circle[radius =" + _radious + ",color =" + _color + "]";
    }

}

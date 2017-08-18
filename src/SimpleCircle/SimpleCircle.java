package SimpleCircle;

/**
 * Created by RENT on 2017-08-18.
 */
public class SimpleCircle {
    private double _radius = 1.0;

    public SimpleCircle(){}
    public SimpleCircle(double r){
        _radius = r;
    }

    public double get_radius() {
        return _radius;
    }

    public void set_radius(double radius) {
        _radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radius,2d);
    }

    public double getCircumference(){
        return Math.PI*2*_radius;
    }
    public String toString(){
        return "Circle[radius="+_radius+"]";
    }
}

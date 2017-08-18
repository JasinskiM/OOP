package Rectangle;

/**
 * Created by RENT on 2017-08-18.
 */
public class Rectangle {
    private float _length = 1.0f;
    private float _width = 1.0f;

    public Rectangle(){}
    public Rectangle(float l, float w){
        _length = l;
        _width = w;
    }

    public float get_length(){
        return _length;
    }

    public void set_length(float length){
        _length = length;
    }
    public float get_width(){
        return _width;
    }
    public void set_width(float width){
        _width = width;
    }

    public double getArea(){
        return _width*_length;
    }

    public double getPerimeter(){
        return _width+_length;
    }

    public String toString(){
        return "Rectangle.Rectangle[length ="+ _length +",width =" + _width+"]";
    }
}

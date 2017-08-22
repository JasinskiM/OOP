package MoveablePoint;

/**
 * Created by RENT on 2017-08-22.
 */
public class Point {
    private float _x = 0.0f;
    private float _y = 0.0f;

    Point(float x, float y){
        _x = x;
        _y = y;
    }

    Point(){}

    public float getX(){
        return _x;
    }

    public void setX(float x){
        _x = x;
    }

    public float getY(){
        return _y;
    }

    public void setY(float y){
        _y = y;
    }

    public void setXY(float x, float y){
        _x = x;
        _y = y;
    }

    public float[] getXY(){
        return new float[] {_x, _y};
    }

    public String toString(){
        return "(x,y)";
    }
}

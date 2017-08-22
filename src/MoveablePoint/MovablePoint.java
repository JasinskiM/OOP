package MoveablePoint;

/**
 * Created by RENT on 2017-08-22.
 */
public class MovablePoint extends Point {
    private float _xSpeed = 0.0f;
    private float _ySpeed = 0.0f;

    MovablePoint(float x, float y, float xSpeed , float ySpeed){
        super(x,y);
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }

    MovablePoint(){}

    public float getXSpeed(){
        return  _xSpeed;
    }

    public void setxSpeed(float xSpeed){
        _xSpeed = xSpeed;
    }

    public float getYSpeed(){
        return _ySpeed;
    }

    public void setYSpeed(float ySpeed){
        _ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{_xSpeed, _ySpeed};
    }

    public String toString(){
        return "(x,y),speed=(xs,ys)";
    }

    public MovablePoint move(){
        setX(getX() +_xSpeed);
        setY(getY() + _ySpeed);
        return this;


    }
}

package MyPointAndCircle;

/**
 * Created by RENT on 2017-08-21.
 */
public class MyPoint {
    private int _x = 0;
    private int _y = 0;

    public MyPoint(){}
    public MyPoint(int x, int y){
        _x = x;
        _y = y;
    }

    public int getX(){
        return _x;
    }

    public void setX(int x){
        _x = x;
    }

    public int getY(){
        return _y;
    }

    public void setY(int y){
        _y = y;
    }

    public int[] getXY(){
        return new int[]{_x, _y};
    }

    public void setXY(int x, int y){
        _x = x;
        _y = y;
    }

    public String toString(){
        return "(x,y)";
    }

    public double distance(int x , int y){
        double d = Math.sqrt(Math.pow(_x-x,2)+Math.pow(_y-y,2));
        return d;
    }

    public double distance(MyPoint another){
        double d = Math.sqrt(Math.pow(_x-another._x,2)+Math.pow(_y-another._y,2));
        return d;
    }

    public double distance(){
        double d = Math.sqrt(Math.pow(_x-0,2)+Math.pow(_y-0,2));
        return d;
    }

}

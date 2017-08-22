package TwoDAndThreeD;

/**
 * Created by RENT on 2017-08-22.
 */
public class Point3D extends Point2D {
    private float _z = 0.0f;

    Point3D(float x, float y , float z){
        super(x,y);
        _z = z;
    }

    Point3D(){}

    public float getZ(){
        return _z;
    }

    public void setZ(float z){
        _z = z;
    }

    public void setXYZ(float x , float y, float z){
        setXY(x,y);
        _z = z;
    }

    public float[] getXYZ(){
        return new float[]{getX(),getY(),_z};
    }

}

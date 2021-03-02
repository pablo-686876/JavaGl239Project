package problem;

public class Vector {
    public double x;

    public double y;
    Vector(double a, double b){
x=a; y=b;
    }
    Vector(Vector a){
        this.x=a.x; this.y=a.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
}

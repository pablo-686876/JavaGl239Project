package problem;


import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import java.util.Random;

public class Triangle {
    public Vector a;
    public Vector b;
    public Vector c;

    Triangle(Vector a, Vector b, Vector c) {
        if ((a.x != b.x && b.x != c.x && a.x != c.x) && (a.y != b.y && b.y != c.y && a.y != c.y)) {
            Vector a1 = new Vector(a.x, a.y);
            Vector b1 = new Vector(b.x, b.y);
            Vector c1 = new Vector(c.x, c.y);
        }
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public void render(GL2 gl){
        Figures.renderTriangle(gl,a,b,c,false);
    }

    public static Triangle getRandomTriangle(){
        Random r= new Random();

    }

}


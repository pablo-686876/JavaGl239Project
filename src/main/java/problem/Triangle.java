package problem;


import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import java.util.Random;

public class Triangle {
    public Vector a;
    public Vector b;
    public Vector c;

    Triangle(Vector a, Vector b, Vector c) {
//        if ((a.x != b.x && b.x != c.x && a.x != c.x) && (a.y != b.y && b.y != c.y && a.y != c.y)) {
//            Vector a1 = new Vector(a.x, a.y);
//            Vector b1 = new Vector(b.x, b.y);
//            Vector c1 = new Vector(c.x, c.y);
//        }
        this.a = a;
        this.b = b;
        this.c = c;

    }

    Triangle(Point a, Point b, Point c) {
//        if ((a.x != b.x && b.x != c.x && a.x != c.x) && (a.y != b.y && b.y != c.y && a.y != c.y)) {
//            Vector a1 = new Vector(a.x, a.y);
//            Vector b1 = new Vector(b.x, b.y);
//            Vector c1 = new Vector(c.x, c.y);
//        }
        this.a = new Vector(a.x,a.y);
        this.b = new Vector(b.x,b.y);
        this.c = new Vector(c.x,c.y);

    }


    public static Triangle getRandomTriangles() {
        Random r = new Random();
        double x = r.nextDouble() * 2 - 1;
        double y = r.nextDouble() * 2 - 1;
        Random rr = new Random();
        double xx = rr.nextDouble() * 2 - 1;
        double yy = rr.nextDouble() * 2 - 1;
        Random rrr = new Random();
        double xxx = rrr.nextDouble() * 2 - 1;
        double yyy = rrr.nextDouble() * 2 - 1;
        return new Triangle(new Vector(x, y), new Vector(xx, yy), new Vector(xxx, yyy));

    }

    public void render(GL2 gl) {
        Figures.renderTriangle(gl, a, b, c, false);
    }

    public boolean isRegular() {
        return true;
    }
}


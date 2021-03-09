package problem;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;

public class Figures {
 public static void renderPoint(GL2 gl, Vector pos, float size){
     gl.glPointSize(size);
     gl.glBegin(GL.GL_POINTS);
     gl.glVertex2d(pos.x, pos.y);
     gl.glEnd();
 }
    public static  void renderLine(GL2 gl, Vector pos, Vector pos2, float width){
     gl.glLineWidth(width);
     gl.glBegin(GL.GL_LINE_STRIP);
     gl.glVertex2d(pos.x, pos.y);
     gl.glVertex2d(pos2.x, pos2.y);
     gl.glEnd();
    }
    public static void renderTriangle(GL2 gl, Vector pos, Vector pos2, Vector pos3, boolean filled ){
if (filled==true){
     gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex2d(pos.x, pos.y);
        gl.glVertex2d(pos2.x, pos2.y);
        gl.glVertex2d(pos3.x, pos3.y);
        gl.glEnd();}
else {
    gl.glBegin(GL.GL_LINE_STRIP);
    gl.glVertex2d(pos.x, pos.y);
    gl.glVertex2d(pos2.x, pos2.y);
    gl.glEnd();
    gl.glBegin(GL.GL_LINE_STRIP);
    gl.glVertex2d(pos2.x, pos2.y);
    gl.glVertex2d(pos3.x, pos3.y);
    gl.glEnd();
    gl.glBegin(GL.GL_LINE_STRIP);
    gl.glVertex2d(pos.x, pos.y);
    gl.glVertex2d(pos3.x, pos3.y);
    gl.glEnd();

}
    }
public static void renderQuad(GL2 gl, Vector pos, Vector pos2, Vector pos3, Vector pos4, boolean filled ){
     if(filled==true){
         gl.glBegin(GL.GL_TRIANGLES);
         gl.glVertex2d(pos.x, pos.y);
         gl.glVertex2d(pos2.x, pos2.y);
         gl.glVertex2d(pos3.x, pos3.y);
         gl.glEnd();
         gl.glBegin(GL.GL_TRIANGLES);
         gl.glVertex2d(pos3.x, pos3.y);
         gl.glVertex2d(pos4.x, pos4.y);
         gl.glVertex2d(pos.x, pos.y);
         gl.glEnd();
     }
     else{
         gl.glBegin(GL.GL_LINE_STRIP);
         gl.glVertex2d(pos.x, pos.y);
         gl.glVertex2d(pos2.x, pos2.y);
         gl.glEnd();
         gl.glBegin(GL.GL_LINE_STRIP);
         gl.glVertex2d(pos2.x, pos2.y);
         gl.glVertex2d(pos3.x, pos3.y);
         gl.glEnd();
         gl.glBegin(GL.GL_LINE_STRIP);
         gl.glVertex2d(pos4.x, pos4.y);
         gl.glVertex2d(pos3.x, pos3.y);
         gl.glEnd();
         gl.glBegin(GL.GL_LINE_STRIP);
         gl.glVertex2d(pos.x, pos.y);
         gl.glVertex2d(pos4.x, pos4.y);
         gl.glEnd();
     }
}
public static void renderCircle(GL2 gl, Vector centre, double rad, boolean filled){
  if(filled==true){
      gl.glBegin(GL.GL_TRIANGLE_FAN);
      gl.glVertex2d(centre.x, centre.y);
      for(int i=0; i<=360; i++){

          double x=rad*Math.cos(i)+ centre.x;
          double y=rad*Math.sin(i)+centre.y ;
          gl.glVertex2d(x, y);

      }gl.glEnd();

     }
  else{
      gl.glBegin(GL.GL_POINTS);
      for(int i=0; i<=360; i++){

          double x=rad*Math.cos(i)+ centre.x;
          double y=rad*Math.sin(i)+centre.y ;
          gl.glVertex2d(x, y);

      }gl.glEnd();

  }
  }


}



/**
 * IM BECOME A SPIDER!
 * I kill all of the bugs!!
 * Yeeaayyyy
 *
 *
 * (sad layf :((( )
 */
package entity;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import java.util.Random;
import java.lang.Math;

/**
 * Nyomot dari stackoverflow
 */
public class Hexagon {
  double [] points;
  double center;
  // double test = sqrt(5);
  public Hexagon(double side){
    center = getH(side);
    points = new double[12];
    //     X                          Y
    points[0] = 0.0;           points[1] = 0.0;
    points[2] = side;          points[3] = 0.0;
    points[4] = side+(side/2); points[5] = center;
    points[6] = side;          points[7] = center * 2;
    points[8] = 0.0;           points[9] = center * 2;
    points[10] = -side/2;      points[11] = center;

  }

  private double getH(double side) {
    return ((Math.sqrt(3)/2)*side);
  }
  public double [] getPoints(){
    return points;
  }
}
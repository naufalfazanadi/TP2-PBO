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
import entity.Hexagon;
import java.util.Random;
import java.lang.Math;

/**
 * Init polygon dari class Hexagon
 */
public class Hexa{
  Random rand = new Random();

  Polygon polygon = new Polygon(new Hexagon(50d).getPoints());

  float velocity;
  float x,y;
  float height, width;
  int backingX;
  int backingY;

  public Hexa(Group group){
    setPosition(-100,-100);
    setWidth(0);
    setHeight(0);
    setVelocity(0);
    setBackingX(1);
    setBackingY(1);
    polygon.setFill(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
    group.getChildren().add(polygon);
  }

  public void setBackingX (int back){
    this.backingX = back;
  }
  public void setBackingY (int back){
    this.backingY = back;
  }
  public void setWidth (float width){
    this.width = width;
    // polygon.setWidth(width);
  }
  public void setHeight (float height){
    this.height = height;
    // polygon.setHeight(height);
  }

  public void setPosition(float x, float y){
    this.x = x;
    this.y = y;
    polygon.setLayoutX(x + width);
    polygon.setLayoutY(y + height);
  }
  public void setColor(Color col){
    polygon.setFill(col);
  }
  public void setVelocity(float velocity){
    this.velocity = velocity;
  }

  public float getX(){
    return x;
  }
  public float getY(){
    return y;
  }
  public float getWidth(){
    return width;
  }
  public float getHeight(){
    return height;
  }
  public float getVelocity(){
    return velocity;
  }
  public int getBackingX(){
    return backingX;
  }
  public int getBackingY(){
    return backingY;
  }

}
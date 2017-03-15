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
import javafx.scene.shape.Rectangle;
import java.util.Random;

public class Kotak{
	Random rand = new Random();

	Rectangle rectangle = new Rectangle();

	float velocity;
	float x,y;
	float height, width;
	float arcHeight, arcWidth;
	int backingX;
	int backingY;

	public Kotak(Group group){
		setPosition(0,0);
		setWidth(0);
		setHeight(0);
		setVelocity(0);
		setBackingX(1);
		setBackingY(1);
		rectangle.setFill(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
		group.getChildren().add(rectangle);
	}

	public void setBackingX (int back){
		this.backingX = back;
	}
	public void setBackingY (int back){
		this.backingY = back;
	}
	public void setWidth (float width){
		this.width = width;
		rectangle.setWidth(width);
	}
	public void setHeight (float height){
		this.height = height;
		rectangle.setHeight(height);
	}
	public void setArcW (float arcWidth){
		this.arcWidth = arcWidth;
		rectangle.setArcWidth(arcWidth);
	}
	public void setArcH (float arcHeight){
		this.arcHeight = arcHeight;
		rectangle.setArcHeight(arcHeight);
	}

	public void setPosition(float x, float y){
		this.x = x;
		this.y = y;
		rectangle.setLayoutX(x + width);
		rectangle.setLayoutY(y + height);
	}
	public void setColor(Color col){
		rectangle.setFill(col);
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
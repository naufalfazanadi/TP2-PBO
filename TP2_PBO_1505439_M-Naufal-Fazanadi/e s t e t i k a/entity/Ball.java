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
import javafx.scene.shape.Circle;
import java.util.Random;

public class Ball{
	Random rand = new Random();

	Circle circle = new Circle();

	float velocity;
	float x,y;
	float radius;
	int backingX;
	int backingY;

	public Ball(Group group){
		setPosition(0,0);
		setRadius(0);
		setVelocity(0);
		setBackingX(1);
		setBackingY(1);
		circle.setFill(Color.rgb(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
		group.getChildren().add(circle);
	}

	public void setBackingX (int back){
		this.backingX = back;
	}
	public void setBackingY (int back){
		this.backingY = back;
	}
	public void setRadius (float radius){
		this.radius = radius;
		circle.setRadius(radius);
	}
	public void setPosition(float x, float y){
		this.x = x;
		this.y = y;
		circle.setLayoutX(x + radius);
		circle.setLayoutY(y + radius);
	}
	public void setColor(Color col){
		circle.setFill(col);
	}
	public void setVelocity(float velocity)
	{
		this.velocity = velocity;
	}

	public float getRadius(){
		return radius;
	}
	public float getX(){
		return x;
	}
	public float getY(){
		return y;
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
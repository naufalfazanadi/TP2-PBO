/**
 * IM BECOME A SPIDER!
 * I kill all of the bugs!!
 * Yeeaayyyy
 *
 *
 * (sad layf :((( )
 */

/**
 * Notes:
 * 		Property like color, size, velocity, direction are random
 * 		For hexagon the size not random because there's still a bug if random size
 * 		And used FONT "OSWALD"
 */

//import class from other file
import entity.Ball;
import entity.Kotak;
import entity.Hexa;
import global.Constant;
// Lib java
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.geometry.HPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;
import javafx.scene.shape.Rectangle;

public class GameLoop extends Application{
	// Randomizer
	Random rand = new Random();

	// object counter
	int counter = 0;

	public static void main(String[] args){
		Application.launch(args);
	}

	@Override
	public void start(Stage stage){
		Group root1 = new Group();
    Scene scene1 = new Scene(root1,Constant.WIDTH,Constant.HEIGHT,Color.rgb(241, 196, 15));

    Label appName = new Label("K  r  e  a  t  i  f    d  a  n    e  s  t  e  t  i  k  a");
    appName.setFont(Font.font("Oswald", 60));
    appName.setTextFill(Color.WHITE);
    appName.setLayoutX(85);
    appName.setLayoutY(110);
    root1.getChildren().add(appName);
		Button btnMulai = new Button("Mulai");
    btnMulai.setLayoutX(300);
    btnMulai.setLayoutY(280);
    btnMulai.setPrefWidth(400);
    btnMulai.setPrefHeight(100);
    btnMulai.setStyle("-fx-background-color: #e67e22;");
    btnMulai.setTextFill(Color.WHITE);
    btnMulai.setFont(Font.font("Oswald", 45));
    root1.getChildren().add(btnMulai);
		/* COPYRIGHT FOR MY NAME */
    Label nama = new Label("M. Naufal Fazanadi");
    nama.setFont(Font.font("Oswald", 24));
    nama.setTextFill(Color.WHITE);
    nama.setLayoutX(810);
    nama.setLayoutY(600);
    root1.getChildren().add(nama);
    Label nim = new Label("1505439");
    nim.setFont(Font.font("Oswald", 24));
    nim.setTextFill(Color.WHITE);
    nim.setLayoutX(25);
    nim.setLayoutY(600);
    root1.getChildren().add(nim);


		BorderPane border = new BorderPane();
		border.setStyle("-fx-background-color: #16a085;");

		Group root2 = new Group();
		root2.getChildren().add(border);

		HBox hbox = new HBox();
    hbox.setPadding(new Insets(10,10,10,10));
    hbox.setSpacing(10);
    hbox.setPrefSize(Constant.WIDTH, 50);

    final Pane spacer = new Pane();
    HBox.setHgrow(spacer, Priority.ALWAYS);
    spacer.setMinSize(10, 1);

    // Tombol Tambah
    Button buttonTambah = new Button("Tambah");
    buttonTambah.setPrefSize(100,20);
    buttonTambah.setStyle("-fx-background-color: #3498db;");
    buttonTambah.setTextFill(Color.WHITE);
    buttonTambah.setFont(Font.font("Oswald", 18));

  	Label jumlah = new Label();
		jumlah.setText("Jumlah Objek : " + counter);
		jumlah.setTextFill(Color.WHITE);
		jumlah.setFont(Font.font("Oswald", 18));

    buttonTambah.setOnAction(new EventHandler<ActionEvent>() {
		  @Override
		  public void handle(ActionEvent e) {
		  	counter++;
		  	jumlah.setText("Jumlah Objek : " + counter);

		  	int shape = rand.nextInt(4);
		  	/* INIT OBJECT */
				Kotak kubus = new Kotak(root2);
				Ball bola = new Ball(root2);
				Hexa hexagon = new Hexa(root2);

				/* RANDOMIZE THE DIRECTION */
				int randBackX = rand.nextInt(2);
				if (randBackX == 0) {
					randBackX = -1;
				} else {
					randBackX = 1;
				}
				int randBackY = rand.nextInt(2);
				if (randBackY == 0) {
					randBackY = -1;
				} else {
					randBackY = 1;
				}

				/* RANDOMIZE TO INIT THE SHAPE */
		  	if (shape == 0) {
		  		int sisi = rand.nextInt(40) + 20;
					kubus.setWidth(sisi);
					kubus.setHeight(sisi);
					kubus.setBackingX(randBackX);
					kubus.setBackingY(randBackY);

					int maxKubusX = Math.round(Constant.WIDTH - 4*kubus.getWidth());
					int maxKubusY = Math.round(Constant.HEIGHT - 4*kubus.getHeight());

					kubus.setPosition(rand.nextInt(maxKubusX), rand.nextInt(maxKubusY) + 59);
					kubus.setVelocity(rand.nextInt(7)+1);
		  	} else if (shape == 1) {
					bola.setRadius(rand.nextInt(50) + 10);
					bola.setBackingX(randBackX);
					bola.setBackingY(randBackY);

		  		int maxCircleX = Math.round(Constant.WIDTH - 4*bola.getRadius());
					int maxCircleY = Math.round(Constant.HEIGHT - 4*bola.getRadius());

					bola.setPosition(rand.nextInt(maxCircleX), rand.nextInt(maxCircleY) + 59);
					bola.setVelocity(rand.nextInt(7)+1);
		  	} else if (shape == 2) {
		  		int sisi = rand.nextInt(40) + 20;
					kubus.setWidth(sisi);
					kubus.setHeight(sisi);
					kubus.setBackingX(randBackX);
					kubus.setBackingY(randBackY);
					kubus.setArcW(23);
					kubus.setArcH(23);

					int maxKubusX = Math.round(Constant.WIDTH - 4*kubus.getWidth());
					int maxKubusY = Math.round(Constant.HEIGHT - 4*kubus.getHeight());

					kubus.setPosition(rand.nextInt(maxKubusX), rand.nextInt(maxKubusY) + 59);
					kubus.setVelocity(rand.nextInt(7)+1);
		  	} else if (shape == 3) {
					hexagon.setWidth(50);
					hexagon.setHeight(50);
					hexagon.setBackingX(randBackX);
					hexagon.setBackingY(randBackY);

		  		int maxHexaX = Math.round(Constant.WIDTH - 4*hexagon.getWidth());
					int maxHexaY = Math.round(Constant.HEIGHT - 4*hexagon.getHeight());

					hexagon.setPosition(rand.nextInt(maxHexaX), rand.nextInt(maxHexaY) + 59);
					hexagon.setVelocity(rand.nextInt(7)+1);
				}

				/* ANIMATION */
				Duration fps = Duration.millis(1000/60);
				KeyFrame oneFrame = new KeyFrame(fps,
				new EventHandler(){
					@Override
					public void handle(Event arg0)
					{
						/* perpindahan */
						bola.setPosition(bola.getX() + bola.getVelocity() * bola.getBackingX(), bola.getY() + bola.getVelocity() * bola.getBackingY());
						kubus.setPosition(kubus.getX() + kubus.getVelocity() * kubus.getBackingX(), kubus.getY() + kubus.getVelocity() * kubus.getBackingY());
						hexagon.setPosition(hexagon.getX() + hexagon.getVelocity() * hexagon.getBackingX(), hexagon.getY() + hexagon.getVelocity() * hexagon.getBackingY());
						/* pengecekan untuk kembli ke posisi awal */
						if(bola.getX() + 2*bola.getRadius() > Constant.WIDTH){
							bola.setPosition(bola.getX(), bola.getY());
							bola.setBackingX(bola.getBackingX() * (-1));
						}
						if(bola.getY() + 2*bola.getRadius() > Constant.HEIGHT){
							bola.setPosition(bola.getX(), bola.getY());
							bola.setBackingY(bola.getBackingY() * (-1));
						}
						if(bola.getX() < 0){
							bola.setPosition(bola.getX(), bola.getY());
							bola.setBackingX(bola.getBackingX() * (-1));
						}
						if(bola.getY() < 58){
							bola.setPosition(bola.getX(), bola.getY());
							bola.setBackingY(bola.getBackingY() * (-1));
						}

						/* pengecekan untuk kembli ke posisi awal */
						if(kubus.getX() + 2*kubus.getWidth() > Constant.WIDTH){
							kubus.setPosition(kubus.getX(), kubus.getY());
							kubus.setBackingX(kubus.getBackingX() * (-1));
						}
						if(kubus.getY() + 2*kubus.getHeight() > Constant.HEIGHT){
							kubus.setPosition(kubus.getX(), kubus.getY());
							kubus.setBackingY(kubus.getBackingY() * (-1));
						}
						if(kubus.getX() + kubus.getWidth() < 0){
							kubus.setPosition(kubus.getX(), kubus.getY());
							kubus.setBackingX(kubus.getBackingX() * (-1));
						}
						if(kubus.getY() + kubus.getHeight() < 58){
							kubus.setPosition(kubus.getX(), kubus.getY());
							kubus.setBackingY(kubus.getBackingY() * (-1));
						}

						if(hexagon.getX() + 2*hexagon.getWidth() > Constant.WIDTH){
							hexagon.setPosition(hexagon.getX(), hexagon.getY());
							hexagon.setBackingX(hexagon.getBackingX() * (-1));
						}
						if(hexagon.getY() + 2*hexagon.getHeight() > Constant.HEIGHT){
							hexagon.setPosition(hexagon.getX(), hexagon.getY());
							hexagon.setBackingY(hexagon.getBackingY() * (-1));
						}
						if(hexagon.getX() + hexagon.getWidth() < 0){
							hexagon.setPosition(hexagon.getX(), hexagon.getY());
							hexagon.setBackingX(hexagon.getBackingX() * (-1));
						}
						if(hexagon.getY() + hexagon.getHeight() < 58){
							hexagon.setPosition(hexagon.getX(), hexagon.getY());
							hexagon.setBackingY(hexagon.getBackingY() * (-1));
						}
					}
				});
				Timeline t1 = new Timeline();
				t1.setCycleCount(Animation.INDEFINITE);
				t1.getKeyFrames().add(oneFrame);
				t1.play();
		  }
    });

    // Tombol Exit
    Button buttonExit = new Button("Exit");
    buttonExit.setPrefSize(100,20);
    buttonExit.setStyle("-fx-background-color: #3498db;");
    buttonExit.setTextFill(Color.WHITE);
    buttonExit.setFont(Font.font("Oswald", 18));

    buttonExit.setOnAction(new EventHandler<ActionEvent>() {
		  @Override
		  public void handle(ActionEvent e) {
		  	System.exit(0);
		  }
    });

    hbox.getChildren().addAll(jumlah, spacer, buttonTambah, buttonExit);

    border.setTop(hbox);

		Scene scene2 = new Scene(root2, Constant.WIDTH, Constant.HEIGHT, Color.rgb(52, 73, 94));

		stage.setScene(scene1);
		stage.show();
		btnMulai.setOnAction(new EventHandler<ActionEvent>(){
	    @Override
	    public void handle(ActionEvent e){
	        stage.setScene(scene2);
	    }
    });
	}
}
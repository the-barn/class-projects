/**
 * Hector Ramirez
 * Date: 12/5/2018
 * Assignment: Draw something 
 * Class: Java CIS 016
 */
package drawSomething;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Main extends Application {
	private Polygon star;
	private Random random = new Random();
	private final double shs = 5.0;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		star = new Polygon();
		star.setLayoutX(100);
		star.setLayoutY(100);
		star.setFill(Color.web(color()));

		star.getPoints().addAll(new Double[] { 0.0, shs * 3, shs * 2, shs * 2, shs * 3, 0.0, shs * 4, shs * 2, shs * 6,
				shs * 3, shs * 4, shs * 4, shs * 3, shs * 6, shs * 2, shs * 4 });
			
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 800, 600);
		root.getChildren().add(star);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public String color() {
		final String[] letters = "0123456789ABCDEF".split("");
	    String color = "#";
	    for (int i = 0; i < 6; i++) {
	        color += letters[Math.round(random.nextFloat() * 15)];
	    }
	    return color;
	}

}
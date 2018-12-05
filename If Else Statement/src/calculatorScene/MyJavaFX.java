package calculatorScene;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws Exception {
		double sum = 45.6;

		// Create a scene and place a button in the scene.
		StackPane pane = new StackPane();
		GridPane grid = new GridPane();

		Label myLabel = new Label("123456");
		myLabel.prefWidthProperty().bind(pane.widthProperty());
		myLabel.prefHeightProperty().bind(pane.heightProperty());
		myLabel.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.REGULAR, 20));
		myLabel.setStyle("-fx-border-color: blue;");
		myLabel.setAlignment(Pos.BASELINE_RIGHT); // align text to the right side of the label

		Button bt7 = new Button("7");
		bt7.prefWidthProperty().bind(pane.widthProperty());
		bt7.prefHeightProperty().bind(pane.heightProperty());

		Button bt8 = new Button("8");
		bt8.prefWidthProperty().bind(pane.widthProperty());
		bt8.prefHeightProperty().bind(pane.heightProperty());

		Button bt9 = new Button("9");
		bt9.prefWidthProperty().bind(pane.widthProperty());
		bt9.prefHeightProperty().bind(pane.heightProperty());

		Button btDiv = new Button("/");
		btDiv.prefWidthProperty().bind(pane.widthProperty());
		btDiv.prefHeightProperty().bind(pane.heightProperty());

		Button bt4 = new Button("4");
		bt4.prefWidthProperty().bind(pane.widthProperty());
		bt4.prefHeightProperty().bind(pane.heightProperty());

		Button bt5 = new Button("5");
		bt5.prefWidthProperty().bind(pane.widthProperty());
		bt5.prefHeightProperty().bind(pane.heightProperty());

		Button bt6 = new Button("6");
		bt6.prefWidthProperty().bind(pane.widthProperty());
		bt6.prefHeightProperty().bind(pane.heightProperty());

		Button btMul = new Button("X");
		btMul.prefWidthProperty().bind(pane.widthProperty());
		btMul.prefHeightProperty().bind(pane.heightProperty());

		Button bt1 = new Button("1");
		bt1.prefWidthProperty().bind(pane.widthProperty());
		bt1.prefHeightProperty().bind(pane.heightProperty());

		Button bt2 = new Button("2");
		bt2.prefWidthProperty().bind(pane.widthProperty());
		bt2.prefHeightProperty().bind(pane.heightProperty());

		Button bt3 = new Button("3");
		bt3.prefWidthProperty().bind(pane.widthProperty());
		bt3.prefHeightProperty().bind(pane.heightProperty());

		Button btMin = new Button("-");
		btMin.prefWidthProperty().bind(pane.widthProperty());
		btMin.prefHeightProperty().bind(pane.heightProperty());

		Button bt0 = new Button("0");
		bt0.prefWidthProperty().bind(pane.widthProperty());
		bt0.prefHeightProperty().bind(pane.heightProperty());

		Button btDec = new Button(".");
		btDec.prefWidthProperty().bind(pane.widthProperty());
		btDec.prefHeightProperty().bind(pane.heightProperty());

		Button btPlu = new Button("+");
		btPlu.prefWidthProperty().bind(pane.widthProperty());
		btPlu.prefHeightProperty().bind(pane.heightProperty());

		Button btEqu = new Button("=");
		btEqu.prefWidthProperty().bind(pane.widthProperty());
		btEqu.prefHeightProperty().bind(pane.heightProperty());

		grid.add(myLabel, 0, 0, 4, 1);
		grid.addRow(1, bt7, bt8, bt9, btDiv);
		grid.addRow(2, bt4, bt5, bt6, btMul);
		grid.addRow(3, bt1, bt2, bt3, btMin);
		grid.addRow(4, bt0, btDec, btPlu, btEqu);

		pane.getChildren().add(grid);

		Scene scene = new Scene(pane, 280, 300);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}

}

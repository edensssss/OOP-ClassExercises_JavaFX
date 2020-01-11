package A;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class A_Q4 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Pane pane = new StackPane();
		
		int radius = 30;
		for (int i = 0; i < 10; i++) {
			Shape circle = new Circle(radius+=20);
			circle.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			circle.setStrokeWidth(5);
			circle.setFill(null);
			pane.getChildren().add(circle);
		}
		
		Scene scene = new Scene(pane);
		
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene);
		primaryStage.alwaysOnTopProperty();
		primaryStage.show();
	}

}

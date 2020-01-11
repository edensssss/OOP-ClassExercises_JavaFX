package A;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class A_Q2 extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		tf1.setStyle("-fx-border-color:red; -fx-border-width:3; -fx-background-color:blue; -fx-text-fill:red; -fx-font-weight:bold");
		
		Pane pane = new VBox(30, tf1, tf2);
		pane.setPadding(new Insets(50));
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.centerOnScreen();
		primaryStage.setTitle("A_Q1");
		primaryStage.setResizable(false);
		primaryStage.setAlwaysOnTop(true);
		primaryStage.show();
	}

}

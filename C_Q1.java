package C;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class C_Q1 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		/* Create B_MyPane */
		C_MyPane c_MyPane = new C_MyPane();

		/* Designing the B_MyPane */
		c_MyPane.setPadding(new Insets(30));
		c_MyPane.setPrefSize(1000, 200);
		c_MyPane.setPadding(new Insets(20));

		/* Creating handler for checkBox "Bold" */
		EventHandler<ActionEvent> checkBoxHandler = e -> {
			if (c_MyPane.getCheckB().isSelected()) {
				c_MyPane.getText().setStyle("-fx-font-weight: normal");
			}
		};

		/* Creating handler for comboBox which changing tha family font of text */
		EventHandler<ActionEvent> comboBoxHandler = e -> {
			c_MyPane.getText().setStyle("-fx-font-family: " + c_MyPane.getComboB().getValue());
		};

		/* Creating handler for slider which changing the font size to the current slider value */
		c_MyPane.getSl().valueProperty()
				.addListener(ov -> c_MyPane.getText().setStyle("-fx-font-size: " + c_MyPane.getSl().getValue()));

		/* Create Action for checkBox event */
		c_MyPane.getCheckB().setOnAction(checkBoxHandler);

		/* Create Action for comboBox event */
		c_MyPane.getComboB().setOnAction(comboBoxHandler);

		/* Create a scene */
		Scene scene = new Scene(c_MyPane);

		/* placing the scene in the stage */
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene);
		primaryStage.setTitle("MyFonts");
		primaryStage.alwaysOnTopProperty();
		primaryStage.setResizable(false);
		primaryStage.setAlwaysOnTop(true);
		primaryStage.show();
	}

}

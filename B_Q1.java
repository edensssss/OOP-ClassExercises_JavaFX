package B;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class B_Q1 extends Application {

	B_MyPane b_MyPane = new B_MyPane();

	@Override
	public void start(Stage primaryStage) throws Exception {

		/* Designing the B_MyPane */
		b_MyPane.setPadding(new Insets(29));
		b_MyPane.setPrefSize(500, 500);
		b_MyPane.setPadding(new Insets(20));

		/* Create a handler for activate button */
		OKHandlerClass eventHandlerButton = new OKHandlerClass();
		
		/* Create a scene */
		Scene scene = new Scene(b_MyPane);
		
		/* Create a handler for rotating text */
		EventHandler<ActionEvent> eventHandlerAnimation = e -> {
			rotatingText();
			Text newText = new Text("ROTATIN IN ACTION!");
		    b_MyPane.setTop(newText);
			};

		/* declaring double click action */
			scene.setOnMouseClicked(s -> {
				/* Creating animation */
				Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandlerAnimation));
				animation.setCycleCount(Timeline.INDEFINITE);
				if (s.getClickCount() == 2) {
					animation.play();
					}
			});
			
			
			
		/* declaring OK button action */
		b_MyPane.getBt().setOnAction(eventHandlerButton);

		/* declaring keys actions */
		scene.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				b_MyPane.getText().setFill(Color.RED);
			} else if (e.getCode() == KeyCode.UP) {
				if (b_MyPane.getText().getLayoutBounds().getWidth() < b_MyPane.getWidth() - 100) {
					b_MyPane.getText().setStyle("-fx-font-size : " + (b_MyPane.getText().getFont().getSize() + 10));
				}
			}
		});

		/* placing the scene in the stage */
		primaryStage.centerOnScreen();
		primaryStage.setScene(scene);
		primaryStage.setTitle("B_MyPane");
		primaryStage.alwaysOnTopProperty();
		primaryStage.setResizable(false);
		primaryStage.setAlwaysOnTop(true);
		primaryStage.show();
	}

	/* create rotating text methode for double click event*/
	private KeyValue rotatingText() {
		double val = b_MyPane.getText().getRotate() + 40;
		b_MyPane.getText().setRotate(val);
		return null;
	}

	/* create action event for OK button */
	class OKHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			b_MyPane.getText().setFill(Color.RED);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}

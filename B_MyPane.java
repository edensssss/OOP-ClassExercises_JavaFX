package B;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class B_MyPane extends BorderPane{

	private Button bt = new Button("OK");
	private Text text = new Text("JAVA IS COOL MAN!");

	public B_MyPane() {
		super();
		setCenter(text);
		setBottom(bt);
	}
	
	public Button getBt() {
		return bt;
	}
	public void setBt(Button bt) {
		this.bt = bt;
	}
	public Text getText() {
		return text;
	}
	public void setText(Text text) {
		this.text = text;
	}
	
}

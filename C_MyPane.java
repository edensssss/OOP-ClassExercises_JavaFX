package C;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class C_MyPane extends HBox {

	private VBox vb = new VBox();
	private Text text = new Text("JAVA IS COOL MAN!");
	private CheckBox checkB = new CheckBox("Bolt");
	private List<String> fonts = javafx.scene.text.Font.getFamilies();
	private ComboBox<String> comboB = new ComboBox<String>(FXCollections.observableArrayList(fonts));
	private Pane paneForText = new StackPane();

	private Slider sl = new Slider(25, 45, 0);

	public C_MyPane() {
		super();

		/* Desgining paneForText */
		paneForText.getChildren().add(text);
		paneForText.setCenterShape(true);

		/* Adding args to vBox */
		vb.getChildren().addAll(checkB, comboB, sl);
		getChildren().addAll(vb, paneForText);

		/* Desgining hBox */
		setSpacing(50);

		/* Desgining vBox */
		vb.setStyle("-fx-border-color:grey");
		vb.setPadding(new Insets(20));
		vb.setSpacing(30);

		/* Setting the slider */
		sl.setShowTickLabels(true);
		sl.setShowTickMarks(true);
		sl.setValue(100);
		sl.setMajorTickUnit(5);
		sl.setMinorTickCount(5);
	}

	public VBox getVb() {
		return vb;
	}

	public void setVb(VBox vb) {
		this.vb = vb;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public CheckBox getCheckB() {
		return checkB;
	}

	public void setCheckB(CheckBox checkB) {
		this.checkB = checkB;
	}

	public ComboBox<String> getComboB() {
		return comboB;
	}

	public void setComboB(ComboBox<String> comboB) {
		this.comboB = comboB;
	}

	public Slider getSl() {
		return sl;
	}

	public void setSl(Slider sl) {
		this.sl = sl;
	}

	public List<String> getFonts() {
		return fonts;
	}

	public void setFonts(List<String> fonts) {
		this.fonts = fonts;
	}
}

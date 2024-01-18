package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {
	private static int i = 0;
	
	private String[] cores = { "#C33C5E", "#39AAC6", "#28D79A", "#FB750E", "#F9060E" };
	
	public Caixa() {
		this(100, 100);
	}
	
	public Caixa(int largura, int altura) {
		setAlignment(Pos.CENTER);
		
		setMinWidth(largura);
		setMinHeight(altura);
		
		BackgroundFill fill = new BackgroundFill(Color.web(cores[i]), CornerRadii.EMPTY, Insets.EMPTY);
		setBackground(new Background(fill));
		
		i++;
		if(i == cores.length) {
			i = 0;
		}
	}
	
	public Caixa comTexto(String texto) {
		Label label = new Label(texto);
		label.setFont(new Font(25));
		getChildren().add(label);
		return this;
	}
}
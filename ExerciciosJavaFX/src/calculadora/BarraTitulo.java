package calculadora;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BarraTitulo extends HBox {

	private Button botaoFechar = new Button("");
	
	public BarraTitulo() {
		getStyleClass().add("barra-titulo");
		
		botaoFechar.setOnAction(evento -> System.exit(0));
		
		setOnMouseEntered(evento -> botaoFechar.setText("×"));
		setOnMouseExited(evento -> botaoFechar.setText(""));
		
		botaoFechar.getStyleClass().add("botao-fechar");
		getChildren().add(botaoFechar);
	}
}

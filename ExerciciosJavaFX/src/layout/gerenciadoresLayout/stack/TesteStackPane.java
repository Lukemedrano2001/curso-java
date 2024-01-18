package layout.gerenciadoresLayout.stack;

import javafx.scene.layout.StackPane;
import layout.Caixa;

public class TesteStackPane extends StackPane {
	public TesteStackPane() {
		Caixa caixa1 = new Caixa().comTexto("1");
		Caixa caixa2 = new Caixa().comTexto("2");
		Caixa caixa3 = new Caixa().comTexto("3");
		Caixa caixa4 = new Caixa().comTexto("4");
		Caixa caixa5 = new Caixa().comTexto("5");
		Caixa caixa6 = new Caixa().comTexto("6");
		
		getChildren().addAll(caixa1, caixa2, caixa3, caixa4, caixa5, caixa6);
		
		// Vinculando um evento dou mouse ao StackPane e não ao componente
		setOnMouseClicked(evento -> {
			if(evento.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();
			} else {
				getChildren().get(5).toBack();
			}
		});
	}
}
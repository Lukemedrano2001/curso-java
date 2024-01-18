package layout.gerenciadoresLayout.border;

import javafx.scene.layout.BorderPane;
import layout.Caixa;

public class TesteBorderPane extends BorderPane {
	public TesteBorderPane() {
		Caixa caixa1 = new Caixa().comTexto("Topo");
		setTop(caixa1);
		
		Caixa caixa2 = new Caixa().comTexto("Oeste");
		setLeft(caixa2);
		
		Caixa caixa3 = new Caixa().comTexto("Leste");
		setRight(caixa3);
		
		Caixa caixa4 = new Caixa().comTexto("Sul");
		setBottom(caixa4);
		
		Caixa caixa5 = new Caixa().comTexto("Centro");
		setCenter(caixa5);
	}
}
package layout.gerenciadoresLayout.grid;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import layout.Caixa;

public class TesteGridPane extends GridPane {
	public TesteGridPane() {
		Caixa caixa1 = new Caixa().comTexto("1");
		Caixa caixa2 = new Caixa().comTexto("2");
		Caixa caixa3 = new Caixa().comTexto("3");
		Caixa caixa4 = new Caixa().comTexto("4");
		Caixa caixa5 = new Caixa().comTexto("5");
		Caixa caixa6 = new Caixa().comTexto("6");
		
		setGridLinesVisible(true);
		
		getColumnConstraints().addAll(cc(), cc(), cc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc());
		
		setVgap(10);
		setHgap(10);
		
		add(caixa1, 0, 0, 2, 2);
		add(caixa2, 1, 1, 2, 2);
		add(caixa3, 4, 2, 1, 3);
		add(caixa4, 3, 1);
		add(caixa5, 0, 4, 2, 1);
		add(caixa6, 3, 3);
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;
	}
	
	private RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}
}
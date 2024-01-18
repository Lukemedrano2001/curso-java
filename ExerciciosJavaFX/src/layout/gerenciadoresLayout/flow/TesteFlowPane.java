package layout.gerenciadoresLayout.flow;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import layout.Quadrado;

public class TesteFlowPane extends FlowPane {
	public TesteFlowPane() {
		Quadrado quadrado1 = new Quadrado();
		Quadrado quadrado2 = new Quadrado();
		Quadrado quadrado3 = new Quadrado();
		Quadrado quadrado4 = new Quadrado();
		Quadrado quadrado5 = new Quadrado();
		
		setHgap(10);
		setVgap(10);
		
		setPadding(new Insets(10));
		setOrientation(Orientation.VERTICAL);
		setAlignment(Pos.CENTER);
		
		getChildren().addAll(quadrado1, quadrado2, quadrado3, quadrado4, quadrado5);
	}
}
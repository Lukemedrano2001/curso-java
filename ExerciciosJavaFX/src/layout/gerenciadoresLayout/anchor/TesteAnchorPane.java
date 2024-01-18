package layout.gerenciadoresLayout.anchor;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import layout.Quadrado;

public class TesteAnchorPane extends AnchorPane {
	public TesteAnchorPane() {
		Quadrado quadrado1 = new Quadrado();
		setTopAnchor(quadrado1, 10.0);
		setLeftAnchor(quadrado1, 10.0);
		
		Quadrado quadrado2 = new Quadrado();
		setTopAnchor(quadrado2, 10.0);
		setRightAnchor(quadrado2, 10.0);
		
		Quadrado quadrado3 = new Quadrado();
		setBottomAnchor(quadrado3, 10.0);
		setLeftAnchor(quadrado3, 10.0);
		
		Quadrado quadrado4 = new Quadrado();
		setBottomAnchor(quadrado4, 10.0);
		setRightAnchor(quadrado4, 10.0);
		
		HBox centro = new HBox();
		centro.setAlignment(Pos.CENTER);
		setTopAnchor(centro, 110.0);
		setBottomAnchor(centro, 110.0);
		setLeftAnchor(centro, 110.0);
		setRightAnchor(centro, 110.0);

		Quadrado quadrado5 = new Quadrado();
		centro.getChildren().add(quadrado5);
		
		getChildren().addAll(quadrado1, quadrado2, quadrado3, quadrado4, centro);
	}
}
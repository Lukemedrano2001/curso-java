package layout.gerenciadoresLayout.tile;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;
import layout.Quadrado;

public class TesteTilePane extends TilePane {
	public TesteTilePane() {
		List<Quadrado> quadrados = new ArrayList<Quadrado>();
		
		for(int i = 1; i < 9; i++) {
			quadrados.add(new Quadrado(i * 10));
		}
		
		setTileAlignment(Pos.BOTTOM_RIGHT);
		setVgap(20);
		setHgap(20);
		setPadding(new Insets(20));
		
		getChildren().addAll(quadrados);
	}
}

module exerciciosFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	opens basico;
	opens layout;
	opens fxml;
	opens calculadora;
	
	opens layout.gerenciadoresLayout.anchor;
	opens layout.gerenciadoresLayout.border;
	opens layout.gerenciadoresLayout.flow;
	opens layout.gerenciadoresLayout.grid;
	opens layout.gerenciadoresLayout.stack;
	opens layout.gerenciadoresLayout.tile;
}
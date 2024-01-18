package layout.gerenciadoresLayout.tile;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout7 extends Application {
	// Todos os componentes ocupam o mesmo espaço, mesmo que eles tenham um tamanho diferente
	@Override
	public void start(Stage primaryStage) throws Exception {	
		Scene cenaPrincipal = new Scene(new TesteTilePane(), 800, 600);
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
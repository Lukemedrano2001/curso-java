package layout.gerenciadoresLayout.anchor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout2 extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {	
		Scene cenaPrincipal = new Scene(new TesteAnchorPane(), 800, 600);
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox elementoRaiz = new VBox();
		
		/*
		elementoRaiz.getChildren().add(new Quadrado());
		elementoRaiz.getChildren().add(new Quadrado());
		elementoRaiz.getChildren().add(new Quadrado());
		elementoRaiz.getChildren().add(new Quadrado());
		elementoRaiz.getChildren().add(new Quadrado());
		elementoRaiz.getChildren().add(new Quadrado());
		elementoRaiz.getChildren().add(new Quadrado());
		*/
		
		elementoRaiz.getChildren().add(new Caixa().comTexto("1"));
		elementoRaiz.getChildren().add(new Caixa().comTexto("2"));
		elementoRaiz.getChildren().add(new Caixa().comTexto("3"));
		elementoRaiz.getChildren().add(new Caixa().comTexto("4"));
		elementoRaiz.getChildren().add(new Caixa().comTexto("5"));
		elementoRaiz.getChildren().add(new Caixa().comTexto("6"));
		elementoRaiz.getChildren().add(new Caixa().comTexto("7"));
		
		Scene cenaPrincipal = new Scene(elementoRaiz, 800, 700);
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
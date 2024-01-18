package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {
	// Stage (Uma aplicação pode ter vários stages): Tela
	// Scene (Um stage pode ter várias Scene): Configurações para mostrar os componentes visuais
	
	@Override
	public void start(Stage primaryStage) throws Exception {		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		botaoA.setOnAction(evento -> System.out.println("A"));
		botaoB.setOnAction(evento -> System.out.println("B"));
		botaoC.setOnAction(evento -> System.exit(0));
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(20);
		boxConteudo.getChildren().add(botaoA);
		boxConteudo.getChildren().add(botaoB);
		boxConteudo.getChildren().add(botaoC);
		
		Scene cena = new Scene(boxConteudo, 200, 400);
		
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

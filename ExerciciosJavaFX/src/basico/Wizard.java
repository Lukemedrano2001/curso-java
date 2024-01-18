package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;

	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("Ir para o passo 2");
		proximoPasso.setOnAction(evento -> janela.setScene(passo2));
		
		HBox box1 = new HBox();
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().add(proximoPasso);
		
		passo1 = new Scene(box1, 400, 400);
	}
	
	private void criarPasso2() {
		Button passoAnterior = new Button("Voltar para o passo 1");
		passoAnterior.setOnAction(evento -> janela.setScene(passo1));
		
		Button proximoPasso = new Button("Ir para o passo 3");
		proximoPasso.setOnAction(evento -> janela.setScene(passo3));
		
		HBox box1 = new HBox();
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().add(passoAnterior);
		box1.getChildren().add(proximoPasso);
		
		passo2 = new Scene(box1, 400, 400);
	}
	
	private void criarPasso3() {
		Button passoAnterior = new Button("Voltar para o passo 2");
		passoAnterior.setOnAction(evento -> janela.setScene(passo2));
		
		Button proximoPasso = new Button("Finalizar");
		proximoPasso.setOnAction(evento -> System.exit(0));
		
		HBox box1 = new HBox();
		box1.setAlignment(Pos.CENTER);
		box1.getChildren().add(passoAnterior);
		box1.getChildren().add(proximoPasso);
		
		passo3 = new Scene(box1, 400, 400);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
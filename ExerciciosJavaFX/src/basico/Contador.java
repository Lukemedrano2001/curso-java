package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	private int contador = 0;
	
	private void verificaContador(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("numero-positivo");
		label.getStyleClass().remove("numero-negativo");
		
		// Estilização condicional
		if(contador > 0) {
			label.getStyleClass().add("numero-positivo");
		} else if(contador < 0){
			label.getStyleClass().add("numero-negativo");
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Título
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		// Contador em formato de String
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		
		// Botao que decrementa o contador
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(evento -> {
			contador--;
			verificaContador(labelNumero);
		});
		
		// Botao que incrementa o contador
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(evento -> {
			contador++;
			verificaContador(labelNumero);
		});
		
		// Botões
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(20);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		// Conteúdo Principal
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(20);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		// Configuração CSS
		String caminhoCSS = getClass().getResource("/basico/Contador.css").toExternalForm();
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoCSS);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		// Iniciando o Stage
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
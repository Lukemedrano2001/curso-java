package calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class App extends Application {

	private double posX = 0;
	private double posY = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Font.loadFont(getClass().getResource("/calculadora/Roboto.ttf").toExternalForm(), 10);
		String css = getClass().getResource("/calculadora/Calculadora.css").toExternalForm();

		Scene principal = new Scene(new Calculadora(), 230, 320);
		principal.setFill(Color.TRANSPARENT);
		principal.getStylesheets().add(css);

		principal.setOnMousePressed(evento -> {
			posX = primaryStage.getX() - evento.getScreenX();
			posY = primaryStage.getY() - evento.getScreenY();
		});

		principal.setOnMouseDragged(evento -> {
			primaryStage.setX(evento.getScreenX() + posX);
			primaryStage.setY(evento.getScreenY() + posY);
		});

		primaryStage.setScene(principal);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package jdbc.fabricaConexoes;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FactoryConexao2 {
	public static Connection getConexao() {
		try {
			Properties property = FactoryConexao2.getProperties();
			String url = property.getProperty("banco.url");
			String usuario = property.getProperty("banco.usuario");
			String senha = property.getProperty("banco.senha");
		
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException excecao) {
			throw new RuntimeException(excecao);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties property = new Properties();
		String caminho = "conexao.properties";
		property.load(FactoryConexao2.class.getResourceAsStream(caminho));
		return property;
	}
}
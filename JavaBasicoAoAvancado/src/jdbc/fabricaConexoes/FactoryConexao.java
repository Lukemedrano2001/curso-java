package jdbc.fabricaConexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConexao {
	// Exceção não checada
	// Não coloque as conexões como a url, usuario e senha dentro do codigo
	// Lembre-se sempre de colocar o arquivo .properties para colocar a url, usuario e senha
	public static Connection getConexao() {
		try {
			String url = "jdbc:postgresql://localhost:5432/jdbc?verifyServerCertificate=false&useSSL=false";
			String usuario = "postgres";
			String senha = "1234";
		
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException excecao) {
			throw new RuntimeException(excecao);
		}
	}
}
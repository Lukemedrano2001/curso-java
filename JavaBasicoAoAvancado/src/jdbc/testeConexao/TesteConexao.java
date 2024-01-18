package jdbc.testeConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		// Coloque essa String de conexão para fazer a conexão no PostgreSQL
		String url = "jdbc:postgresql://localhost:5432/?verifyServerCertificate=false&useSSL=false";
		String usuario = "postgres";
		String senha = "1234";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão executada com sucesso");
		
		conexao.close();
	}
}
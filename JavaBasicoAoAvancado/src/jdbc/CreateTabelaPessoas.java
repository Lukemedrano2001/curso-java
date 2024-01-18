package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.fabricaConexoes.FactoryConexao;

public class CreateTabelaPessoas {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FactoryConexao.getConexao();
		
		// Comando DML para criação da tabela
		String sql = """
					CREATE TABLE IF NOT EXISTS pessoas(
						id SERIAL PRIMARY KEY,
						nome VARCHAR(80) NOT NULL
					)
				""";
		
		Statement statement = conexao.createStatement();
		statement.execute(sql);
		
		System.out.println("Tabela criada com sucesso");
		statement.close();
	}
}
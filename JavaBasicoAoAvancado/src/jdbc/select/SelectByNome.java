package jdbc.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.Pessoa;
import jdbc.fabricaConexoes.FactoryConexao;

public class SelectByNome {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe algum valor para pesquisa:");
		String valor = scanner.nextLine();
		
		Connection conexao = FactoryConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE LOWER(nome) LIKE LOWER(?)";
		PreparedStatement statement = conexao.prepareStatement(sql);
		
		// Configurando o valor do parâmetro, evitando injeção SQL
		statement.setString(1, "%" + valor + "%");
		ResultSet resultado = statement.executeQuery();
		
		while(resultado.next()) {
			int id = resultado.getInt("id");
			String nome = resultado.getString("nome");
			Pessoa pessoa = new Pessoa(id, nome);
			System.out.println(pessoa.toString());
		}
		
		
		scanner.close();
	}
}
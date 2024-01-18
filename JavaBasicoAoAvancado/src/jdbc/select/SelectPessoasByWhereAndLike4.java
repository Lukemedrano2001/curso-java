package jdbc.select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbc.Pessoa;
import jdbc.fabricaConexoes.FactoryConexao;

public class SelectPessoasByWhereAndLike4 {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe algum valor para pesquisa:");
		String valor = scanner.nextLine();
		
		
		Connection conexao = FactoryConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE LOWER(nome) LIKE ?";
		
		
		// Retorna todos os nomes no qual o usuario digitou como parâmetro
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setString(1, "%" + valor + "%");
		ResultSet resultado = statement.executeQuery();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		
		while(resultado.next()) {
			int id = resultado.getInt("id");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(id, nome));
		}
		
		for(Pessoa pessoa: pessoas) {
			System.out.printf(pessoa.toString());
		}
		
		
		scanner.close();
		statement.close();
		conexao.close();
	}
}
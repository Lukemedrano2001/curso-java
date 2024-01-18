package jdbc.select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Pessoa;
import jdbc.fabricaConexoes.FactoryConexao2;

public class SelectAllPessoas {
	public static void main(String[] args) throws SQLException {
		// Limit = Limita a consulta
		// Offset = Paginação na query
		// Offset = 0 e Limit = 10, você pega os 10 primeiros registro
		// Offset = 10 e Limit = 10, você pega a partir do 11 até o 20
		
		Connection conexao = FactoryConexao2.getConexao();
		String sql = "SELECT * FROM pessoas";
		
		Statement statement = conexao.createStatement();
		ResultSet resultado = statement.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		// Retorna todos os registros que retornaram da query, e adiciona na lista de pessoas
		while(resultado.next()) {
			int id = resultado.getInt("id");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(id, nome));
		}
		
		// Percorre a lista de pessoas que retornaram da query e exibe cada uma
		for(Pessoa pessoa: pessoas) {
			System.out.printf(pessoa.toString());
		}
		
		statement.close();
		conexao.close();
	}
}
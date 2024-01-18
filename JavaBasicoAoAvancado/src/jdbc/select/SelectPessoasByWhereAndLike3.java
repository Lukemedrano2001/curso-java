package jdbc.select;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.Pessoa;
import jdbc.fabricaConexoes.FactoryConexao;

public class SelectPessoasByWhereAndLike3 {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FactoryConexao.getConexao();
		Statement statement = conexao.createStatement();
		
		
		// Retorna todos os nomes que tenham a letra e
		String sql = "SELECT * FROM pessoas WHERE LOWER(nome) LIKE '%e%'";
		ResultSet resultado = statement.executeQuery(sql);
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(resultado.next()) {
			int id = resultado.getInt("id");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(id, nome));
		}
		
		for(Pessoa pessoa: pessoas) {
			System.out.printf(pessoa.toString());
		}
		
	
		statement.close();
		conexao.close();
	}
}
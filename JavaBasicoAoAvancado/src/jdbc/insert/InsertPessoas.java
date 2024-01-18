package jdbc.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.fabricaConexoes.FactoryConexao;

public class InsertPessoas {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o nome:");
		String nome = scanner.nextLine();
		
		Connection conexao = FactoryConexao.getConexao();
		
		// Comando DML para inserir um dado na tabela pessoas
		// Tenha cuidado com injeção SQL, quando o usuário tenta de múltiplas formas, onde ao tentar inserir um dado, ele tenta colocar um comando válido, seja para dar um delete, update, drop, logo abaixo um exemplo de injeção SQL, onde vai deletar todos os dados da tabela
		// INSERT INTO pessoas (nome) VALUES(" + nome + ");DELETE FROM pessoas WHERE('1' = '1');
		// Use no VALUES(?) como parâmetro
		
		// Inserção segura usando o setString e preparedStatement
		String sql = "INSERT INTO pessoas (nome) VALUES(?);";
		PreparedStatement statement = conexao.prepareStatement(sql); 
		statement.setString(1, nome);
		statement.execute();

        System.out.println("Inserção realizada com sucesso.");

		conexao.close();
		statement.close();
		scanner.close();
	}
}
package jdbc.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.fabricaConexoes.FactoryConexao;

public class UpdateIdPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome:");
		String nome = scanner.nextLine();
		
		
		System.out.println("Digite o novo Id:");
		int id = scanner.nextInt();
		
		
		Connection conexao = FactoryConexao.getConexao();
		String sql = "UPDATE pessoas SET id = ? WHERE nome = ?";
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setInt(1, id);
		statement.setString(2, nome);
		
		statement.execute();
		
		
		scanner.close();
		statement.close();
		conexao.close();
	}
}
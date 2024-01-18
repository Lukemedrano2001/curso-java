package jdbc.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.fabricaConexoes.FactoryConexao;

public class DeleteByIdPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o id para que se faça o delete:");
		int id = scanner.nextInt();
		
		
		Connection conexao = FactoryConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE id = ?";
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setInt(1, id);
		statement.executeUpdate();
		
		
		scanner.close();
		statement.close();
		conexao.close();
	}
}
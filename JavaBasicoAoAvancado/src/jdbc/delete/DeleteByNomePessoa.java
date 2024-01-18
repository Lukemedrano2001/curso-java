package jdbc.delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.fabricaConexoes.FactoryConexao;

public class DeleteByNomePessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o nome para que se faça o delete:");
		String nome = scanner.next();
		
		
		Connection conexao = FactoryConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE nome = ?";
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setString(1, nome);
		statement.executeUpdate();
		
		
		scanner.close();
		statement.close();
		conexao.close();
	}
}
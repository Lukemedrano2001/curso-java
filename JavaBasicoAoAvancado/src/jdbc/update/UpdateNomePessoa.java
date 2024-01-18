package jdbc.update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.fabricaConexoes.FactoryConexao;

public class UpdateNomePessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o Id:");
		int id = scanner.nextInt();
		
		 scanner.nextLine();
		
		System.out.println("Digite o novo nome:");
		String novoNome = scanner.nextLine();
		
		
		Connection conexao = FactoryConexao.getConexao();
		String sql = "UPDATE pessoas SET nome = ? WHERE id = ?";
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setString(1, novoNome);
		statement.setInt(2, id);
		
		statement.execute();
		
		
		scanner.close();
		statement.close();
		conexao.close();
	}
}
package jdbc.criandoDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarDatabase {
    public static void main(String[] args) {
    	// Coloque essa String de conexão para fazer a conexão no PostgreSQL
        String url = "jdbc:postgresql://localhost:5432/?verifyCertificateServer=false&useSSL=false";
        String usuario = "postgres";
        String senha = "1234";

        try (Connection conexao = DriverManager.getConnection(url, usuario, senha)) {
            String nomeNovoBanco = "jdbc";

            // Statement é uma interface do JDBC para realizar comandos DDL, DML, TCL, DCL
            try (Statement statement = conexao.createStatement()) {
                // Verificar se o banco de dados já existe
                ResultSet resultSet = statement.executeQuery("SELECT 1 FROM pg_database WHERE datname = '" + nomeNovoBanco + "'");
                if (!resultSet.next()) {
                    // Comando DDL para criar uma nova database no PostgreSQL
                    statement.executeUpdate("CREATE DATABASE " + nomeNovoBanco);
                    System.out.println("Banco de dados criado com sucesso.");
                } else {
                    System.out.println("Banco de dados já existe.");

                    /*  
                     		// Conectar-se a um banco de dados diferente para permitir a exclusão
                    try (Statement dropStatement = conexao.createStatement()) {
                        	// Comando DDL para excluir o banco de dados no PostgreSQL
                        dropStatement.executeUpdate("DROP DATABASE " + nomeNovoBanco);
                        System.out.println("Banco de dados excluído com sucesso.");
                    }
                    
                    */
                }
            }
        } catch (SQLException excecao) {
            System.out.println(excecao);
        }
    }
}

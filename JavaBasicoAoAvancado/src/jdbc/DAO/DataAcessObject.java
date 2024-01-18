package jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.Pessoa;
import jdbc.fabricaConexoes.FactoryConexao2;

// O DAO tem métodos de alto nível para que seja feito o CRUD e com isso você consegue acessar o banco de dados de uma forma simples
// Sem o DAO, você mistura a lógica da aplicação/regra de negócio com o infraestrutura/acesso ao banco de dados
// Você pode usar de Generics, Refletion, Instrospection e Annotation
// Aqui o DAO é bruto, pode ser melhorado, pois precisa passar o sql e a lista de atributos na chamada do metodo, para melhorar você passa um objeto, e o método faz todos os processos necessários para que seja feita uma query bem sucedida

public class DataAcessObject {
	private Connection conexao;
	
	
	public int insert(String sql, Object...atributos) {
		try {
			PreparedStatement statement = this.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			this.adicionaAtributos(statement, atributos);
			
			if(statement.executeUpdate() > 0) {
				ResultSet resultado = statement.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			
			return -1;
		}catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		}
	}
	
	
	// Dá pra usar um SELECT ALL sem WHERE e um SELECT ALL com WHERE
	public List<Pessoa> selectAll(String sql, Object... atributos) {
	    try {
	        PreparedStatement statement = this.getConexao().prepareStatement(sql);

	        this.adicionaAtributos(statement, atributos);

	        List<Pessoa> pessoas = new ArrayList<Pessoa>();

	        ResultSet resultado = statement.executeQuery();
	        while (resultado.next()) {
	            Pessoa pessoa = extrairPessoa(resultado);
	            pessoas.add(pessoa);
	        }

	        return pessoas;
	    } catch (SQLException excecao) {
	        throw new RuntimeException(excecao);
	    }
	}

	
	
	public Pessoa selectOne(String sql, Object... atributos) {
		try {
            PreparedStatement statement = this.getConexao().prepareStatement(sql);
            this.adicionaAtributos(statement, atributos);

            ResultSet resultado = statement.executeQuery();

            if (resultado.next()) {
                return this.extrairPessoa(resultado);
            }

            return null;
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
	}
	
	
	public int delete(String sql, Object...atributos) {
		try {
			PreparedStatement statement = this.getConexao().prepareStatement(sql);
			this.adicionaAtributos(statement, atributos);
			
			return statement.executeUpdate();
		}catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		}
	}
	
	
	public int update(String sql, Object...atributos) {
		try {
			PreparedStatement statement = this.getConexao().prepareStatement(sql);
			this.adicionaAtributos(statement, atributos);
			
			return statement.executeUpdate();
		}catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		}
	}
	
	
	public void close() {
		try {
			this.getConexao().close();
		} catch (SQLException excecao) {
			
		}finally {
			this.conexao = null;
		}
	}
	
	
	// Para cada tipo String, Integer, Double, Boolean, tem o seu set específico
	private void adicionaAtributos(PreparedStatement statement, Object[] atributos) {
		int indice = 1;
		for(Object atributo: atributos) {
			try {
				if(atributo instanceof String) {
					statement.setString(indice, (String) atributo);			
				}else if(atributo instanceof Integer) {
					statement.setInt(indice, (Integer) atributo);
				}else if(atributo instanceof Double) {
					statement.setDouble(indice, (Double) atributo);
				}else if(atributo instanceof Boolean) {
					statement.setBoolean(indice, (Boolean) atributo);
				}
			}catch(SQLException excecao) {
				throw new RuntimeException(excecao);
			}
			
			indice++;
		}
	}
	
	
	private Pessoa extrairPessoa(ResultSet resultado) throws SQLException {
		 String nome = resultado.getString("nome");
		 int id = resultado.getInt("id");
		 
		 return new Pessoa(id, nome);
	}
	
	
	private Connection getConexao() {
		try {
			if(this.conexao != null && !this.conexao.isClosed()) {
				return this.conexao;
			}
		} catch (SQLException excecao) {
			
		}
		
		this.conexao = FactoryConexao2.getConexao();
		return this.conexao;
	}
}
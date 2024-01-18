package teste.basico.usuario.select;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.basico.Usuario;

public class ObterTodosOsUsuariosByWhereComParametrosWhere {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        Scanner scanner = new Scanner(System.in);
		System.out.println("Informe algum valor para pesquisa:");
		String valor = scanner.nextLine();
        
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
        	entityManager = entityManagerFactory.createEntityManager();
            
        	// Usando JPQL para recuperar todos os usuários, com base no parametro que é passado
        	String jpql = "SELECT usuario FROM Usuario usuario WHERE LOWER(nome) LIKE LOWER(:nome)";
        	TypedQuery<Usuario> query = entityManager.createQuery(jpql, Usuario.class);
        	
        	 // Configurando o valor do parâmetro, evitando injeção SQL
            query.setParameter("nome", "%" + valor + "%");
        	
            List<Usuario> usuarios = query.getResultList();
        	for(Usuario usuario: usuarios) {
        		System.out.println(usuario.toString());
        	}
        }catch(Exception excecao) {
        	excecao.printStackTrace();
        }finally {
        	scanner.close();
        	
        	if (entityManager != null) {
                entityManager.close();
            }
             
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
	}
}

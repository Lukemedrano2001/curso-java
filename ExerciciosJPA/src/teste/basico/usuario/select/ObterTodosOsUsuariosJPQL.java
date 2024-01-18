package teste.basico.usuario.select;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.basico.Usuario;

public class ObterTodosOsUsuariosJPQL {
	public static void main(String[] args) {
		// Usando JPQL para recuperar todos os usuários, na tabela de usuario, você pode especificar a quantidade máxima de resultados, inclusive colocando um deslocamento, dando um efeito de paginação
        // Usuario.class: Vai passar os metadados sobre a classe, os atributos, tipos dos atributos, os métodos, os construtores, as Annotations, usando de Reflection e com isso ele olha dentro da classe e entende como ela foi construida
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
        	entityManager = entityManagerFactory.createEntityManager();
        	
        	String jpql = "SELECT usuario FROM Usuario usuario";
        	TypedQuery<Usuario> query = entityManager.createQuery(jpql, Usuario.class);
        	
            List<Usuario> usuarios = query.getResultList();
        	for(Usuario usuario: usuarios) {
        		System.out.println(usuario.toString());
        	}
        }catch(Exception excecao) {
        	excecao.printStackTrace();
        }finally {
        	 if (entityManager != null) {
                 entityManager.close();
             }
             
             if (entityManagerFactory != null) {
                 entityManagerFactory.close();
             }
        }
	}
}
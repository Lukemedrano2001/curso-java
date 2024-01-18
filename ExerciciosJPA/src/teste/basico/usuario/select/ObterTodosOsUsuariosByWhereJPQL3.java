package teste.basico.usuario.select;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import model.basico.Usuario;

public class ObterTodosOsUsuariosByWhereJPQL3 {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
        	entityManager = entityManagerFactory.createEntityManager();
            
        	// Usando JPQL para recuperar todos os usuários, que tenham a letra 'g' no nome
        	String jpql = "SELECT usuario FROM Usuario usuario WHERE LOWER(nome) LIKE '%g%'";
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
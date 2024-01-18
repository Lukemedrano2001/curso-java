package teste.basico.usuario.delete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.basico.Usuario;

public class DeleteUsuario {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
        	entityManager = entityManagerFactory.createEntityManager();
            
        	
        	
        	Usuario usuario = entityManager.find(Usuario.class, 9L);
        	
        	if(usuario != null) {
        		// Se a transação for bem sucedida, dê commit
        		entityManager.getTransaction().begin();
        		entityManager.remove(usuario);
        		entityManager.getTransaction().commit();
        	}
        }catch(Exception excecao) {
        	excecao.printStackTrace();
        	
        	// Se a transação deu algum erro, dê rollback
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
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
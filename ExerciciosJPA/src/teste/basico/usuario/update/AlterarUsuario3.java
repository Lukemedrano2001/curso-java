package teste.basico.usuario.update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		// Entidade em estado não gerenciado:
		// Use o método detach para desanexar do estado gerenciado, passando a instância do objeto que você quer desanexar
		// Depois chame o método merge para que se faça as devidas alterações
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
        	entityManager = entityManagerFactory.createEntityManager();
            
        	// Se a transação for bem sucedida, dê commit
        	entityManager.getTransaction().begin();
        	
        	Usuario usuario = entityManager.find(Usuario.class, 15L);
        	entityManager.detach(usuario);	// Estado não gerenciado
        	
        	usuario.setNome("Marisa");
        	usuario.setEmail("marisa@email.com.br");
        	
        	entityManager.merge(usuario);	// Estado gerenciado
        	
        	entityManager.getTransaction().commit();
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
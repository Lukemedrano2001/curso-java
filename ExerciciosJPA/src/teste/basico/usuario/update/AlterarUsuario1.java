package teste.basico.usuario.update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		// O método merge vai pegar um objeto/linha já existente no banco de dados, e vai realizar as devidas alterações, com isso ele faz a persistência
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
        	entityManager = entityManagerFactory.createEntityManager();
            
        	// Se a transação for bem sucedida, dê commit
        	entityManager.getTransaction().begin();
        	
        	Usuario usuario = entityManager.find(Usuario.class, 15L);
        	usuario.setNome("Marina");
        	usuario.setEmail("marina@email.com.br");
        	
        	entityManager.merge(usuario);
        	
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
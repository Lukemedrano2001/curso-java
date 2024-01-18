package teste.basico.usuario.update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.basico.Usuario;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		// Entidade em estado gerenciado: Quando se faz uma consulta em uma transação, a entidade fica num estado gerenciado, pois o JPA tem um gerenciamento em cima daquele objeto, e qualquer mudança que seja feita no objeto dentro de uma transação, e isso será sincronizado com o banco de dados, mesmo que você não chame o método merge
		// O ideal é trabalhar com a Entidade no estado não gerenciado, pois quando você precisar que se faça uma alteração ou remoção, você só chama o método merge, enquanto que para consultas você fica no estado não gerenciado
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
        	entityManager = entityManagerFactory.createEntityManager();
            
        	// Se a transação for bem sucedida, dê commit
        	entityManager.getTransaction().begin();
        	
        	Usuario usuario = entityManager.find(Usuario.class, 15L);	// Estado gerenciado, pois não tem o detach
        	usuario.setNome("Mario");
        	usuario.setEmail("mario@email.com.br");
        	
        	// entityManager.merge(usuario);	// Mesmo não chamando o merge, vai fazer as alteraçoes no banco de dados
        	
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
package teste.basico.usuario.select;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.basico.Usuario;

public class ObterUsuarioById {
	public static void main(String[] args) {
		// Não precisa usar de transação, pois é um SELECT e isso não altera nada no Banco de dados
		// Você pode criar suas próprias consultas usando o entityManager
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        
        try {
        	entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
        	entityManager = entityManagerFactory.createEntityManager();
            
        	Usuario usuario = entityManager.find(Usuario.class, 6L);
        	System.out.println(usuario.toString());
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
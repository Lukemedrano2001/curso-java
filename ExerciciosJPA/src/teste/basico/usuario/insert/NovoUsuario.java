package teste.basico.usuario.insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		// EntityManagerFactory e EntityManager: São interfaces, logo não conseguimos instanciar interfaces, logo vai ter classes do Hibernate que implementam essas interfaces
		// EntityManagerFactory: Responsável por criar um EntityManager, imagine que você tenha n banco de dados, e precisa criar EntityManager para cada um. Logo, ele é uma fábrica de conexões
		// EntityManager: Responsável pelo CRUD na tabela, dentro dele terá uma conexão embutida, com isso a classe irá ajudar na persistência no banco de dados
		// JPQL: SQL voltado para Orientação a Objeto
		// O método persist só vai persistir os dados, quando tiver uma Transaction, tendo commit e rollback
		
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_jpa");
            entityManager = entityManagerFactory.createEntityManager();

            Usuario novoUsuario = new Usuario("Gabi", "gabi@email.com.br");

            // Se a transação for bem sucedida, dê commit
            entityManager.getTransaction().begin();
            entityManager.persist(novoUsuario);
            entityManager.getTransaction().commit();
            
            System.out.println("Id gerado: " + novoUsuario.getId());
        } catch (Exception excecao) {
            excecao.printStackTrace();
            
            // Se a transação deu algum erro, dê rollback
            if (entityManager != null && entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
	}
}
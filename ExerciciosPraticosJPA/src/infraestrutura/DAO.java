package infraestrutura;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<Entidade> {
	private static EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private Class<Entidade> classe;
	
	static {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("exercicios_praticos_jpa");
		}catch(Exception excecao) {
			// Tratar a exceção, ou documentar, pois é um bloco static
			// Logar -> log4j
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<Entidade> classe) {
		this.classe = classe;
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public DAO<Entidade> abrirTransacao(){
		entityManager.getTransaction().begin();
		return this;
	}
	
	public DAO<Entidade> fecharTransacao(){
		try {
			// Se a transação for bem sucedida, dê commit
			entityManager.getTransaction().commit();
		} catch (Exception excecao) {
			// Se a transação deu algum erro, dê rollback
			entityManager.getTransaction().rollback();
			excecao.printStackTrace();
		}
		
		return this;
	}
	
	public DAO<Entidade> incluir(Entidade entidade){
		entityManager.persist(entidade);
		return this;
	}
	
	public DAO<Entidade> atualizar(Entidade entidade){
		entityManager.merge(entidade);
		return this;
	}
	
	public DAO<Entidade> remove(Entidade entidade){
		entityManager.remove(entidade);
		return this;
	}
	
	// Lembre-se ao obter todos os registros, você pode perder desempenho na aplicação, por causa do número de registros que retornará
	public List<Entidade> obterTodos(){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "SELECT entidade FROM " + classe.getName() + " entidade";
		TypedQuery<Entidade> query = entityManager.createQuery(jpql, classe);
		
		return query.getResultList();
	}
	
	public Entidade obterUmRegistro(String campo, Object valor) {
		if (classe == null || campo == null || valor == null) {
		       throw new IllegalArgumentException("Classe, campo ou valor nulo");
		}

		String jpql = "SELECT entidade FROM " + classe.getName() + " entidade WHERE entidade." + campo + " = :valor";
		TypedQuery<Entidade> query = entityManager.createQuery(jpql, classe);
		query.setParameter("valor", valor);

		List<Entidade> resultado = query.getResultList();
		    
		if(resultado.isEmpty()) {
		    return null;
		} else {
		    return resultado.get(0);
		}
	}
	
	public List<Entidade> consultar(String nomeConsulta, Object... parametros){
		TypedQuery<Entidade> query = entityManager.createNamedQuery(nomeConsulta, classe);
		
		for(int i = 0; i < parametros.length; i += 2) {
			query.setParameter(parametros[i].toString(), parametros[i + 1]);
		}
		
		return query.getResultList();
	}
	
	public Entidade consultarUmRegistro(String nomeConsulta, Object... parametros){
		List<Entidade> lista = this.consultar(nomeConsulta, parametros);
		
		if(lista.isEmpty()) {
			return null;
		} else {
			return lista.get(0);
		}
	}
	
	public void fecharDAO() {
		entityManager.close();
	}
}
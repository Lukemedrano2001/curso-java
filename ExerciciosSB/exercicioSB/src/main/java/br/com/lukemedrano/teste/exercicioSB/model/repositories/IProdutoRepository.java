package br.com.lukemedrano.teste.exercicioSB.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import br.com.lukemedrano.teste.exercicioSB.model.entities.Produto;

public interface IProdutoRepository extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {
	// Métodos de alto nível que vão abstrair o acesso aos dados, assim como o DAO
	// Interface: Interface que faz a persistência no SGBD
	// Implementação: CrudRepository e PagingAndSortingRepository que são fornecidas pelo Spring Boot
	
	
	//	findByNomeContaining
	//	findByNomeIsContaining
	//	findByNomeContains
	
	//	findByNomeStartsWith
	//	findByNomeEndsWith
	
	//	findByNomeNotContaining
	
	
	// Pode usar de um JPQL caso a consulta seja complexa
	// @Query("SELECT prod FROM Produto prod WHERE prod.nome LIKE %:nome%")  
	// public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
package model.manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atores")
public class Ator {
	// Relacionamento Bidirecional, (N para N)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "atores", cascade = CascadeType.PERSIST)
	/* 
	@JoinTable(
			name = "filmes_atores", 
			joinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id")
	) 
	*/
	private List<Filme> filmes = new ArrayList<Filme>();
	
	public Ator() {}

	public Ator(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Filme> getFilmes() {
		return this.filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}
	
	@Override
	public String toString() {
		return String.format("Id do Ator: %d | Nome do Ator: %s", 
				this.getId(), this.getNome());
	}
}
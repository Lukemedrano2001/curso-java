package model.manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filmes")
public class Filme {
	// Relacionamento Bidirecional, (N para N)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Double nota;
	
	@ManyToMany(cascade = CascadeType.PERSIST)	// (mappedBy = "filmes")
	@JoinTable(
			name = "atores_filmes", 
			joinColumns = @JoinColumn(name = "filme_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id")
	)
	private List<Ator> atores = new ArrayList<Ator>();

	public Filme() {}
	
	public Filme(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
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

	public Double getNota() {
		return this.nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public List<Ator> getAtores() {
		if(this.atores == null) {
			atores = new ArrayList<Ator>();
		}
		
		return this.atores;
	}

	public void setAtores(List<Ator> atores) {
		this.atores = atores;
	}
	
	public void adicionaAtor(Ator ator) {
		if(ator != null & !this.getAtores().contains(ator)) {
			this.getAtores().add(ator);
			
			if(!ator.getFilmes().contains(this)) {
				ator.getFilmes().add(this);		// Garantindo a bidirecionalidade
			}
		}
	}
	
	@Override
	public String toString() {
		return String.format("Id do Filme: %d | Nome do Filme: %s", 
				this.getId(), this.getNome());
	}
}
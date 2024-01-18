package model.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Você vai ter outras classes que fazem o CRUD e nelas terão os comandos CRUD a partir de classes do JPA
// Classe Usuario faz o ORM
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	// PK, AutoIncrement, SERIAL ou SEQUENCE
	
	private String nome;	// VARCHAR ou CHAR
	
	private String email;	// VARCHAR ou CHAR
	
	// O construtor padrão é necessário para o JPA
	public Usuario() {}
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
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
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("Id: %d | Nome: %s | E-mail: %s", this.getId(), this.getNome(), this.getEmail());
	}
}
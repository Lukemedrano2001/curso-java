package model.heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)	// Single Tbale
// @DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
// @DiscriminatorValue("AL")	// Representa a instância de um aluno normal

// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)	// Tabela por classe

@Entity
@Inheritance(strategy = InheritanceType.JOINED)	// Tabela por subclasse
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")	// Representa a instância de um aluno normal
public class Aluno {
	@Id
	private Long matricula;
	
	private String nome;
	
	public Aluno() {}

	public Aluno(Long matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
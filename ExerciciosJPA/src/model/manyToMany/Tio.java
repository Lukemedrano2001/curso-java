package model.manyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tio {
	// Bidirecional e (N para N)
	// Depende de qual lado você coloca como sendo o lado principal, ele vai criar uma tabela chamada tios_sobrinhos
	// Ou seja, se você coloca o mappedBy no lado do Sobrinho, o Tio será o lado principal
	// Com isso, configurado, será criada uma tabela intermediária que tenha a chave primária de Tio e Sobrinho
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	
	@ManyToMany	// (mappedBy = "sobrinhos")
	private List<Sobrinho> sobrinhos = new ArrayList<Sobrinho>();

	public Tio() {}
	
	public Tio(String nome) {
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

	public List<Sobrinho> getSobrinhos() {
		return this.sobrinhos;
	}

	public void setSobrinhos(List<Sobrinho> sobrinhos) {
		this.sobrinhos = sobrinhos;
	}
}
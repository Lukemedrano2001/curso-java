package model.manyToMany;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {
	// Bidirecional e (N para N)
	// Depende de qual lado você coloca como sendo o lado principal, ele vai criar uma tabela chamada sobrinhos_tios
	// Ou seja, se você coloca o mappedBy no lado do Tio, o Sobrinho será o lado principal
	// Com isso, configurado, será criada uma tabela intermediária que tenha a chave primária de Tio e Sobrinho
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@ManyToMany(mappedBy = "sobrinhos")
	private List<Tio> tios = new ArrayList<Tio>();
	
	public Sobrinho() {}
	
	public Sobrinho(String nome) {
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

	public List<Tio> getTios() {
		return this.tios;
	}

	public void setTios(List<Tio> tios) {
		this.tios = tios;
	}
}
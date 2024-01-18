package model.oneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assentos")
public class Assento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	// Garantindo que a partir do assento seja possível acessar o cliente, e que não seja criado um novo atributo na tabela assentos, pois vai ter incosistência dos dados, isso é menos comum de se fazer
	// Fazendo isso, o Assento teria acesso a uma determinada instância de Cliente, logo tendo acesso aos seus métodos
	// @OneToOne(mappedBy = "assento")	
	// private Cliente cliente;
	
	public Assento() {}
	
	public Assento(String nome) {
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
	
	@Override
	public String toString() {
		return String.format("Id do Assento: %d | Nome do Assento: %s", this.getId(), this.getNome());
	}
}
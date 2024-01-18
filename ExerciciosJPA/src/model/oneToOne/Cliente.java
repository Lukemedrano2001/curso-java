package model.oneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	// OneToOne: Vai criar uma coluna chamada assento_id, além fazer as operações em cascata
	// JoinColum: Garantindo o relacionamento 1 para 1 entre Cliente e Assento, pode colocar as restrições unique, null, not null
	// Atributo assento dentro de Cliente: A partir do cliente, vamos descobrir qual o assento dele, mais comum
	@OneToOne(cascade = {CascadeType.PERSIST})	
	@JoinColumn(unique = true)	
	private Assento assento;
	
	public Cliente() {}
	
	public Cliente(String nome, Assento assento) {
		this.nome = nome;
		this.assento = assento;
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

	public Assento getAssento() {
		return this.assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	
	@Override
	public String toString() {
		return String.format("Id do Cliente: %d | Nome do Cliente: %s | Id do Assento: %s", 
				this.getId(), this.getNome(), this.getAssento().getId());
	}
}
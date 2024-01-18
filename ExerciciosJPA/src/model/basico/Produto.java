package model.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "produto_nome", length = 150, nullable = false)
	private String nome;
	
	@Column(name = "produto_preco", nullable = false, precision = 11, scale = 2)
	private Double preco;	// Numero com no máximo 9 digitos e no máximo 2 casas decimais
	
	// Um produto tem uma lista de itens pedidos

	// O construtor padrão é necessário para o JPA
	public Produto() {}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
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

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return String.format("Id: %d | Nome: %s | Preço: %.2f", this.getId(), this.getNome(), this.getPreco());
	}
}
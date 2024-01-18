package model.oneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.basico.Produto;

@Entity
@Table(name = "itens_pedidos")
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Um pedido pode estar relacionado muitos itens de pedidos, mas um item pedido está relacionado a somente 1 pedido
	// ManyToOne(fetch = FetchType.EAGER) é o padrão para a Annotation ManyToOne, o EAGER retorna de forma apressada
	// Se é somente um dado, que está relacionado ao item pedido, o JPA retorna de forma implicita o produto
	@ManyToOne(fetch = FetchType.EAGER)
	private Pedido pedido;	
	
	// Um produto pode estar relacionado a muitos itens de pedidos, mas um item pedido está relacionado a somente 1 produto
	// ManyToOne(fetch = FetchType.EAGER) é o padrão para a Annotation ManyToOne
	// Se é somente um dado, que está relacionado ao item pedido, o JPA retorna de forma implicita o pedido
	@ManyToOne(fetch = FetchType.EAGER)
	private Produto produto;	
	
	// Obrigatório
	@Column(nullable = false)
	private int quantidade;
	
	// Obrigatório
	@Column(nullable = false)
	private Double preco;
	
	
	public ItemPedido() {}

	public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
		this.setPedido(pedido);
		this.setProduto(produto);
		this.setQuantidade(quantidade);
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		
		// Verificação pra dar um set em produto
		if(produto != null && this.preco == null) {
			this.setPreco(produto.getPreco());
		}
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return this.preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return String.format("Id do Item Pedido: %d | Id do Pedido: %d | Id do Produto: %s | Preço: %.2f | Quantidade: %d", 
				this.getId(), this.getPedido().getId(), this.getProduto().getNome(), this.getPreco(), this.getQuantidade());
	}
}
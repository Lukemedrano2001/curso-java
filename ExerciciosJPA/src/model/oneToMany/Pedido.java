package model.oneToMany;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// Obrigatório
	private Date data;
	
	// Um pedido tem uma lista de itens pedidos
	// @OneToMany(fetch = FetchType.LAZY) é o padrão para a Annotation @OneToMany, o LAZY retorna de forma tardia
	// Se é uma lista, o JPA não retorna, pois pode ter diversos itens nessa lista
	@OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
	private List<ItemPedido> itensPedidos;
	
	
	public Pedido() {
		this(new Date());
	}
	
	public Pedido(Date data) {
		this.data = data;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItensPedidos() {
		return this.itensPedidos;
	}

	public void setItensPedidos(List<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}
	
	@Override
	public String toString() {
		return String.format("Id do Pedido: %d | Data: %s", this.getId(), this.getData());
	}
}
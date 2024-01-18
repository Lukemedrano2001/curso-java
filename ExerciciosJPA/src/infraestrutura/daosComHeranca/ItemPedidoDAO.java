package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.oneToMany.ItemPedido;

public class ItemPedidoDAO extends DAO<ItemPedido>{
	public ItemPedidoDAO() {
		super(ItemPedido.class);
	}
}
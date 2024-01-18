package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.oneToMany.Pedido;

public class PedidoDAO extends DAO<Pedido>{
	public PedidoDAO() {
		super(Pedido.class);
	}
}

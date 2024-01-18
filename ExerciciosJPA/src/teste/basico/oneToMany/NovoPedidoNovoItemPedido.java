package teste.basico.oneToMany;

import infraestrutura.DAO;
import model.basico.Produto;
import model.oneToMany.ItemPedido;
import model.oneToMany.Pedido;

public class NovoPedidoNovoItemPedido {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<Object>();
		
		Produto produto = new Produto("Celular", 3000.99);
		Pedido pedido = new Pedido();
		ItemPedido itemPedido = new ItemPedido(pedido, produto, 30);
		
		dao.abrirTransacao()
			.incluir(produto)
			.incluir(pedido)
			.incluir(itemPedido)
			.fecharTransacao()
			.fecharDAO();
	}
}
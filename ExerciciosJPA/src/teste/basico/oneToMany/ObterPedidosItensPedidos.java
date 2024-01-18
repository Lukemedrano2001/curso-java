package teste.basico.oneToMany;

import infraestrutura.DAO;
import model.oneToMany.ItemPedido;
import model.oneToMany.Pedido;

public class ObterPedidosItensPedidos {
	public static void main(String[] args) {
		// Considere o desempenho dessas consultas em termos de EAGER ou LAZY e determine onde cada estratégia é apropriada, determine qual classe vai ter o EAGER e qual vai ter o LAZY.
		// EAGER: Todas as associações são carregadas imediatamente junto com a entidade que possui muitas associações, ocorre de forma implicita, o que pode resultar em perda de desempenho.
		// LAZY: Todas as associações são carregadas somente quando você as chama de forma explícita, proporcionando ganho de desempenho ao carregar somente o necessário no momento certo.
		// Considere retornar tudo o que você precisa em uma só consulta, pois tem ganho de desempenho, se você fizer duas consultas ou mais, tem perca de desempenho.
		
		DAO<Pedido> dao = new DAO<Pedido>(Pedido.class);
		
		// Primeira Consulta para obter o pedido, retorna o fetch de forma EAGER, apressada
		Pedido pedido = dao.obterUmRegistro("id", 5L);
		System.out.println(pedido.toString());
		
		// Segunda consulta para obter os itens que um pedido tem, retorna o fetch de forma LAZY, tardia
		for(ItemPedido itemPedido: pedido.getItensPedidos()) {
			System.out.println(itemPedido.toString());
		}
		
		dao.fecharDAO();		
	}
}
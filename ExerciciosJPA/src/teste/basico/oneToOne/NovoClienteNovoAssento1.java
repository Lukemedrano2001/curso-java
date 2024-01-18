package teste.basico.oneToOne;

import infraestrutura.DAO;
import model.oneToOne.Assento;
import model.oneToOne.Cliente;

public class NovoClienteNovoAssento1 {
	public static void main(String[] args) {
		// Pode criar um DAO para cada um
		// Precisa inserir o assento primeiro para que a inserção do cliente seja efetivada
		Assento assento = new Assento("3P");
		Cliente cliente = new Cliente("Bia", assento);
		
		DAO<Object> dao = new DAO<Object>();
		
		dao.abrirTransacao()
			.incluir(assento)
			.incluir(cliente)
			.fecharTransacao()
			.fecharDAO();
		
		System.out.printf("%s \n", assento.toString());
		System.out.printf("%s", cliente.toString());
	}
}
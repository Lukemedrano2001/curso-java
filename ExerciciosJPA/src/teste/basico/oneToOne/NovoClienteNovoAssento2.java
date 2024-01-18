package teste.basico.oneToOne;

import infraestrutura.DAO;
import model.oneToOne.Assento;
import model.oneToOne.Cliente;

public class NovoClienteNovoAssento2 {
	public static void main(String[] args) {
		// Pode criar um DAO para cada um
		// Precisa inserir o assento primeiro para que a inserção do cliente seja efetivada
		Assento assento = new Assento("6O");
		Cliente cliente = new Cliente("Gabi", assento);
		
		DAO<Object> dao = new DAO<Object>();
		
		// Fazendo a persistência em cascata, mesmo que não faça a persistência do assento, ele será persistido de forma automática pelo JPA
		dao.abrirTransacao()
			.incluir(cliente)
			.fecharTransacao()
			.fecharDAO();
		
		System.out.printf("%s \n", assento.toString());
		System.out.printf("%s", cliente.toString());
		
	}
}
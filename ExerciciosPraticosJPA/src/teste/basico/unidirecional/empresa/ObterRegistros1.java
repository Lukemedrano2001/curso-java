package teste.basico.unidirecional.empresa;

import java.util.List;

import infraestrutura.daosComHeranca.ClienteDAO;
import model.unidirecional.empresa.Cliente;

public class ObterRegistros1 {
	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		
		List<Cliente> clientes = dao.obterTodos();
		
		for(Cliente cliente: clientes) {
			System.out.println(cliente.toString());
		}
		
		dao.fecharDAO();
	}
}
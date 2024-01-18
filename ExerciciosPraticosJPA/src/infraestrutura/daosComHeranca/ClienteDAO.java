package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.unidirecional.empresa.Cliente;

public class ClienteDAO extends DAO<Cliente> {
	public ClienteDAO() {
		super(Cliente.class);		
	}
}
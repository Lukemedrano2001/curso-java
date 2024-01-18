package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.oneToOne.Cliente;

public class ClienteDAO extends DAO<Cliente>{
	// Você pode ter métodos alternativos aqui
	
	public ClienteDAO() {
		super(Cliente.class);
	}
}

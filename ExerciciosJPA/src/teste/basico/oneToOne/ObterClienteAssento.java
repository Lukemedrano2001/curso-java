package teste.basico.oneToOne;

import infraestrutura.daosComHeranca.AssentoDAO;
import infraestrutura.daosComHeranca.ClienteDAO;
import model.oneToOne.Assento;
import model.oneToOne.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		// Cliente
		ClienteDAO daoCliente = new ClienteDAO();
		Cliente cliente = daoCliente.obterUmRegistro("id", 1L);
		System.out.println(cliente.toString());
		daoCliente.fecharDAO();
		
		// Assento
		AssentoDAO daoAssento = new AssentoDAO();		
		Assento assento = daoAssento.obterUmRegistro("id", 1L);
		System.out.println(assento.toString());
		daoAssento.fecharDAO();
	}
}
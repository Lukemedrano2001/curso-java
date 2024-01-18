package teste.basico.unidirecional.empresa;

import model.unidirecional.empresa.Cliente;
import model.unidirecional.empresa.Endereco;
import model.unidirecional.empresa.Funcionario;
import model.unidirecional.empresa.Servico;
import model.unidirecional.empresa.Telefone;

public class NovosRegistrosConfig {
	static Cliente cliente1 = new Cliente("João", "joao@gmail.com", "1234", "Solteiro", "Premium");
	static Cliente cliente2 = new Cliente("Maria", "maria@gmail.com", "5678", "Casada", "Comum");
	
	static Funcionario funcionario1 = new Funcionario("Roberto", "roberto@gmail.com", "4321", "Gerente", "Administrativo", 5000);
	static Funcionario funcionario2 = new Funcionario("Carlos", "carlos@gmail.com", "8765", "Auxiliar", "Administrativo", 4000);
	
	static Telefone telefone1 = new Telefone(12, 3456789);
	static Telefone telefone2 = new Telefone(21, 9876543);
	static Telefone telefone3 = new Telefone(34, 1256789);
	static Telefone telefone4 = new Telefone(43, 9876521);
	
	static Endereco endereco1 = new Endereco("Rua 1", "Complemento 1");
	static Endereco endereco2 = new Endereco("Rua 2", "Complemento 2");
	static Endereco endereco3 = new Endereco("Rua 3", "Complemento 3");
	static Endereco endereco4 = new Endereco("Rua 4", "Complemento 4");
	
	static Servico servico1 = new Servico("Serviço 1", 10);
	static Servico servico2 = new Servico("Serviço 2", 20);
	static Servico servico3 = new Servico("Serviço 3", 30);
	static Servico servico4 = new Servico("Serviço 4", 40);
	
	
	public static void configuracaoInicial() {
		cliente1.adicionaTelefone(telefone1);
		cliente1.adicionaTelefone(telefone2);
		
		funcionario1.adicionaTelefone(telefone3);
		funcionario1.adicionaTelefone(telefone4);
		
		cliente1.setEndereco(endereco1);
		cliente2.setEndereco(endereco2);
		
		funcionario1.setEndereco(endereco3);
		funcionario2.setEndereco(endereco4);
		
		cliente1.adicionaServico(servico1);
		cliente1.adicionaServico(servico2);
		cliente2.adicionaServico(servico3);
		cliente2.adicionaServico(servico4);
		
		funcionario1.adicionaServico(servico1);
		funcionario1.adicionaServico(servico2);
		funcionario2.adicionaServico(servico3);
		funcionario2.adicionaServico(servico4);

	}
}
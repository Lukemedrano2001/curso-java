package teste.basico.unidirecional.empresa;

import java.util.List;

import infraestrutura.daosComHeranca.FuncionarioDAO;
import model.unidirecional.empresa.Funcionario;

public class ObterRegistros2 {
	public static void main(String[] args) {
		FuncionarioDAO dao = new FuncionarioDAO();
		
		List<Funcionario> funcionarios = dao.obterTodos();
		
		for(Funcionario funcionario: funcionarios) {
			System.out.println(funcionario.toString());
		}
		
		dao.fecharDAO();
	}
}
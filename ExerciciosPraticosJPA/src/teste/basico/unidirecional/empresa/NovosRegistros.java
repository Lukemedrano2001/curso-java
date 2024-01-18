package teste.basico.unidirecional.empresa;

import infraestrutura.daosComHeranca.PessoaDAO;

public class NovosRegistros {
	public static void main(String[] args) {
		PessoaDAO daoPessoa = new PessoaDAO();
		
		 NovosRegistrosConfig.configuracaoInicial();
		 
		 daoPessoa.abrirTransacao()
			.incluir(NovosRegistrosConfig.cliente1)
			.incluir(NovosRegistrosConfig.cliente2)
			.fecharTransacao();
		 
		 daoPessoa.abrirTransacao()
			.incluir(NovosRegistrosConfig.funcionario1)
			.incluir(NovosRegistrosConfig.funcionario2)
			.fecharTransacao();
		
		 daoPessoa.fecharDAO();
	}
}
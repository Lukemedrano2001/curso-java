package teste.basico.bidirecional.redeSocial;

import infraestrutura.daosComHeranca.UsuarioDAO;

public class NovosRegistros {
	public static void main(String[] args) {
		UsuarioDAO daoUsuario = new UsuarioDAO();
        NovosRegistrosConfig.configuracaoInicial();
		
		daoUsuario.abrirTransacao()
			.incluir(NovosRegistrosConfig.usuario1)
			.incluir(NovosRegistrosConfig.usuario2)
			.incluir(NovosRegistrosConfig.usuario3)
			.fecharTransacao();
		
		daoUsuario.fecharDAO();
	}
}
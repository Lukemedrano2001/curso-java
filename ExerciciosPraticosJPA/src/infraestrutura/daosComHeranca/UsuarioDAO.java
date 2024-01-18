package infraestrutura.daosComHeranca;

import infraestrutura.DAO;
import model.bidirecional.redeSocial.Usuario;

public class UsuarioDAO extends DAO<Usuario>{
	public UsuarioDAO() {
		super(Usuario.class);
	}
}
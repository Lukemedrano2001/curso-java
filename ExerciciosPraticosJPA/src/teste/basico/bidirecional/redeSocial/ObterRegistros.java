package teste.basico.bidirecional.redeSocial;

import java.util.List;

import infraestrutura.daosComHeranca.UsuarioDAO;
import model.bidirecional.redeSocial.Amizade;
import model.bidirecional.redeSocial.Comentario;
import model.bidirecional.redeSocial.Postagem;
import model.bidirecional.redeSocial.Usuario;

public class ObterRegistros {
	public static void main(String[] args) {
		UsuarioDAO dao = new UsuarioDAO();
		
		List<Usuario> usuarios = dao.obterTodos();
		
		for(Usuario usuario: usuarios) {
			System.out.println(usuario.toString());			
			
			for(Amizade amigo: usuario.getAmigos()) {
				System.out.println(amigo.toString());
			}
			
			for(Postagem postagem: usuario.getPostagens()) {
				System.out.println(postagem.toString());
			}
			
			for(Comentario comentario: usuario.getComentarios()) {
				System.out.println(comentario.toString());
			}
		}
		
		dao.fecharDAO();
	}
}
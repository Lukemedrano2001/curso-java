package teste.basico.bidirecional.redeSocial;

import model.bidirecional.redeSocial.Comentario;
import model.bidirecional.redeSocial.ConfiguracoesUsuario;
import model.bidirecional.redeSocial.HashTag;
import model.bidirecional.redeSocial.Postagem;
import model.bidirecional.redeSocial.Usuario;

public class NovosRegistrosConfig {
	static Usuario usuario1 = new Usuario("Fulano", "fulano@email.com", "1234");
	static Usuario usuario2 = new Usuario("Beltrano", "beltrano@email.com", "4321");
	static Usuario usuario3 = new Usuario("Ciclano", "ciclano@email.com", "5678");
	
	static ConfiguracoesUsuario config1 = new ConfiguracoesUsuario("Público", "Claro", "Inglês", "Brasil");
	static ConfiguracoesUsuario config2 = new ConfiguracoesUsuario("Privado", "Escuro", "Espanhol", "Espanha");
	static ConfiguracoesUsuario config3 = new ConfiguracoesUsuario("Privado", "Escuro", "Português-BR", "Brasil");
	
	static Postagem postagem1 = new Postagem(usuario1, "Postagem 1", "Conteudo 1");
	static Postagem postagem2 = new Postagem(usuario1, "Postagem 2", "Conteudo 2");
	static Postagem postagem3 = new Postagem(usuario2, "Postagem 3", "Conteudo 3");
	static Postagem postagem4 = new Postagem(usuario2, "Postagem 4", "Conteudo 4");
	static Postagem postagem5 = new Postagem(usuario3, "Postagem 5", "Conteudo 5");
	static Postagem postagem6 = new Postagem(usuario3, "Postagem 6", "Conteudo 6");
	
	static Comentario comentario1 = new Comentario(usuario1, "Comentario 1");
	static Comentario comentario2 = new Comentario(usuario1, "Comentario 2");
	static Comentario comentario3 = new Comentario(usuario1, "Comentario 3");
	static Comentario comentario4 = new Comentario(usuario1, "Comentario 4");
	static Comentario comentario5 = new Comentario(usuario2, "Comentario 5");
	static Comentario comentario6 = new Comentario(usuario2, "Comentario 6");
	
	static HashTag hashtag1 = new HashTag("A");
	static HashTag hashtag2 = new HashTag("B");
	static HashTag hashtag3 = new HashTag("C");
	static HashTag hashtag4 = new HashTag("D");
	static HashTag hashtag5 = new HashTag("E");
	static HashTag hashtag6 = new HashTag("F");
	
	public static void configuracaoInicial() {
		// Adiciona os amigos
		usuario1.adicionaAmigo(usuario2);
		usuario1.adicionaAmigo(usuario3);
		usuario2.adicionaAmigo(usuario3);
		
		// Associa ConfiguracoesUsuario aos Usuarios
        usuario1.setConfigUsuario(config1);
        usuario2.setConfigUsuario(config2);
        usuario3.setConfigUsuario(config3);

        // Associa Postagens aos Usuarios
        usuario1.adicionaPostagem(postagem1);
        usuario1.adicionaPostagem(postagem2);
        usuario2.adicionaPostagem(postagem3);
        usuario2.adicionaPostagem(postagem4);
        usuario3.adicionaPostagem(postagem5);
        usuario3.adicionaPostagem(postagem6);

        // Associa os Comentarios e as Postagens aos Usuarios
        usuario1.adicionaComentario(postagem1, comentario1);
        usuario1.adicionaComentario(postagem1, comentario2);
        usuario2.adicionaComentario(postagem2, comentario3);
        usuario2.adicionaComentario(postagem2, comentario4);
        usuario3.adicionaComentario(postagem3, comentario5);
        usuario3.adicionaComentario(postagem3, comentario6);

        // Associa HashTags às Postagens
        postagem1.adicionaHashtag(hashtag1);
        postagem1.adicionaHashtag(hashtag2);
        postagem2.adicionaHashtag(hashtag3);
        postagem2.adicionaHashtag(hashtag4);
        postagem3.adicionaHashtag(hashtag5);
        postagem3.adicionaHashtag(hashtag6);
	}
}
package model.bidirecional.redeSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	private UUID id;
	private String nome;
	private String email;
	private String senha;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST)
	private List<Amizade> amizades = new ArrayList<Amizade>();
	
	@OneToMany(mappedBy = "autor", cascade = CascadeType.PERSIST)
	private List<Postagem> postagens = new ArrayList<Postagem>();
	
	@OneToMany(mappedBy = "autor", cascade = CascadeType.PERSIST)
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "config_usuario_id")
	private ConfiguracoesUsuario configUsuario;
	
	public Usuario() {}

	public Usuario(String nome, String email, String senha) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Amizade> getAmigos() {
		return this.amizades;
	}

	public void adicionaAmigo(Usuario amigo) {
	    Amizade novaAmizade = new Amizade(this, amigo);

	    if (!this.amizades.contains(novaAmizade)) {
	        this.amizades.add(novaAmizade);
	        amigo.amizades.add(novaAmizade);
	    }else {
	    	return;
	    }
	}

	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void adicionaPostagem(Postagem postagem) {
		this.postagens.add(postagem);
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void adicionaComentario(Postagem postagem, Comentario comentario) {
	    if (this.postagens.contains(postagem)) {
	        postagem.adicionaComentario(comentario);
	        this.comentarios.add(comentario);
	    }
	}
	
	public ConfiguracoesUsuario getConfigUsuario() {
		return this.configUsuario;
	}

	public void setConfigUsuario(ConfiguracoesUsuario configUsuario) {
		this.configUsuario = configUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null || getClass() != objeto.getClass())
			return false;
		Usuario usuario = (Usuario) objeto;
		return Objects.equals(id, usuario.id);
	}
	
	@Override
	public String toString() {
		String nome = "Nome: " + this.getNome();
		String email = "E-mail: " + this.getEmail();
		List<String> amigos = new ArrayList<String>();
		
		for(Amizade amizade: this.getAmigos()) {
			String amigo = amizade.getAmigo().getNome();
			amigos.add(amigo);
		}
		
		return String.format("%s | %s | Amigos: %s", nome, email, amigos);
	}
}
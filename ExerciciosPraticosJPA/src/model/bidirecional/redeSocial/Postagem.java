package model.bidirecional.redeSocial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "postagens")
public class Postagem {
	@Id
	private UUID id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Usuario autor;
	private String titulo;
	private String conteudo;
	
	@Column(name = "data_hora_publicacao")
	private Date dataHoraPublicacao;
	
	@OneToMany(mappedBy = "postagem", cascade = CascadeType.PERSIST)
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "postagens_hashtags", 
			joinColumns = @JoinColumn(name = "postagem_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "hashtag_id", referencedColumnName = "id")
	)
	private List<HashTag> hashtags = new ArrayList<HashTag>();
	
	public Postagem() {}
	
	public Postagem(Usuario autor, String titulo, String conteudo) {
		this.id = UUID.randomUUID();
		this.autor = autor;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.dataHoraPublicacao = new Date();
	}

	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Usuario getAutor() {
		return this.autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getConteudo() {
		return this.conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Date getdataHoraPublicacao() {
		return this.dataHoraPublicacao;
	}
	
	public void setDataHoraPublicacao(Date data) {
		this.dataHoraPublicacao = data;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void adicionaComentario(Comentario comentario) {
		this.comentarios.add(comentario);
		comentario.setPostagem(this);
	}

	public List<HashTag> getHashtags() {
		return this.hashtags;
	}

	public void adicionaHashtag(HashTag hashtag) {
		if(!this.hashtags.contains(hashtag)) {
			this.hashtags.add(hashtag);
		}else {
			return;
		}
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
		Postagem postagem = (Postagem) objeto;
		return Objects.equals(id, postagem.id);
	}
}
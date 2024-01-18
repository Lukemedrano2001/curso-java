package model.bidirecional.redeSocial;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentario {
	@Id
	private UUID id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Usuario autor;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Postagem postagem;
	
	private String conteudo;
	
	@Column(name = "data_hora_publicacao")
	private Date dataHoraPublicacao;
	
	public Comentario() {}
	
	public Comentario(Usuario autor, String conteudo) {
		this.id = UUID.randomUUID();
		this.autor = autor;
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
	public Postagem getPostagem() {
		return this.postagem;
	}
	
	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
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
		Comentario comentario = (Comentario) objeto;
		return Objects.equals(id, comentario.id);
	}
}
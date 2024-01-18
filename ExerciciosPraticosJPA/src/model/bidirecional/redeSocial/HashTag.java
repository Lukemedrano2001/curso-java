package model.bidirecional.redeSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hashtags")
public class HashTag {
	@Id
	private UUID id;
	private String nome;
	
	@ManyToMany(mappedBy = "hashtags", cascade = CascadeType.PERSIST)
	private List<Postagem> postagens = new ArrayList<Postagem>();
	
	public HashTag() {}
	
	public HashTag(String nome) {
		this.id = UUID.randomUUID();
		this.nome = nome;
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

	public List<Postagem> getPostagens() {
		return this.postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
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
		HashTag hashtag = (HashTag) objeto;
		return Objects.equals(id, hashtag.id);
	}
}
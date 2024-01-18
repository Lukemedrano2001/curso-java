package model.bidirecional.redeSocial;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "amizades")
public class Amizade {
	@Id
	private UUID id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Usuario amigo;

	public Amizade() {}
	
	public Amizade(Usuario usuario, Usuario amigo) {
		this.id = UUID.randomUUID();
		this.usuario = usuario;
		this.amigo = amigo;
	}
	
	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getAmigo() {
		return this.amigo;
	}

	public void setAmigo(Usuario amigo) {
		this.amigo = amigo;
	}
}
package model.bidirecional.redeSocial;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configs_usuarios")
public class ConfiguracoesUsuario {
	@Id
	private UUID id;
	
	@Column(name = "tipo_perfil")
	private String tipoPerfil;
	private String tema;
	private String idioma;
	private String regiao;
	
	public ConfiguracoesUsuario() {}
	
	public ConfiguracoesUsuario(String tipoPerfil, String tema, String idioma, String regiao) {
		this.id = UUID.randomUUID();
		this.tipoPerfil = tipoPerfil;
		this.tema = tema;
		this.idioma = idioma;
		this.regiao = regiao;
	}

	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTipoPerfil() {
		return this.tipoPerfil;
	}

	public void setTipoPerfil(String tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

	public String getTema() {
		return this.tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getRegiao() {
		return this.regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
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
		ConfiguracoesUsuario configUsuario = (ConfiguracoesUsuario) objeto;
		return Objects.equals(id, configUsuario.id);
	}
}
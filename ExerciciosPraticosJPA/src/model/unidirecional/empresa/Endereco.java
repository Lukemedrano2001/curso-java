package model.unidirecional.empresa;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
	@Id
	private UUID id;
	private String logradouro;
	private String complemento;
	
	public Endereco() {}
	
	public Endereco(String logradouro, String complemento) {
		this.id = UUID.randomUUID();
		this.logradouro = logradouro;
		this.complemento = complemento;
	}

	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getEnderecoCompleto() {
		return String.format("%s | %s", this.getLogradouro(), this.getComplemento());
	}
	
	@Override
	public String toString() {
		String enderecoCompleto = this.getEnderecoCompleto();
		return String.format("%s", enderecoCompleto);
	}
}
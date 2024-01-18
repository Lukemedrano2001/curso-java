package model.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	// Use do Embeddable para quando você precisar de reuso via composição
	
	private String logradouro;
	
	private String complemento;
	
	public Endereco() {}
	
	public Endereco(String logradouro, String complemento) {
		this.logradouro = logradouro;
		this.complemento = complemento;
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
}

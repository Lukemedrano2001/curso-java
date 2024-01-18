package br.com.lukemedrano.teste.exercicioSB.controllersExemplos;

import org.springframework.http.HttpStatus;

public class RespostaEntidade {
	private HttpStatus status;
	private Object objeto;
	private String mensagem;
	
	public RespostaEntidade(HttpStatus status, String mensagem, Object objeto) {
		this.status = status;
		this.objeto = objeto;
		this.mensagem = mensagem;
	}

	public HttpStatus getStatus() {
		return this.status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Object getObjeto() {
		return this.objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public RespostaEntidade statusHttpSucesso(HttpStatus status, String mensagem, Object objeto) {
		return new RespostaEntidade(status, mensagem, objeto);
	}
	
	public RespostaEntidade statusHttpNotFound(HttpStatus status, String mensagem, Object objeto) {
		return new RespostaEntidade(status, mensagem, objeto);
	}
	
	public RespostaEntidade statusHttpBadRequest(HttpStatus status, String mensagem, Object objeto) {
		return new RespostaEntidade(status, mensagem, objeto);
	}
	
	public RespostaEntidade statusHttpInternalServerError(HttpStatus status, String mensagem, Object objeto) {
		return new RespostaEntidade(status, mensagem, objeto);
	}
}
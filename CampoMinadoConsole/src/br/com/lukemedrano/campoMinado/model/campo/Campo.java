package br.com.lukemedrano.campoMinado.model.campo;

import java.util.ArrayList;
import java.util.List;
import br.com.lukemedrano.campoMinado.controller.ExplosaoException;

public class Campo {
	private final int linha;
	private final int coluna;
	private boolean aberto = false;	// Campo sem mina
	private boolean minado = false;	// Campo com mina
	private boolean marcado = false; // Campo marcado, pois tem uma possível mina
	private List<Campo> vizinhos = new ArrayList<Campo>();	// AutoRelacionamento, um campo pode ter uma lista de vizinhos
	
	public Campo(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	// Logo abaixo, os métodos com visibilidade public
	
	public boolean isAberto() {
		return this.aberto;
	}
	
	public boolean isFechado() {
		return !this.isAberto();
	}
	
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public boolean isMinado() {
		return this.minado;
	}
	
	public boolean isNaoMinado() {
		return !this.isMinado();
	}
	
	public boolean isMarcado() {
		return this.marcado;
	}
	
	public boolean isNaoMarcado() {
		return !this.isMarcado();
	}
	
	public int getLinha() {
		return this.linha;
	}
	
	public int getColuna() {
		return this.coluna;
	}
	
	public List<Campo> getVizinhos(){
		return this.vizinhos;
	}
	
	public boolean abrir() {
		if(!this.aberto && !this.marcado) {
			this.aberto = true;
			
			if(this.minado) {
				throw new ExplosaoException();
			}
			
			if(this.vizinhacaSegura()) {
				this.vizinhos.forEach(vizinho -> vizinho.abrir());
			}
			
			return true;
		}else {			
			return false;			
		}
	}
	
	public boolean adicionaVizinho(Campo vizinho) {
		boolean linhaDiferente = this.linha != vizinho.linha;
		boolean colunaDiferente = this.coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(this.linha - vizinho.linha);
		int deltaColuna = Math.abs(this.coluna - vizinho.coluna);
		int deltaGeral = deltaLinha + deltaColuna;
		
		if(deltaGeral == 1 && !diagonal) {	// Vizinho na Horizontal ou Vertical
			vizinhos.add(vizinho);
			return true;
		}else if(deltaGeral == 2 && diagonal) {	// Vizinho na Diagonal
			vizinhos.add(vizinho);
			return true;
		}else {
			return false;
		}
	}
	
	public void alternaMarcacao() {
		if(!this.aberto) {
			this.marcado = !this.marcado;
		}
	}
	
	public void reiniciar() {
		this.aberto = false;
		this.minado = false;
		this.marcado = false;
	}
	
	public boolean minar() {
		if(!this.minado) {
			this.minado = true;	
			return true;
		}else {
			return false;
		}
	}
	
	public boolean objetivoAlcancado() {
		boolean desvendado = !this.minado && this.aberto;
		boolean protegido = this.minado && this.marcado;
		
		return desvendado || protegido;
	}
	
	@Override
	public String toString() {
		if(this.marcado) {
			return "x";
		}else if (this.aberto && this.minado) {
			return "*";
		}else if (this.aberto && this.minasNaVizinhaca() > 0){
			return Long.toString(this.minasNaVizinhaca());
		}else if(this.aberto) {
			return " ";
		}else {
			return "?";
		}
	}
	
	// Logo abaixo, os métodos com visibilidade de pacote ou default
	
	boolean vizinhacaSegura() {
		return this.vizinhos.stream().noneMatch(vizinho -> vizinho.minado);
	}
	
	long minasNaVizinhaca() {
		return this.vizinhos.stream().filter(vizinho -> vizinho.minado).count();
	}
}
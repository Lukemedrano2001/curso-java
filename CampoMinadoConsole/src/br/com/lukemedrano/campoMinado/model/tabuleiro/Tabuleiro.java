package br.com.lukemedrano.campoMinado.model.tabuleiro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.lukemedrano.campoMinado.controller.ExplosaoException;
import br.com.lukemedrano.campoMinado.model.campo.Campo;

public class Tabuleiro{
	private int linhas;
	private int colunas;
	private int minas;
	private final List<Campo> campos = new ArrayList<Campo>();
	
	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		this.geraCampos();
		this.associaVizinho();
		this.sorteioMinas();
	}
	
	// Logo abaixo, os métodos com visibilidade public
	
	public int getLinhas() {
		return this.linhas;
	}
	
	public int getColunas() {
		return this.colunas;
	}
	
	public int getMinas() {
		return this.minas;
	}
	
	public boolean abrir(int linha, int coluna) {
		try {
			this.campos.parallelStream()
				.filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
				.findFirst()
				.ifPresent(campo -> campo.abrir());
			
			return true;
		}catch(ExplosaoException excecao) {
			this.campos.forEach(campo -> campo.setAberto(true));
			throw excecao;
		}
	}
	
	public boolean alternaMarcacao(int linha, int coluna) {
		this.campos.parallelStream()
			.filter(campo -> campo.getLinha() == linha && campo.getColuna() == coluna)
			.findFirst()
			.ifPresent(campo -> campo.alternaMarcacao());
		
		return true;
	}
	
	public Campo getCampo(int linha, int coluna) {
		this.validaCoordenadas(linha, coluna);
		int indice = linha * this.colunas + coluna;
		return this.campos.get(indice);
	}
	
	public List<Campo> getCampos() {
		return this.campos;
	}
	
	public boolean objetivoAlcancado() {
		return this.campos.stream().allMatch(campo -> campo.objetivoAlcancado());
	}
	
	public boolean objetivoNaoAlcancado() {
		return !this.objetivoAlcancado();
	}
	
	public void reiniciaJogo() {
		this.campos.stream().forEach(campo -> campo.reiniciar());
		this.sorteioMinas();
	}

	@Override
	public String toString() {
		StringBuilder stringbuilder = new StringBuilder();
		
		stringbuilder.append("  ");
		for(int coluna = 0; coluna < this.colunas; coluna++) {
			stringbuilder
				.append(" ")
				.append(coluna)
				.append(" ");
		}
		
		stringbuilder.append("\n");
		
		int i = 0;
		for(int linha = 0; linha < this.linhas; linha++) {
			stringbuilder
				.append(linha)
				.append(" ");
			for(int coluna = 0; coluna < this.colunas; coluna++) {
				stringbuilder
					.append(" ")
					.append(this.campos.get(i))
					.append(" ");
				i++;
			}
			
			stringbuilder.append("\n");
		}
		
		return stringbuilder.toString();
	}
	
	// Logo abaixo, os métodos com visibilidade de pacote ou default
	
	void geraCampos() {
		for(int linha = 0; linha < this.linhas; linha++) {
			for(int coluna = 0; coluna < this.colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}
	
	void associaVizinho() {
		for(Campo campo1: this.campos) {
			for(Campo campo2: this.campos) {
				campo1.adicionaVizinho(campo2);
			}
		}
	}
	
	void sorteioMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = campo -> campo.isMinado();
		
		while(minasArmadas < this.minas) {
			int aleatorio = (int) (Math.random() * campos.size());
			this.campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		}
	}
	
	boolean validaCoordenadas(int linha, int coluna) {
		if(linha < 0 || linha >= this.linhas || coluna < 0 || coluna >= this.colunas) {
			throw new IllegalArgumentException("Coordenadas fora dos limites do tabuleiro");
		}else {
			return true;
		}
	}
}
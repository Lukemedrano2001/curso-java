package br.com.lukemedrano.calculadora.model;

@FunctionalInterface
public interface MemoriaObserver {
	public void valorAlterado(String novoValor);
}

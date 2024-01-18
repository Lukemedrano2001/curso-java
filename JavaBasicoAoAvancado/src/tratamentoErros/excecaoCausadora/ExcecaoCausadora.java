package tratamentoErros.excecaoCausadora;

import streamAPI.filter.Aluno;

public class ExcecaoCausadora {
	// Uma exceção pode ser a causa de outra exceção, gerando um encadeamento de exceções
    // Neste contexto, uma exceção pode ser a causa de outra exceção e assim por diante
	
	public static void main(String[] args) {
		try {
			metodo1(null);
		} catch (IllegalArgumentException excecao) {
			if(excecao.getCause() != null) {
				System.out.println(excecao.getCause().getMessage());
			}
		}
	}
	
	static void metodo1(Aluno aluno) {
		try {
			metodo2(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodo2(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno é null");
		}
		
		System.out.println(aluno.nome);
	}
}
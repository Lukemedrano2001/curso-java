package tratamentoErros;

import streamAPI.filter.Aluno;

public class ExcecaoBasico {
	public static void main(String[] args) {
		Aluno aluno1 = null;
		try {
			// NullPointerException
			ExcecaoBasico.imprimeNomeAluno(aluno1);
			
			
		}catch(Exception excecao) {
			System.out.println("Ocorreu um erro ao imprimir o nome do aluno.");
		}
		
		try {
			// ArithmeticException
			System.out.println(7 / 0);
		}catch(ArithmeticException excecao) {
			System.out.println("Ocorreu o erro: " + excecao.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	public static void imprimeNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
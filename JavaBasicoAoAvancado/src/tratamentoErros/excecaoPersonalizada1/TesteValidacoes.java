package tratamentoErros.excecaoPersonalizada1;

import streamAPI.filter.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		// String Vazia
		try {
			Aluno aluno1 = new Aluno("", -7);
			Validacao.usuario(aluno1);
		}catch (StringVaziaException | NumeroForaIntervaloException excecao) {
			System.out.println(excecao.getMessage());
		}
		
		
		// String Vazia, mas com espaços em branco
		try {
			Aluno aluno2 = new Aluno("   ", -7);
			Validacao.usuario(aluno2);
		}catch (StringVaziaException | NumeroForaIntervaloException excecao) {
			System.out.println(excecao.getMessage());
		}
		
		
		// Nota fora do Intervalo
		try {
			Aluno aluno3 = new Aluno("Ana", -7);
			Validacao.usuario(aluno3);
		}catch (StringVaziaException | NumeroForaIntervaloException excecao) {
			System.out.println(excecao.getMessage());
		}
		
		
		// Aluno é null
		try {
			Aluno aluno4 = null;
			Validacao.usuario(aluno4);
		}catch (Exception excecao) {
			System.out.println(excecao.getMessage());
		}
		
		
		System.out.println("Fim");
	}
}
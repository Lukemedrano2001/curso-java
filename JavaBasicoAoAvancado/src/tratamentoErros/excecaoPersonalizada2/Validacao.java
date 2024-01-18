package tratamentoErros.excecaoPersonalizada2;

import streamAPI.filter.Aluno;

public class Validacao {
	private Validacao() {};
	
	public static void usuario(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno é null");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
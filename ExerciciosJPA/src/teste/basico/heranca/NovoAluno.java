package teste.basico.heranca;

import infraestrutura.DAO;
import model.heranca.Aluno;
import model.heranca.AlunoBolsista;

public class NovoAluno {
	public static void main(String[] args) {
		DAO<Aluno> dao = new DAO<Aluno>();
		
		Aluno aluno = new Aluno(123L, "Fulano");
		AlunoBolsista alunoBolsista = new AlunoBolsista(456L, "Ciclano", 1000.0);
		
		dao.abrirTransacao()
			.incluir(aluno)
			.fecharTransacao();
		
		dao
			.abrirTransacao()
			.incluir(alunoBolsista)
			.fecharTransacao();
		
		dao.fecharDAO();
	}
}
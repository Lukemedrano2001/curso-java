package teste.basico.manyToMany;

import infraestrutura.DAO;
import model.manyToMany.Ator;
import model.manyToMany.Filme;

public class NovoAtorNovoFilme {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<Object>();
		
		Filme filme1 = new Filme("Star Wars", 7.5);
		Filme filme2 = new Filme("O senhor dos Anéis", 10.0);
		
		Ator ator1 = new Ator("Fulano");
		Ator ator2 = new Ator("Ciclano");
		
		filme1.adicionaAtor(ator1);
		filme1.adicionaAtor(ator2);
		
		filme2.adicionaAtor(ator1);
		
		dao.abrirTransacao()
			.incluir(filme1)
			.incluir(filme2)
			.fecharTransacao()
			.fecharDAO();
	}
}
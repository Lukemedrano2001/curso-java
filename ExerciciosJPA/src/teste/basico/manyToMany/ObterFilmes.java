package teste.basico.manyToMany;

import java.util.List;

import infraestrutura.DAO;
import model.manyToMany.Ator;
import model.manyToMany.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<Filme>(Filme.class);
		
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);
		
		for(Filme filme: filmes) {
			System.out.println(filme.toString());
			
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.toString());
			}
		}
	}
}
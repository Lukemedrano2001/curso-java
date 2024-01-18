package model.nativeQuery;

import infraestrutura.DAO;

public class ObterMediaFilmes {
	public static void main(String[] args) {
		DAO<NotaFilme> dao = new DAO<NotaFilme>(NotaFilme.class);
		
		NotaFilme notaFilme = dao.consultarUmRegistro("obterMediaGeralDosFilmes");
		
		System.out.println(notaFilme.getMedia());
		
		dao.fecharDAO();
	}
}
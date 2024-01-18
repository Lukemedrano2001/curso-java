package jdbc.DAO;

import java.util.List;

import jdbc.Pessoa;

public class DaoTesteSelectAll {
	public static void main(String[] args) {
		DataAcessObject dao = new DataAcessObject();
		
		String sql = "SELECT * FROM pessoas";
		
		List<Pessoa> resultado = dao.selectAll(sql);
		for(Pessoa pessoa: resultado) {
			System.out.println(pessoa);
		}
		
		dao.close();
	}
}
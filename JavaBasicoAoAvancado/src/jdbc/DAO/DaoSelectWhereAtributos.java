package jdbc.DAO;

import java.util.List;
import jdbc.Pessoa;

public class DaoSelectWhereAtributos {
	public static void main(String[] args) {
		DataAcessObject dao = new DataAcessObject();
		
		String sql2 = "SELECT * FROM pessoas WHERE id > ?";
		List<Pessoa> resultado = dao.selectAll(sql2, 5);
		for(Pessoa pessoa: resultado) {
			System.out.println(pessoa);
		}
		
		dao.close();
	}
}
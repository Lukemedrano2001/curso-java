package jdbc.DAO;

public class DaoTesteUpdate {
	public static void main(String[] args) {
		DataAcessObject dao = new DataAcessObject();
		
		String sql1 = "UPDATE pessoas SET nome = ? WHERE id = ?";
		String sql2 = "UPDATE pessoas SET id = ? WHERE nome = ?";
		
		System.out.println(dao.update(sql1, "Novo Nome", 2));
		
		System.out.println(dao.update(sql2, 10, "Teste 2"));
		
		dao.close();
	}
}
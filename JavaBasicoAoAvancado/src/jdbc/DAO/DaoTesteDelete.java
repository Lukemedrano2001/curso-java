package jdbc.DAO;

public class DaoTesteDelete {
	public static void main(String[] args) {
		DataAcessObject dao = new DataAcessObject();
		
		String sql1 = "DELETE FROM pessoas WHERE id = ?";
		String sql2 = "DELETE FROM pessoas WHERE nome = ?";
		
		System.out.println(dao.delete(sql1, 1));
		System.out.println(dao.delete(sql2, "Teste 1"));
		
		dao.close();
	}
}
package jdbc.DAO;

public class DaoTesteSelectOne {
	public static void main(String[] args) {
		DataAcessObject dao = new DataAcessObject();
		
		String sql1 = "SELECT * FROM pessoas WHERE id = ?";
		String sql2 = "SELECT * FROM pessoas WHERE nome = ?";
		System.out.println(dao.selectOne(sql1, 3));
		System.out.println(dao.selectOne(sql2, "Maria"));
		
		dao.close();
	}
}
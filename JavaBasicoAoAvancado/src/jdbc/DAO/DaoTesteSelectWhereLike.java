package jdbc.DAO;

public class DaoTesteSelectWhereLike {
	public static void main(String[] args) {
		DataAcessObject dao = new DataAcessObject();
		
		String sql1 = "SELECT * FROM pessoas WHERE LOWER(nome) LIKE '%ano'";
		System.out.println("LIKE 1: " + dao.selectAll(sql1));
		
		String sql2 = "SELECT * FROM pessoas WHERE LOWER(nome) LIKE 'mar%'";
		System.out.println("\nLIKE 2: " + dao.selectAll(sql2));
		
		String sql3 = "SELECT * FROM pessoas WHERE LOWER(nome) LIKE '%e%'";
		System.out.println("\nLIKE 3: " + dao.selectAll(sql3));
		
		dao.close();
	}
}
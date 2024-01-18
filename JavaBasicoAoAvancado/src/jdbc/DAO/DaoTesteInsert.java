package jdbc.DAO;

public class DaoTesteInsert {
	public static void main(String[] args) {
		DataAcessObject dao = new DataAcessObject();
		
		String sql = "INSERT INTO pessoas (id, nome) VALUES(?, ?)"; 
		System.out.println(dao.insert(sql, 100, "Fulano"));
		System.out.println(dao.insert(sql, 101, "Ciclano"));
		System.out.println(dao.insert(sql, 102, "Beltrano"));
		
		dao.close();
	}
}
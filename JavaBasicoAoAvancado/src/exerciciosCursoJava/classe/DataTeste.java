package exerciciosCursoJava.classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data(19, 9, 2001);
		Data data2 = new Data();
		
		System.out.println(data1.dataString());
		System.out.println(data2.dataString());
	}
}

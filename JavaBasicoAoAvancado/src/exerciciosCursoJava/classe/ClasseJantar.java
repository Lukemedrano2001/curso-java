package exerciciosCursoJava.classe;

public class ClasseJantar {
	public static void main(String[] args) {
		ClassePessoa pessoa1 = new ClassePessoa("Guilherme", 95.5);
		ClasseComida comida1 = new ClasseComida("Arroz", 5.5);
		ClasseComida comida2 = new ClasseComida("Feijão", 10.5);
		
		System.out.println(pessoa1.pessoaString());
		System.out.println(comida1.comidaString());
		System.out.println(comida2.comidaString());
		
		System.out.println("");
		
		pessoa1.comer(comida1);
		System.out.println(pessoa1.pessoaString());
		
		pessoa1.comer(comida2);
		System.out.println(pessoa1.pessoaString());	
	}
}

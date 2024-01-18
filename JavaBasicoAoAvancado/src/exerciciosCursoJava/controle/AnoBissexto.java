package exerciciosCursoJava.controle;

public class AnoBissexto {
	public static void main(String[] args) {
		int ano = 2000;
		
		// Ano bissexto tem que ser divisivel por 4, não pode ser divisivel por 100 a menos que seja disivel por 400
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.printf("O ano %d é bissexto.", ano);
		}else {
			System.out.printf("O ano %d não é bissexto", ano);
		}
	}
}
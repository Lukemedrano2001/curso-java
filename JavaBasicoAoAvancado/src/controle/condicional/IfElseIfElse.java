package controle.condicional;

import java.util.Scanner;

public class IfElseIfElse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana:");
		String diaSemana = scanner.next().replace("Sa", "Sá").replace("Ca", "Ça").trim();
		
		
		if(diaSemana.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		}else if(diaSemana.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		}else if(diaSemana.equalsIgnoreCase("Terça")) {
			System.out.println(3);
		}else if(diaSemana.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		}else if(diaSemana.equalsIgnoreCase("Quinta")) {
			System.out.println(5);			
		}else if(diaSemana.equalsIgnoreCase("Sexta")) {
			System.out.println(6);						
		}else if(diaSemana.equalsIgnoreCase("Sábado")) {
			System.out.println(7);									
		}else {
			System.out.println("Dia da semana inválido.");
		}
		
		scanner.close();
	}
}

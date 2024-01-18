package lambda.forEach;

import java.util.Arrays;
import java.util.List;

public class Aprovados {
	static String imprimeConsole(String nome) {
		return String.format("Oi meu nome é: %s", nome);
	}
	
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		// ForEach Tradicional
		System.out.println("- Forma Tradicional - For:");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		// Usando Lambda Function
		System.out.println("\n- Lambda Function #01 - forEach:");
		aprovados.forEach((nome -> { System.out.println(nome);} ));
		
		// Usando Lambda Function
		System.out.println("\n- Lambda Function #02 - forEach:");
		aprovados.forEach((nome -> System.out.println(imprimeConsole(nome))));
		
		
		// Usando Method Reference
		System.out.println("\n- Method Reference #01 - forEach:");
		aprovados.forEach(System.out::println);
	}
}
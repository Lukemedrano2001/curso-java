package streamAPI.list;

import java.util.Arrays;
import java.util.List;

public class ImprimindoStrings {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Bia", "Lia", "Gui", "Lucas", "Ana");
		
		System.out.println("Usando o ForEach");
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando o For Tradicional:");
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
	}
}
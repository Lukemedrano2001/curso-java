package collections.hashEquals.treeSet;

import java.util.TreeSet;

public class TreeSetNomes {
	public static void main(String[] args) {
		// A ordem de inserção é feita com base do menor até o maior, serve para strings também, usando o Comparable
		
		TreeSet<String> nomes = new TreeSet<String>();
		
		nomes.add("Maria");
		nomes.add("Ana");
		nomes.add("Pedro");
		nomes.add("Gui");
		nomes.add("Rebecca");
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
	}
}
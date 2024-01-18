package collections.hashEquals.hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetHomogeneo {
	// (Generics) Você pode criar Sets com os tipos que quiser seja de tipos primitivos, Strings e até mesmo Sets com instancias de uma determinada classe que você mesmo criou e acaba instanciando
	
	public static void main(String[] args) {
		System.out.println("Set com ordenação");
		SortedSet<String> conjuntoNomes1 = new TreeSet<String>();
		conjuntoNomes1.add("Ana");
		conjuntoNomes1.add("Carlos");
		conjuntoNomes1.add("Luca");
		conjuntoNomes1.add("Pedro");
		
		System.out.println(conjuntoNomes1);
		
		for(String nome: conjuntoNomes1) {
			System.out.println(nome);
		}
		
		
		System.out.println("\nSet sem Ordenação");
		Set<String> conjuntoNomes2 = new HashSet<String>();	
		conjuntoNomes2.add("Ana");
		conjuntoNomes2.add("Carlos");
		conjuntoNomes2.add("Luca");
		conjuntoNomes2.add("Pedro");
		
		System.out.println(conjuntoNomes2);
		
		for(String nome: conjuntoNomes2) {
			System.out.println(nome);
		}
	}
}

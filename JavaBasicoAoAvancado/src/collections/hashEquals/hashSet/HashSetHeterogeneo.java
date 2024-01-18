package collections.hashEquals.hashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetHeterogeneo {
	// Quando queremos adicionar o tipo primitivo no set usando o add, ele converte o tipo primitivo para uma classe
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);	// double --> Double
		conjunto.add(1);	// int --> Integer
		conjunto.add('A');	// char --> Caractere
		conjunto.add(true);	// boolean --> Boolean
		conjunto.add("Texto");	// String, não precisa já é um objeto, é um array de char
		
		
		System.out.println("Tamanho do Conjunto: " + conjunto.size());
		
		System.out.println("Buscando e removendo o elemento: " + conjunto.remove("texto"));
		System.out.println("Buscando e removendo o elemento: " + conjunto.remove("Texto"));
		
		System.out.println("Tamanho do Conjunto: " + conjunto.size());
		
		System.out.println("Conjunto tem algum elemento?: " + conjunto.contains(1));
		
		
		Set numeros = new HashSet();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		
		System.out.println(conjunto);
		System.out.println(numeros);
		
		// União de Conjuntos
		// conjunto.addAll(numeros);
		// Intersecção de Conjuntos
		// conjunto.retainAll(numeros);
		// Diferença entre Conjuntos
		// conjunto.removeAll(numeros);
		
		System.out.println(conjunto);
	}
}

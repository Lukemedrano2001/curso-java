package collections.hashEquals.treeSet;

import java.util.TreeSet;

public class TreeSetNumeros {
	public static void main(String[] args) {
		// A ordem de inserção é feita com base do menor até o maior, usando o Comparable
		
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		
		numeros.add(123);
		numeros.add(10);
		numeros.add(50);
		numeros.add(-10);
		numeros.add(-50);
		numeros.add(1);
		numeros.add(19);
		numeros.add(27);
		numeros.add(75);
		
		for(Integer numero: numeros) {
			System.out.println(numero);
		}
 	}
}
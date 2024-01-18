package collections.hashEquals;

import java.util.HashSet;

import collections.Usuario;

public class HashCodeObjetos {
	// A complexidade do HashCode é O(1),
	// O HashCode separa os elementos que não são iguais e os elementos que podem ser iguais com base no HashCode
	// Depois de separar os possíveis elementos, você pode usar do Equals de maneira mais eficiente
	// Use no HashMap e HashSet
	
	public static void main(String[] args) {
		HashSet<Usuario> usuariosSet = new HashSet<Usuario>();
		
		usuariosSet.add(new Usuario("Pedro"));
		usuariosSet.add(new Usuario("Ana"));
		usuariosSet.add(new Usuario("Guilherme"));
		
		// Dependencia do hashCode da classe Usuario
		boolean resultado = usuariosSet.contains(new Usuario("Guilherme"));
		System.out.println("Resultado: " + resultado);
	}
}

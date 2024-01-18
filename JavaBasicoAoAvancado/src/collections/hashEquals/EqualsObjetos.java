package collections.hashEquals;

import classe.Usuario;

public class EqualsObjetos {
	// Equals é mais lento que o HashCode, sua complexidade é O(n)
	// Se o conjunto tiver 100.000, o Equals vai comparar um por um até retornar true ou false
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Pedro Silva", "pedro.silva@gmail.com");
		Usuario usuario2 = new Usuario("Pedro Silva", "pedro.silva@gmail.com");
		
		// Comparando endereços de memória entre os objetos
		System.out.println(usuario1 == usuario2);
		System.out.println(usuario1.equals(usuario2));
		
		
		// Comparando valores dos atributos entre os objetos e verificando se eles são iguais
		System.out.println(usuario1.equalsObjeto(usuario2));
	}
}

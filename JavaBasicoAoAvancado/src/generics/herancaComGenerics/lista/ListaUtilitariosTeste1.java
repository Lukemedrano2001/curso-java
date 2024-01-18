package generics.herancaComGenerics.lista;

import java.util.Arrays;
import java.util.List;

public class ListaUtilitariosTeste1 {
	public static void main(String[] args) {
		List<String> linguagens = Arrays.asList("Java", "Python", "JavaScript");
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		
		// Com Cast
		String ultimaLinguagem1 = (String) ListaUtilitarios.getUltimoLista1(linguagens);
		Integer ultimoNumero1 = (Integer) ListaUtilitarios.getUltimoLista1(numeros);
		
		// Sem Cast
		String ultimaLinguagem2 = ListaUtilitarios.getUltimoLista2(linguagens);
		Integer ultimoNumero2 = ListaUtilitarios.getUltimoLista2(numeros);
		
		// Tipo genérico para retorno sendo especificado
		String ultimaLinguagem3 = ListaUtilitarios.<String>getUltimoLista2(linguagens);
		Integer ultimoNumero3 = ListaUtilitarios.<Integer>getUltimoLista2(numeros);
		
		
		System.out.println("Metodo sem Generics, faz o cast:");
		System.out.println(ultimaLinguagem1);
		System.out.println(ultimoNumero1);
		
		System.out.println("\nMetodo com Generics, não faz o cast:");
		System.out.println(ultimaLinguagem2);
		System.out.println(ultimoNumero2);
		
		System.out.println("\nEspecificando o tipo de retorno, usando o Generics:");
		System.out.println(ultimaLinguagem3);
		System.out.println(ultimoNumero3);
		
	}
}
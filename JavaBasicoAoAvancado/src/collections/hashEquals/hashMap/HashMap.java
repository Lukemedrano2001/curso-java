package collections.hashEquals.hashMap;

import java.util.Map;
import java.util.Map.Entry;

public class HashMap {
	// Uma estrutura de dados que tem chave/valor
	// Não aceita repetição de chaves
	// Aceita repetição de valores com chaves distintas
	// Uma estrutura de dados dinâmica (Tamanho Dinâmico)
	// Pode se percorrer usando a chave ou usando valor ou até mesmo usando os dois
	
	public static void main(String[] args) {
		Map<Integer, String> mapaUsuarios = new java.util.HashMap<Integer, String>();
		
		
		// Inserção
		// Put: O método put pode adicionar ou atualizar
		
		mapaUsuarios.put(1, "Roberto");
		mapaUsuarios.put(2, "Ricardo");
		mapaUsuarios.put(3, "Rafaela");
		mapaUsuarios.put(4, "Rebecca");
		
		
		// Busca
		System.out.println("Busca:");
		System.out.println("- Busca usando chave: " + mapaUsuarios.containsKey(2));
		System.out.println("- Busca usando valor: " + mapaUsuarios.containsValue("Rebecca"));
		System.out.println("- Busca usando chave e retornando valor: " + mapaUsuarios.get(3));
		
		
		
		// Mostrando no console, os conjuntos chave, valor e chave-valor
		System.out.println("\nConjuntos:");
		System.out.println("- Conjunto das chaves: " + mapaUsuarios.keySet());
		System.out.println("- Conjunto dos valores: " + mapaUsuarios.values());
		System.out.println("- Pares chave-valor: " + mapaUsuarios.entrySet());
		
		
		// Iteração com chave
		System.out.println("\nIteração com chave:");
		for(int chave: mapaUsuarios.keySet()) {
			System.out.printf("- Chave: %d \n", chave);
		}
		
		
		// Iteração com valor
		System.out.println("\nIteração com valor:");
		for(String valor: mapaUsuarios.values()) {
			System.out.printf("- Valor: %s \n", valor);
		}
		
		
		// Iteração com chave-valor
		System.out.println("\nIteração com chave-valor:");
		for(Entry<Integer, String> usuario: mapaUsuarios.entrySet()) {
			int chave = usuario.getKey();
			String valor = usuario.getValue();
			System.out.printf("- Chave: %d | Valor: %s \n", chave, valor);
		}
		
		
		// Remoção
		System.out.println("\nRemoção:");
		System.out.println(mapaUsuarios.remove(1));
		System.out.println(mapaUsuarios.remove(3, "Rafaela"));
		
		
		// Iteração com chave-valor
		System.out.println("\nIteração com chave-valor:");
		for(Entry<Integer, String> usuario: mapaUsuarios.entrySet()) {
			int chave = usuario.getKey();
			String valor = usuario.getValue();
			System.out.printf("- Chave: %d | Valor: %s \n", chave, valor);
		}
		
		
		// Tamanho
		System.out.println("\nTamanho:");
		System.out.println("- Tamanho do HashMap: " + mapaUsuarios.size());
		
		
		// Limpa o hashMap
		mapaUsuarios.clear();
		
		
		// Retorna um boolean se o hashMap está vazio ou não
		System.out.println("\nHashMap vazio:");
		System.out.println("- HashMap vazio? " + mapaUsuarios.isEmpty());
	}
}

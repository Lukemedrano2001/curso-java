package collections.deque;

import java.util.ArrayDeque;

public class DoubleEndedQueue {
	// Permite inserção e remoção tanto no inicio quanto no final do Deque
	// Inicio: Se comporta como uma pilha
	// Final: Se comporta como uma fila
	
	public static void main(String[] args) {
		ArrayDeque<String> dequeNavios = new ArrayDeque<String>();
		
		// Inserção
		
		// Adicionando navios no final - Fila
		dequeNavios.addLast("Navio A");
		dequeNavios.addLast("Navio B");
		dequeNavios.addLast("Navio C");
		
		// Adicionando navios no começo - Pilha
		dequeNavios.addFirst("Navio D");
		dequeNavios.addFirst("Navio E");
		dequeNavios.addFirst("Navio F");
		
		
		// Mostrando tudo no console
		System.out.println("Deque Completo:");
		for(String navio: dequeNavios) {
			System.out.println(navio);
		}
		
		
		// Busca
		System.out.println("\nBusca:");
		System.out.println("- Tem esse elemento? " + dequeNavios.contains("Navio C"));
		System.out.println("- Get First: " + dequeNavios.getFirst());
		System.out.println("- Get Last: " + dequeNavios.getLast());
		
		
		// Remoção
		System.out.println("\nRemoção:");
		System.out.println("- Peek First: " + dequeNavios.peekFirst());
		System.out.println("- Peek Last: " + dequeNavios.peekLast());
		System.out.println("- Element: " + dequeNavios.element());
		System.out.println("- Pool First: " + dequeNavios.pollFirst());
		System.out.println("- Pool Last: " + dequeNavios.pollLast());
		System.out.println("- Remove First: " + dequeNavios.removeFirst());
		System.out.println("- Remove Last: " + dequeNavios.removeLast());
		
		
		// Mostrando tudo no console
		System.out.println("\nDeque Completo:");
		for(String navio: dequeNavios) {
			System.out.println(navio);
		}
		
		
		// Tamanho da deque
		System.out.println("\nTamanho:");
		System.out.println("- Tamanho da fila: " + dequeNavios.size());
			
				
		// Limpa o deque
		dequeNavios.clear();
				
				
		// Retorna um boolean se o deque está vazio ou não
		System.out.println("\nDeque vazio:");
		System.out.println("- Deque vazio? " + dequeNavios.isEmpty());
	}
}

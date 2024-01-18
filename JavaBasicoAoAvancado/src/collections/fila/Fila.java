package collections.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	// First In First Out (FIFO)
	// Os dados são tratados na ordem em que são inseridos, ou seja, uma fila de banco
	// Uma estrutura de dados dinâmica (Tamanho Dinâmico)
	
	public static void main(String[] args) {
		Queue<String> filaBanco = new LinkedList<String>();
		
		// Offer e Add: Adicionam elementos na fila
		// add: Lança uma exceção caso a fila esteja cheia, lança a execeção de overflow
		// offer: Retorna false caso a fila esteja cheia

		// Inserção --> Sempre no final
		filaBanco.add("Ana");		
		filaBanco.offer("Carlos");
		filaBanco.offer("Bia");
		filaBanco.offer("Daniel");
		filaBanco.offer("Rafaela");
		filaBanco.offer("Gui");
		
		
		// Mostrando tudo no console
		System.out.println("Fila completa:");
		for(String cliente: filaBanco) {
			System.out.println(cliente);
		}
		
		
		// Busca
		System.out.println("\nBusca:");
		System.out.println("- Tem esse elemento? " + filaBanco.contains("Ana"));
		
		
		// Peek e Element: Obtem o próximo elemento da fila (Não removem)
		// Pool e Remove: Remove o próximo elemento da fila
		// peek: Retorna null caso a fila esteja vazia
		// element: Lança uma exceção caso a fila esteja vazia, lança a exceção de underflow
		// pool: Retorna null caso a fila esteja vazia
		// remove: Lança uma exceção caso a fila esteja vazia, lança a exceção de underflow
		
		// Remoção --> Sempre no começo
		System.out.println("\nRemoção:");
		System.out.println("- Peek: " + filaBanco.peek());
		System.out.println("- Element: " + filaBanco.element());
		System.out.println("- Pool: " + filaBanco.poll());
		System.out.println("- Remove: " + filaBanco.remove());
		
		
		// Mostrando tudo no console
		System.out.println("\nFila completa:");
		for(String cliente: filaBanco) {
			System.out.println(cliente);
		}
		
		
		// Tamanho da fila
		System.out.println("\nTamanho:");
		System.out.println("- Tamanho da fila: " + filaBanco.size());
		
		
		// Limpa a fila
		filaBanco.clear();
		
		
		// Retorna um boolean se a fila está vazia ou não
		System.out.println("\nFila vazia:");
		System.out.println("- Fila vazia? " + filaBanco.isEmpty());
	}
}

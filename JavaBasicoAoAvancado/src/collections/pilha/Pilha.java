package collections.pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	// Last In First Out (LIFO)
	// Os dados são tratados na ordem inversa que foram inseridos, ou seja, uma pilha de caixas
	// Uma estrutura de dados dinâmica (Tamanho Dinâmico)
	
	public static void main(String[] args) {
		Deque<String> pilhaLivros = new ArrayDeque<String>();
		
		// Add e Push: Adicionam elementos na pilha
		// add: Retorna false caso a pilha esteja cheia
		// push: Lança uma exceção caso a pilha esteja cheia, lança a execeção de overflow
		
		// Inserção
		pilhaLivros.add("O senhor dos anéis");
		pilhaLivros.push("Game of Thornes");
		pilhaLivros.push("Harry Potter");
		pilhaLivros.push("Star Wars");
		pilhaLivros.push("Percy Jackson");
		
		
		// Mostrando tudo no console
		System.out.println("Pilha completa:");
		for(String livro: pilhaLivros) {
			System.out.println(livro);
		}
		
		
		// Busca
		System.out.println("\nBusca:");
		System.out.println("Tem esse elemento? " + pilhaLivros.contains("O Hobbit"));
		
				
		// Peek e Element: Obtem o próximo elemento da pilha (Não removem)
		// Pool, Remove e Pop: Remove o próximo elemento da pilha
		// peek: Retorna null caso a pilha esteja vazia
		// element: Lança uma exceção caso a pilha esteja vazia, lança a exceção de underflow
		// pool: Retorna null caso a pilha esteja vazia
		// remove e pop: Lança uma exceção caso a pilha esteja vazia, lança a exceção de underflow
		
		// Remoção --> Sempre no começo
		System.out.println("\nRemoção:");
		System.out.println("Peek: " + pilhaLivros.peek());
		System.out.println("Element: " + pilhaLivros.element());
		System.out.println("Pool: " + pilhaLivros.poll());
		System.out.println("Remove: " + pilhaLivros.remove());
		System.out.println("Pop: " + pilhaLivros.pop());
		
		
		// Mostrando tudo no console
		System.out.println("\nPilha completa:");
		for(String livro: pilhaLivros) {
			System.out.println(livro);
		}
		
		
		// Tamanho da pilha
		System.out.println("\nTamanho:");
		System.out.println("Tamanho da Pilha: " + pilhaLivros.size());
				
		
		// Limpa a pilha
		pilhaLivros.clear();
				
		
		// Retorna um boolean se a pilha está vazia ou não
		System.out.println("\nPilha vazia:");
		System.out.println("Pilha vazia? " + pilhaLivros.isEmpty());
	}
}
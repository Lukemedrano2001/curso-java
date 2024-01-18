package collections.listas;

import java.util.ArrayList;

import collections.Usuario;

public class ListaHomogenea {
	public static void main(String[] args) {
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		Usuario usuario1 = new Usuario("Ana");
		Usuario usuario2 = new Usuario("Carlos");
		Usuario usuario3 = new Usuario("Lia");
		Usuario usuario4 = new Usuario("Bia");
		Usuario usuario5 = new Usuario("Manu");
		Usuario usuario6 = new Usuario("Manu");
		
		
		// Inserção
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
		listaUsuarios.add(usuario3);
		listaUsuarios.add(usuario4);
		listaUsuarios.add(usuario5);
		listaUsuarios.add(usuario6);
		
		
		// Mostrando tudo no console
		System.out.println("Lista de Usuários:");
		for(Usuario usuario: listaUsuarios) {
			System.out.println(usuario.toString());
		}
		
		
		// Busca com base no indice e por objeto usando HashCode e Equals
		System.out.println("\nBusca:");
		String nomeBuscado = listaUsuarios.get(3).nome;
		System.out.printf("Busca de um elemento na lista, usando o indice: %s \n", nomeBuscado);
		// Objeto é criado para que possa ser comparado com algum objeto que haja na lista, caso haja algum objeto, retorna true
		System.out.println("Tem esse elemento? " + listaUsuarios.contains(new Usuario("Lia")));
		System.out.println("Tem esse elemento? " + listaUsuarios.contains(usuario1));
		
		
		// Remoção pelo Indice e por objeto usando HashCode e Equals
		System.out.println("\nRemoção:");
		System.out.println("Removendo o elemento, usando o indice: " + listaUsuarios.remove(2));
		// Objeto é criado para que possa ser comparado com algum objeto que haja na lista, caso haja algum objeto, ele remove
		System.out.println("Removeu o elemento? " + listaUsuarios.remove(new Usuario("Manu")));
		System.out.println("Removeu o elemento? " + listaUsuarios.remove(usuario2));
		
		
		// Mostrando tudo no console
		System.out.println("\nLista de Usuários:");
		for(Usuario usuario: listaUsuarios) {
			System.out.println(usuario.toString());
		}
	}
}
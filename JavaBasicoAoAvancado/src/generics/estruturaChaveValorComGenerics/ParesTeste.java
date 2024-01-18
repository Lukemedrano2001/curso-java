package generics.estruturaChaveValorComGenerics;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> aprovados = new Pares<Integer, String>();
		
		aprovados.adicionar(1, "Maria");
		aprovados.adicionar(2, "Pedro");
		aprovados.adicionar(3, "Lia");
		aprovados.adicionar(4, "Ana");
		aprovados.adicionar(5, "Ana");
		
		System.out.println("Valores:\n" + aprovados.toString());
		
		aprovados.adicionar(1, "Fulano");
		aprovados.adicionar(2, "Ciclano");
		aprovados.adicionar(3, "Beltrano");
		aprovados.adicionar(4, "Arroxano");
		aprovados.adicionar(5, "Arroxano");
		
		System.out.println("\nValores atualizados:\n" + aprovados.toString());
	}
}
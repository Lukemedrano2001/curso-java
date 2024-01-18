package generics.comparable;

public class ParesTeste {
	public static void main(String[] args) {
		Pares<Integer, String> aprovados = new Pares<Integer, String>();
		
		aprovados.adicionar(5, "Maria");
		aprovados.adicionar(4, "Pedro");
		aprovados.adicionar(3, "Lia");
		aprovados.adicionar(2, "Ana");
		aprovados.adicionar(1, "Ana");
		
		System.out.println("Valores:\n" + aprovados.toString());
		
		aprovados.adicionar(5, "Fulano");
		aprovados.adicionar(4, "Ciclano");
		aprovados.adicionar(3, "Beltrano");
		
		System.out.println("\nValores atualizados:\n" + aprovados.toString());
	}
}
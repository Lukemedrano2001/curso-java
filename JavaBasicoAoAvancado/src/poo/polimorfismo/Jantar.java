package poo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Roberto", 55);
		Comida comida1 = new Comida("Qualquer", 5);
		Comida comida2 = new Arroz("Arroz", 10, "Integral");
		Comida comida3 = new Feijao("Feijão", 15, "Carioca");
		Comida comida4 = new Sorvete("Sorvete", 20, "Morango");
		
		// Pessoa
		System.out.println("Peso Atual da Pessoa:");
		System.out.println(pessoa1.toString());
		
		// Pessoa comendo as comidas
		pessoa1.comer(comida2);
		pessoa1.comer(comida3);
		pessoa1.comer(comida4);
		
		// Pessoa
		System.out.println("\nPeso da Pessoa após comer as comidas:");		
		System.out.println(pessoa1.toString());
		
		// Comidas
		System.out.println("\nPeso das Comidas:");
		System.out.println(comida1.toString());
		System.out.println(comida2.toString());
		System.out.println(comida3.toString());
		System.out.println(comida4.toString());
	}
}
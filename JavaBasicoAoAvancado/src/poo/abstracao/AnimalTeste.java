package poo.abstracao;

public class AnimalTeste {
	public static void main(String[] args) {
		Animal gato1 = new Gato("Mingau", 5);
		Animal cachorro1 = new Cachorro("Rex", 10);
		// Animal animal1 = new Animal("Animal", 15);
		
		System.out.println(gato1.toString());
		System.out.println(cachorro1.toString());
		
		gato1.comer(5);
		cachorro1.comer(10);
		
		System.out.println(gato1.toString());
		System.out.println(cachorro1.toString());
	}
}

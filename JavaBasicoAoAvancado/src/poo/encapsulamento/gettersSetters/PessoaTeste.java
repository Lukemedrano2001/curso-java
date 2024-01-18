package poo.encapsulamento.gettersSetters;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Carlos", 30);
		Pessoa pessoa2 = new Pessoa("Pedro", -5);
		Pessoa pessoa3 = new Pessoa("Roberto", 130);
		
		// Alterando o valor de um atributo public 
		// pessoa1.idade = -30;
		// pessoa2.idade = 40;
		System.out.println("Idade Inicial:");
		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
		System.out.println(pessoa3.toString());
		

		// Idade maior que 0
		pessoa1.setIdade(40);
		pessoa2.setIdade(50);
		pessoa3.setIdade(90);
		pessoa1.setNome("Maria");
		pessoa2.setNome("Pedro");
		System.out.println("\nAlterando idades maiores que 0:");
		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
		System.out.println(pessoa3.toString());
		
		
		// Idade menor que 0
		pessoa1.setIdade(-20);
		pessoa2.setIdade(-30);	
		pessoa3.setIdade(-40);
		System.out.println("\nAlterando idades menores que 0:");
		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
		System.out.println(pessoa3.toString());
		
	}
}

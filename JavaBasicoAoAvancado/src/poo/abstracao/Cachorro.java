package poo.abstracao;

public class Cachorro extends Animal {
	Cachorro(String nome, double peso){
		super(nome, peso);
	}
	
	@Override
	public String fazerBarulho() {
		return "Woof Woof!!";
	}
}
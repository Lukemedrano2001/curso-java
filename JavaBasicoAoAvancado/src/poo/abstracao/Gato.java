package poo.abstracao;

public class Gato extends Animal{
	Gato(String nome, double peso){
		super(nome, peso);
	}
	
	@Override
	public String fazerBarulho() {
		return "Miau Miau!!";
	}
}
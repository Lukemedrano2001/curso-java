package poo.composicaoAndRelacionamentos.carro;

public class Motor {
	// Composição, Bidirecional (One to One): Um motor tem um carro
	
	String nome;
	final Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;
	
	Motor(String nome, Carro carro){
		this.nome = nome;
		this.carro = carro;
	}
	
	@Override
	public String toString() {
		return String.format("%s", this.nome);
	}
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) (fatorInjecao * 3000);			
		}
	}
}

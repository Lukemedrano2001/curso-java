package poo.composicaoAndRelacionamentos.carro;

public class Porta {
	// Composição, Bidirecional (One to Many): As portas tem um carro
	
	boolean aberto = false;
	Carro carro;
	
	Porta(Carro carro){
		this.carro = carro;
	}
	
	// Abre uma porta do carro
	void abrirPorta() {
		this.aberto = true;
	}
		
	// Fecha as portas do carro
	void fecharPorta() {
		this.aberto = false;
	}
}

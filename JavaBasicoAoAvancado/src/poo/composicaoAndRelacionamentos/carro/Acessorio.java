package poo.composicaoAndRelacionamentos.carro;

import java.util.ArrayList;

public class Acessorio {
	String nome;
	ArrayList<Carro> carros = new ArrayList<Carro>();
	
	Acessorio(String nome){
		this.nome = nome;
	}
	
	public void adicionaCarro(Carro carro) {
		this.carros.add(carro);
	}
	
	public String toString() {
		return String.format("%s", this.nome);
	}
}
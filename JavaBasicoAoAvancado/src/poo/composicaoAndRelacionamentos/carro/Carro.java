package poo.composicaoAndRelacionamentos.carro;

import java.util.ArrayList;
import java.util.List;

public class Carro {
	// Composição, Bidirecional (One to One): Um carro tem um motor, Um motor tem um carro
	// Composição, Bidirecional (Many to Many): Um carro tem muitos acessórios, Os acessórios pertencem a muitos carros
	// Composição, Bidirecional (One to Many): Um carro tem muitas portas, As portas pertencem a um carro
	
	final Motor motor;
	ArrayList<Acessorio> acessorios;
	ArrayList<Porta> portas = new ArrayList<Porta>();
	
	Carro(String nomeMotor){
		this.motor = new Motor(nomeMotor, this);
		this.acessorios = new ArrayList<Acessorio>();
		for(int i = 0; i < 4; i++) {
			this.portas.add(new Porta(this));
		}
	}
	
	@Override
	public String toString() {
		return String.format("| Motor: %s | Acessórios: %s | Portas: %d", this.motor, this.listarAcessorios(), this.portas.size());
	}
	
	public List<String> listarAcessorios() {
		List<String> acessorios = new ArrayList<String>();
		for(Acessorio acessorio: this.acessorios) {
			acessorios.add(acessorio.nome);
		}
		
		return acessorios;
	}
	
	public void adicionaAcessorio(Acessorio acessorio) {
		this.acessorios.add(acessorio);
		acessorio.adicionaCarro(this);
	}
	
	// Carro precisa estar ligado, e precisa estar com as portas fechadas antes de acelerar
	public int acelerar() {
		boolean resultadoLigado = this.carroEstaLigado();
		boolean resultadoAberta = this.portaEstaAberta();
		
		if(resultadoLigado == true && resultadoAberta == false) {
			return (int) (motor.fatorInjecao += 1);
		}else {
			return 0;
		}
	}
	
	// Carro precisa estar ligado, e precisa estar com as portas fechadas antes de frear
	public int frear() {
		boolean resultadoLigado = this.carroEstaLigado();
		boolean resultadoAberta = this.portaEstaAberta();
		
		if(resultadoLigado == true && resultadoAberta == false) {
			return (int) (motor.fatorInjecao -= 1);			
		}else {
			return 0;
		}
	}
	
	// Liga o carro caso esteja desligado
	public void ligar() {
		boolean resultado = this.carroEstaLigado();
		
		if(resultado == false) {
			motor.ligado = true;			
		}
	}
	
	// Desliga o carro caso esteja ligado
	public void desligar() {
		boolean resultado = this.carroEstaLigado();
		
		if(resultado == true) {
			motor.ligado = false;
		}
	}
	
	// False -> Carro desligado
	// True -> Carro ligado
	public boolean carroEstaLigado() {
		return motor.ligado;
	}
	
	// False -> Porta fechada
	// True -> Porta aberta
	public boolean portaEstaAberta() {
		for(Porta porta: portas) {
			if(porta.aberto) {
				return true;
			}
		}
		
		return false;
	}
	
	public int numeroPortas() {
		return portas.size();
	}
}
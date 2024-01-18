package poo.composicaoAndRelacionamentos.carro;

public class CarroTeste {
	public static void main(String[] args) {
		Carro carro1 = new Carro("V8");
		Carro carro2 = new Carro("V4");
		Acessorio acessorio1 = new Acessorio("Ar condicionado");
		Acessorio acessorio2 = new Acessorio("TV portátil");
		Acessorio acessorio3 = new Acessorio("Air-Bag");
		Acessorio acessorio4 = new Acessorio("Extintor");
		
		System.out.println("Estado do carro1:");
		System.out.println("- Carro1 Ligado? " + carro1.carroEstaLigado());	
		
		// Ligando o carro
		carro1.ligar();
		System.out.println("- Carro1 Ligado? " + carro1.carroEstaLigado());
		
		
		// Portas
		System.out.println("\nPortas do carro1:");
		
		// Abrindo a primeira porta do carro
		carro1.portas.get(0).abrirPorta();
		System.out.println("- Carro1 está com uma das portas abertas? " + carro1.portaEstaAberta());
		
		// Fechando a primeira porta do carro
		carro1.portas.get(0).fecharPorta();
		System.out.println("- Carro1 está com uma das portas abertas? " + carro1.portaEstaAberta());
		
		
		// Quantidade de giros do motor
		System.out.println("\nGiros:");
		System.out.println("- Giros antes de acelerar e frear: " + carro1.motor.giros());
		
		// Acelerar
		carro1.acelerar();
		System.out.println("- Giros após acelerar: " + carro1.motor.giros());
		
		// Frear
		carro1.frear();
		System.out.println("- Giros após frear: " + carro1.motor.giros());
		
		
		// Desligando o carro
		carro1.desligar();
		System.out.println("\nEstado do carro:");
		System.out.println("- Carro1 Ligado? " + carro1.carroEstaLigado());
		
		
		// Adição de acessórios nos carros
		
		// Acessórios carro1
		carro1.adicionaAcessorio(acessorio1);
		carro1.adicionaAcessorio(acessorio2);
		carro1.adicionaAcessorio(acessorio3);
		carro1.adicionaAcessorio(acessorio4);
		
		// Acessórios carro2
		carro2.adicionaAcessorio(acessorio1);
		carro2.adicionaAcessorio(acessorio2);
		carro2.adicionaAcessorio(acessorio3);
		
		// Todas as caraterísticas de cada carro
		System.out.println("\nCarros:");
		System.out.println("- Carro1: " + carro1.toString());
		System.out.println("- Carro2: " + carro2.toString());
	}
}
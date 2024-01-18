package poo.heranca.jogo;

public class JogadorAcoes {
	public static void moveImprime(Jogador heroi, Jogador monstro, Direcao direcao) {
		heroi.andar(direcao);
		monstro.andar(direcao);
		
		System.out.println("Movimento:");
		System.out.println(heroi.toString());
		System.out.println(monstro.toString());
	}
	
	public static void atacaImprime(Jogador heroi, Jogador monstro) {
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Ataque:");
		System.out.println(heroi.toString());
		System.out.println(monstro.toString());
	}
	
	public static void moveAleatoriamente(Jogador heroi, Jogador monstro) {
		heroi.andaAleatoriamente();
		monstro.andaAleatoriamente();
		
		System.out.println("Movimento Aleatório:");
		System.out.println(heroi.toString());
		System.out.println(monstro.toString());
	}
}
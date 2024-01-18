package poo.heranca.jogo;

public class Monstro extends Jogador {
	// Construtor chamando o Construtor da SuperClasse
	public Monstro(int x, int y) {
		super(x, y);
	}

	// O ataque do monstro é mais fraco
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
	
	@Override
	public String toString() {
		return String.format("X = %d | Y = %d | Vida do Monstro: %d \n", this.x, this.y, this.vida);
	}
}
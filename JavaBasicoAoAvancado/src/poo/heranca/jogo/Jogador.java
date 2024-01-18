package poo.heranca.jogo;

import java.util.Random;

public class Jogador {
	public int vida = 100;
	public int x;
	public int y;
	
	protected Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Pode receber Heroi ou Monstro
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		// Verifica se um jogador ou um oponente tem 0 vida
		if(this.vida <= 0 || oponente.vida <= 0) {
			return false;
		}
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 5;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 5;
			return true;
		}
		
		return false;
	}
	
	// Pode receber Heroi ou Monstro
	public boolean andar(Direcao direcao) {
		if(direcao == Direcao.NORTE) {
			y++;
		}else if(direcao == Direcao.LESTE) {
			x++;
		}else if(direcao == Direcao.SUL) {
			y--;
		}else if(direcao == Direcao.OESTE) {
			x--;
		}
		
		return true;
	}
	
	public boolean andaAleatoriamente() {
		Random random = new Random();

        int numeroPassos = random.nextInt(1) + 1;

        for (int i = 0; i < numeroPassos; i++) {
            // Direção aleatória
            Direcao direcao = Direcao.values()[random.nextInt(Direcao.values().length)];
            andar(direcao);
        }
        
        return true;
	}
}
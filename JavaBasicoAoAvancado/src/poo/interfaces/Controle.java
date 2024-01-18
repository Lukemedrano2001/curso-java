package poo.interfaces;

public class Controle implements ControleInterface {
	private TV dispositivo;
	
	Controle(TV dispositivo){
		this.setDispositivo(dispositivo);
	}
	
	// Getter
	public TV getDispostivo() {
		return this.dispositivo;
	}
	
	// Setter
	public void setDispositivo(TV dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	// Liga a TV, caso ela esteja desligada
	@Override
	public void ligar() {
		boolean estadoTV = this.dispositivo.getLigado();
		if(!estadoTV) {
			this.dispositivo.setLigado(true);
		}
	}
	
	// Desliga a TV, caso ela esteja ligada
	@Override
	public void desligar() {
		boolean estadoTV = this.dispositivo.getLigado();
		if(estadoTV) {
			this.dispositivo.setLigado(false);
		}
	}
	
	// Aumenta o volume da TV, caso ela esteja ligada
	@Override
	public void aumentaVolume() {
		boolean estadoTV = this.dispositivo.getLigado();
		if(estadoTV) {
			int novoVolume = this.dispositivo.getVolume() + 10;
			this.dispositivo.setVolume(novoVolume);
		}
	}
	
	// Aumenta o volume da TV, caso ela esteja ligada
	@Override
	public void diminuiVolume() {
		boolean estadoTV = this.dispositivo.getLigado();
		if(estadoTV) {
			int novoVolume = this.dispositivo.getVolume() - 10;
			this.dispositivo.setVolume(novoVolume);
		}
	}
}
package poo.interfaces;

public class TV {
	private boolean ligado;
	private int volume;
	
	TV(boolean ligado, int volume){
		this.setLigado(ligado);
		this.setVolume(volume);
	}
	
	public boolean getLigado() {
		return this.ligado;
	}
	
	public void setLigado(boolean estado) {
		this.ligado = estado;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	@Override
	public String toString() {
		return String.format("TV ligada? %b | Volume: %d", this.getLigado(), this.getVolume());
	}
}
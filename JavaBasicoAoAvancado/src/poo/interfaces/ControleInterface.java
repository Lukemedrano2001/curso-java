package poo.interfaces;

public interface ControleInterface {
	// Pode se ter uma implementação padrão de interface
	
	public void ligar();
	public void desligar();
	public void aumentaVolume();
	public void diminuiVolume();
	public void setDispositivo(TV dispositivo);
}
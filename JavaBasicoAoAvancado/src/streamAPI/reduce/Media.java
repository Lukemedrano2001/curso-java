package streamAPI.reduce;

public class Media {
	private double total;
	private int quantidade;
	
	public Media adiciona(double valor) {
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getValor() {
		return total / quantidade;
	}
	
	public static Media combinaMedia(Media media1, Media media2) {
		Media resultado = new Media();
		resultado.total = media1.total + media2.total;
		resultado.quantidade = media1.quantidade + media2.quantidade;
		
		return resultado;
	}
}
package classe.areaCirculo;

public class AreaCirculo {
	double raio;
	static final double PI = 3.14;	// Atributo é estático e pertence somente a classe
	
	AreaCirculo(double raio){
		this.raio = raio;
	}
	
	double calculaArea() {
		double area =  AreaCirculo.PI * Math.pow(raio, 2);
		return area;
	}
	
	double calculaPerimetro() {
		double perimetro = 2 * AreaCirculo.PI * this.raio;
		return perimetro;
	}
	
	String obtemInformacoesCirculo() {
		double areaCirculo = this.calculaArea();
		double perimetroCirculo = this.calculaPerimetro();
		return String.format("Raio: %.2f | Área: %.2f | Perímetro: %.2f", this.raio, areaCirculo, perimetroCirculo);
	}
}
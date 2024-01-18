package poo.estatico;

public class ContaBancaria {
	static double taxaJuros = 0.15;
	
	public static String calculaJuros(double capital) {
		double juros = capital * (1 - ContaBancaria.taxaJuros);
		double montante = juros + capital;
		return String.format("Capital: %.2f | Juros: %.2f | Montante: %.2f", capital, juros, montante);
	}
}
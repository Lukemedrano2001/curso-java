package generics.metodosComGenerics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		// Vai dar erro, pois tem uma restrição que a classe CaixaNumeros só aceita números
		//CaixaNumeros<String> caixa1 = new CaixaNumeros<String>(null);
		
		CaixaNumeros<Double> caixa1 = new CaixaNumeros<Double>(3.1415);	// Double extends Number
		CaixaNumeros<Integer> caixa2 = new CaixaNumeros<Integer>(1);	// Integer extends Number
		
		Double coisa1 = caixa1.abrirCaixa();
		Integer coisa2 = caixa2.abrirCaixa();
		
		System.out.println(coisa1);
		System.out.println(coisa2);
	}
}
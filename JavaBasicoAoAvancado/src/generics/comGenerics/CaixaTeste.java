package generics.comGenerics;

public class CaixaTeste {
	public static void main(String[] args) {
		// Criando uma instância da classe Caixa com tipo genérico String
		Caixa<String> caixa1 = new Caixa<String>("Segredo!");
		
		// Criando uma instância da classe Caixa com tipo genérico Double
		Caixa<Double> caixa2 = new Caixa<Double>(3.1415);
		
		// Criando uma instância da classe Caixa com tipo genérico Integer
		Caixa<Integer> caixa3 = new Caixa<Integer>(1);
		
		String coisa1 = caixa1.abrirCaixa();
		Double coisa2 = caixa2.abrirCaixa();
		Integer coisa3 = caixa3.abrirCaixa();
		
		System.out.println(coisa1);
		System.out.println(coisa2);
		System.out.println(coisa3);
	}
}
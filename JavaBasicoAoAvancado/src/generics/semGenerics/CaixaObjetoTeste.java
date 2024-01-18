package generics.semGenerics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		// Erro de compilação: String para Double ou Double para Integer ou Integer para String, e vice-versa
		
		CaixaObjeto caixa1 = new CaixaObjeto("Segredo!");
		CaixaObjeto caixa2 = new CaixaObjeto(3.1415);	// Pode: double -> Double
		CaixaObjeto caixa3 = new CaixaObjeto(1);	// Pode: int -> Integer
		
		String coisa1 = (String) caixa1.abrirCaixa();	// Pode: String -> String
		Double coisa2 = (Double) caixa2.abrirCaixa();	// Pode: Double -> Double, e pode Double -> double
		Integer coisa3 = (Integer) caixa3.abrirCaixa();	// Pode: String -> String, e pode Integer -> int
		
		System.out.println(coisa1);
		System.out.println(coisa2);
		System.out.println(coisa3);
	}
}
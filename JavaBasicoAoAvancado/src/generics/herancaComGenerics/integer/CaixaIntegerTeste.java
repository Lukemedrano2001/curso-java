package generics.herancaComGenerics.integer;

public class CaixaIntegerTeste {
	public static void main(String[] args) {
		CaixaInteger caixa1 = new CaixaInteger(1);
		Integer coisa1 = caixa1.abrirCaixa();
		System.out.println(coisa1);
	}
}
package generics.herancaComGenerics.doubles;

public class CaixaDoubleTeste {
	public static void main(String[] args) {
		CaixaDouble caixa1 = new CaixaDouble(3.1415);
		Double coisa1 = caixa1.abrirCaixa();
		System.out.println(coisa1);
	}
}
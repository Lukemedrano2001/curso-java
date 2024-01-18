package generics.herancaComGenerics.strings;

public class CaixaStringTeste {
	public static void main(String[] args) {
		CaixaString caixa1 = new CaixaString("Segredo!");
		String coisa1 = caixa1.abrirCaixa();
		System.out.println(coisa1);
	}
}
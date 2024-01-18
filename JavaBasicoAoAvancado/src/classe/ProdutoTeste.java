
package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Macarrão", 15.99, 0.25);
		Produto produto2 = new Produto();
		
		System.out.println(produto1.produtoString());
		System.out.println(produto2.produtoString());
		
		System.out.println("");
		
		System.out.println(produto1.precoFinal());
		System.out.println(produto2.precoFinal());
	}
} 
package lambda.predicado;

public class Produto {
	public final String nome;
	public final double preco;
	public final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s | Preço: %.2f | Desconto: %.2f", this.nome, this.preco, this.desconto);
	}
}
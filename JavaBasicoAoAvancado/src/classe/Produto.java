package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		this.nome = "Produto Padrão";
		this.preco = 1.99;
		this.desconto = 0.25;
	}
	
	Produto(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String produtoString() {
		return String.format("Nome: %s | Preço: %.2f | Desconto: %.2f", this.nome, this.preco, this.desconto);
	}
	
	public String precoFinal() {
		double precoFinal = this.preco * (1 - this.desconto);
		return String.format("Nome: %s | Preço final: %.2f", this.nome, precoFinal);
	}
}
package br.com.lukemedrano.teste.exercicioSB.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "produtos")
public class Produto {
	// Validações simples, use da API de validação do Spring
	// Validações complexas, você precisa implementar a lógica de validação nos métodos setters e em outros métodos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank	// NotBlank, o valor não pode ser vazio
	private String nome;
	
	@Min(0)
	private double preco;
	
	@Min(0)
	@Max(1)
	private double desconto;
	
	public Produto() {}
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.setPreco(preco);
		this.setDesconto(desconto);
	}

	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;			
	}

	public double getDesconto() {
		return this.desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;			
	}
}
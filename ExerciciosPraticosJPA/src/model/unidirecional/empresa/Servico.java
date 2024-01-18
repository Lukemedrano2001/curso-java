package model.unidirecional.empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "servicos")
public class Servico {
	@Id
	private UUID id;
	private String descricao;
	private double preco;
	
	@ManyToMany(mappedBy = "servicos")
    private List<Cliente> clientes = new ArrayList<Cliente>();

    @ManyToMany(mappedBy = "servicos")
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Servico() {}
	
	public Servico(String descricao, double preco) {
		this.id = UUID.randomUUID();
		this.descricao = descricao;
		this.preco = preco;
	}

	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void adicionaCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public void adicionaFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null || getClass() != objeto.getClass())
			return false;
		Servico servico = (Servico) objeto;
		return Objects.equals(id, servico.id);
	}
	
	@Override
	public String toString() {
		String id = "Id: " + this.getId();
		String descricao = "Descrição: " +  this.getDescricao();
		String preco = "Preço: " + this.getPreco();
		
		return String.format("%s | %s | %s", id, descricao, preco);
	}
}
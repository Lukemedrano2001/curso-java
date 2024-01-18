package model.unidirecional.empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario extends Pessoa {
	private String cargo;
	private String departamento;
	
	@Column(precision = 11, scale = 2)
	private double salario;
	
	@OneToMany(mappedBy = "funcionario", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Telefone> telefones = new ArrayList<Telefone>();
	
	@ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "funcionarios_servicos",
        joinColumns = @JoinColumn(name = "funcionario_id"),
        inverseJoinColumns = @JoinColumn(name = "servico_id")
    )
	private List<Servico> servicos = new ArrayList<Servico>();
	
	public Funcionario() {}
	
	public Funcionario(String nome, String email, String senha, String cargo, String departamento, double salario) {
		super(nome, email, senha);
		this.cargo = cargo;
		this.departamento = departamento;
		this.salario = salario;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	public List<Telefone> getTelefones() {
		return this.telefones;
	}

	public void adicionaTelefone(Telefone telefone) {
		if(!this.telefones.contains(telefone)) {
			this.telefones.add(telefone);
			telefone.setFuncionario(this);
		}else {
			return;
		}
	}
	
	public List<Servico> getServicos() {
		return this.servicos;
	}

	public void adicionaServico(Servico servico) {
		if(!this.servicos.contains(servico)) {
			this.servicos.add(servico);
			servico.adicionaFuncionario(this);
		}else {
			return;
		}
	}
	
	@Override
	public String toString() {
		String cargo = "Cargo: " + this.getCargo();
		String departamento = "Departamento: " + this.getDepartamento();
		String salario = "Salário: " + this.getSalario();
		List<String> telefonesFuncionario = new ArrayList<String>();
		List<UUID> servicosFuncionario = new ArrayList<UUID>();
		
		for(Telefone telefone: this.getTelefones()) {
			String telefoneCompleto = telefone.getNumeroTelefoneCompleto();
			telefonesFuncionario.add(telefoneCompleto);
		}
		
		for(Servico servico: this.getServicos()) {
			UUID servicoId = servico.getId();
			servicosFuncionario.add(servicoId);
		}
		
		return String.format("%s | %s | %s | %s | Serviços: %s | Telefones: %s", 
				super.toString(), cargo, departamento, salario, telefonesFuncionario, servicosFuncionario);
	}
}
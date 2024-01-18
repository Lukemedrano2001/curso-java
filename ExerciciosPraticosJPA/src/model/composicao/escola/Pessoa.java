package model.composicao.escola;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {
	@Id
	private UUID id;
	private String nome;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;
	
	@Embedded
	private Endereco endereco;
	
	public Pessoa() {}
	
	public Pessoa(String nome, Endereco endereco) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.dataNascimento = new Date();
		this.endereco = endereco;
	}
	
	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		String nome = "Nome: " + this.getNome();
		String dataNascimento = "Data de Nascimento: " + this.getDataNascimento();
		String endereco = "Endereço: " + this.getEndereco().getEnderecoCompleto();
		
		return String.format("%s | %s | %s", nome, dataNascimento, endereco);
	}
}
package model.unidirecional.empresa;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {
	@Id
	private UUID id;
	private String nome;
	private String email;
	private String senha;
	
	@Column(name = "data_nascimento")
	private Date dataNascimento;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(unique = true)
	private Endereco endereco;
	
	public Pessoa() {}
	
	public Pessoa(String nome, String email, String senha) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = new Date();
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null || getClass() != objeto.getClass())
			return false;
		Pessoa pessoa = (Pessoa) objeto;
		return Objects.equals(id, pessoa.id);
	}
	
	@Override
	public String toString() {
		String nome = "Nome: " + this.getNome();
		String email = "E-mail: " + this.getEmail();
		String endereco = "Id do Endereço: " + this.getEndereco().getId();
		
		return String.format("%s | %s | %s", nome, email, endereco);
	}
}
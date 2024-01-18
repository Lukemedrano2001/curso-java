package model.unidirecional.empresa;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefones")
public class Telefone {
	@Id
	private UUID id;
	private int ddd;
	
	@Column(name = "numero_telefone")
	private int numeroTelefone;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
	
	public Telefone() {}

	public Telefone(int ddd, int numeroTelefone) {
		this.id = UUID.randomUUID();
		this.ddd = ddd;
		this.numeroTelefone = numeroTelefone;
	}

	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getDdd() {
		return this.ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumeroTelefone() {
		return this.numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	public String getNumeroTelefoneCompleto() {
		return String.format("(%d) %d", this.getDdd(), this.getNumeroTelefone());
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return this.funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
		Telefone telefone = (Telefone) objeto;
		return Objects.equals(id, telefone.id);
	}
	
	@Override
	public String toString() {
		String numeroCompleto = this.getNumeroTelefoneCompleto();
		
		return String.format("%s", numeroCompleto);
	}
}
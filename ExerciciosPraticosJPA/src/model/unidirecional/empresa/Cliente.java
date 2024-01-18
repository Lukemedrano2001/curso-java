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
@Table(name = "clientes")
public class Cliente extends Pessoa {
	@Column(name = "estado_civil")
	private String estadoCivil;
	
	@Column(name = "tipo_cliente")
	private String tipoCliente;
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Telefone> telefones = new ArrayList<Telefone>();
	
	@ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "clientes_servicos",
        joinColumns = @JoinColumn(name = "cliente_id"),
        inverseJoinColumns = @JoinColumn(name = "servico_id")
    )
	private List<Servico> servicos = new ArrayList<Servico>();
	
	public Cliente() {}
	
	public Cliente(String nome, String email, String senha, String estadoCivil, String tipoCliente) {
		super(nome, email, senha);
		this.estadoCivil = estadoCivil;
		this.tipoCliente = tipoCliente;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTipoCliente() {
		return this.tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public List<Telefone> getTelefones() {
		return this.telefones;
	}

	public void adicionaTelefone(Telefone telefone) {
		if(!this.telefones.contains(telefone)) {
			this.telefones.add(telefone);
			telefone.setCliente(this);
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
			servico.adicionaCliente(this);
		}else {
			return;
		}
	}
	
	@Override
	public String toString() {
		String tipoCliente = "Tipo de Cliente: " + this.getTipoCliente();
		List<String> telefonesCliente = new ArrayList<String>();
		List<UUID> servicosCliente = new ArrayList<UUID>();
		
		for(Telefone telefone: this.getTelefones()) {
			String telefoneCompleto = telefone.getNumeroTelefoneCompleto();
			telefonesCliente.add(telefoneCompleto);
		}
		
		for(Servico servico: this.getServicos()) {
			UUID servicoId = servico.getId();
			servicosCliente.add(servicoId);
		}
		
		return String.format("%s | %s | Serviços: %s | Telefones: %s", 
				super.toString(), tipoCliente, servicosCliente, telefonesCliente);
	}
}



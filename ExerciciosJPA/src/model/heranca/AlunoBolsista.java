package model.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")	// Representa a instância de um aluno bolsista no banco de dados
public class AlunoBolsista extends Aluno {
	private Double bolsa;
	
	public AlunoBolsista() {}

	public AlunoBolsista(Long matricula, String nome, Double bolsa) {
		super(matricula, nome);
		this.bolsa = bolsa;
	}

	public Double getBolsa() {
		return this.bolsa;
	}

	public void setBolsa(Double bolsa) {
		this.bolsa = bolsa;
	}
}

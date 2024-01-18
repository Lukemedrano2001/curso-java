package generics.estruturaChaveValorComGenerics;

import java.util.Objects;

public class Par<CHAVE, VALOR> {
	private CHAVE chave;
	private VALOR valor;
	
	public Par(CHAVE chave, VALOR valor) {
		this.chave = chave;
		this.valor = valor;
	}

	// Setter
	public CHAVE getChave() {
		return this.chave;
	}
	
	// Getter
	public VALOR getValor() {
		return this.valor;
	}

	// Setter
	public void setChave(CHAVE chave) {
		this.chave = chave;
	}
	
	// Setter
	public void setValor(VALOR valor) {
		this.valor = valor;
	}

	// Não pode ter repetição de chave
	// Pode ter repetição de valor
	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	// Um objeto é igual ao outro se as chaves forem iguais
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<?, ?> other = (Par<?, ?>) obj;
		return Objects.equals(chave, other.chave);
	}
}
package generics.comparable;

import java.util.Objects;

// A classe Par é genérica e aceita dois tipos de parâmetros, CHAVE e VALOR
// CHAVE e VALOR são ambos restritos a implementar a interface Comparable, o que significa que as instâncias de Par podem ser comparadas
public class Par<CHAVE extends Comparable<CHAVE>, VALOR extends Comparable<VALOR>> implements Comparable<Par<CHAVE, VALOR>> {
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
	
    // Ele compara duas instâncias de Par com base em suas chaves e valores
    // Se as chaves são iguais, compara os valores
    // Isso é usado para estabelecer a ordem dos elementos em coleções que requerem ordenação
	@Override
	public int compareTo(Par<CHAVE, VALOR> other) {
		if(this.getChave().equals(other.getChave())) {
			return this.getValor().compareTo(other.getValor());
		}else {
			return this.getChave().compareTo(other.getChave());
		}
	}

	// Não pode ter repetição de chave
	// Pode ter repetição de valor
	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	// Um objeto é igual ao outro se as chaves forem iguais
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto)
			return true;
		if (objeto == null)
			return false;
		if (getClass() != objeto.getClass())
			return false;
		Par<?, ?> other = (Par<?, ?>) objeto;
		return Objects.equals(chave, other.chave);
	}
}
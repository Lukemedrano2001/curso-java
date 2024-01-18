package generics.estruturaChaveValorComGenerics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<CHAVE extends Number, VALOR> {
	// LinkedHashSet mantém a ordem de inserção
	private final Set<Par<CHAVE, VALOR>> itens = new LinkedHashSet<Par<CHAVE,VALOR>>();
	
	public void adicionar(CHAVE chave, VALOR valor) {
		if(chave == null) return;	// Sai do método
		
		// Instancia um novoPar
		Par<CHAVE, VALOR> novoPar = new Par<CHAVE, VALOR>(chave, valor);
		
		if(itens.contains(novoPar)) {	// Se os itens contém a chave do novoPar, remova
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);// Atualize o novo valor na chave que foi removida
	}
	
	public VALOR getValor(CHAVE chave) {
		if(chave == null) return null;	// Sai do método
		
		Optional<Par<CHAVE, VALOR>> parOpcional =  itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		// Retorna o valor, se o parOpcional está presente
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
	
	@Override
	public String toString() {
		StringBuilder detalhes = new StringBuilder();
		boolean primeiro = true;
		
		for(Par<CHAVE, VALOR> par: this.itens) {
			if(!primeiro) {
				detalhes.append("\n");
			}
			
			CHAVE chave = par.getChave();
			VALOR valor = par.getValor();
			
			detalhes.append("- Chave: " + chave).append(" | Valor: " + valor);
			primeiro = false;
		}
		
		return detalhes.toString();
	}
}
package generics.comparable;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

// Esta declaração indica que a classe Pares é genérica e aceita dois tipos de parâmetros, CHAVE e VALOR
// CHAVE deve herdar de Number e Comparable
// CHAVE deve implementar a interface Comparable
// VALOR deve herdar de Comparable
public class Pares<CHAVE extends Number & Comparable<CHAVE>, VALOR extends Comparable<VALOR>> {
	// TreeSet vai comparar se uma chave é menor do que a outra, e vai fazer uma ordenação da menor até a maior chave
	private final Set<Par<CHAVE, VALOR>> itens = new TreeSet<Par<CHAVE, VALOR>>();
	
	public void adicionar(CHAVE chave, VALOR valor) {
		if(chave == null) return;	// Sai do método
		
		// Instancia um novoPar
		Par<CHAVE, VALOR> novoPar = new Par<CHAVE, VALOR>(chave, valor);
		
		// Remove o par existente com a mesma chave
	    Par<CHAVE, VALOR> parExistente = null;
	    for (Par<CHAVE, VALOR> par : itens) {
	        if (chave.equals(par.getChave())) {
	            parExistente = par;
	            break;
	        }
	    }

	    if (parExistente != null) {
	        itens.remove(parExistente);
	    }
		
		itens.add(novoPar);	// Atualize o novo valor na chave que foi removida
	}
	
	public VALOR getValor(CHAVE chave) {
		if(chave == null) return null;	// Sai do método
		
		Optional<Par<CHAVE, VALOR>> parOpcional =  itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		
		// Retorna o valor, se o parOpcional está presente
		if(parOpcional.isPresent()) {
			return parOpcional.get().getValor();
		} else {
			return null;
		}
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
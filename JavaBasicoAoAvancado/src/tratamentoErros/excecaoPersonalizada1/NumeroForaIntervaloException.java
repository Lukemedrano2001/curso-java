package tratamentoErros.excecaoPersonalizada1;


@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	// Exceção não checada
	
	private String nomeAtributo;
	
	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.", this.nomeAtributo);
	}
}
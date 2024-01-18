package tratamentoErros.excecaoPersonalizada2;


@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	// Exceção checada
	
	private String nomeAtributo;
	
	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo.", this.nomeAtributo);
	}
}
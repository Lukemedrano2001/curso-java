package tratamentoErros.excecaoPersonalizada2;


@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	// Exceção checada
	
	private String nomeAtributo;
	
	public StringVaziaException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está vazio.", this.nomeAtributo);
	}
}
package tratamentoErros.excecaoPersonalizada1;


@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{
	// Exceção não checada
	
	private String nomeAtributo;
	
	public StringVaziaException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo '%s' está vazio.", this.nomeAtributo);
	}
}
package tratamentoErros;


public class ChechadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			ChechadaVsNaoChecada.geraErro1();
		}catch(RuntimeException excecao) {
			System.out.println(excecao.getMessage());
		}
		
		try {
			ChechadaVsNaoChecada.geraErro2();					
		}catch(Exception excecao) {
			System.out.println(excecao.getMessage());
		}
		
		System.out.println("Fim.");
	}
	
	// Exceção não checada, você trata a exceção se quiser
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro em tempo de execução #01");
	}
	
	// Exceção checada, você precisa tratar essa exceção, coloque o throws Exception na assinatura do método
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02");
	}
}
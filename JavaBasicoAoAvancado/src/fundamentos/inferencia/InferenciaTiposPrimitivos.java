package fundamentos.inferencia;

public class InferenciaTiposPrimitivos {
	public static void main(String[] args) {
		// As variáveis tem tipagem estática
		
		var variavel1 = 1;
		var variavel2 = 2.5;
		var variavel3 = 'A';
		var variavel4 = true;
		var variavel5 = "Texto";
		
		System.out.printf("Variável: %d | Variável: %.2f | Variável: %s | Variável: %b | Variável: %s", variavel1, variavel2, variavel3, variavel4, variavel5);
		
	}
}

package fundamentos.inferencia;

public class InferenciaImplicitaExplicita {
	public static void main(String[] args) {
		// Mesmo que o valor seja do tipo int, o int cabe no double ( Implicita - Java)
		double numero1 = 1;
		System.out.println("Double: " + numero1);
		
		// Vai arredondar o valor ( Explicita - Programador )
		float numero2 = (float) 1.234567888;
		System.out.println("Float: " + numero2);
	}
}
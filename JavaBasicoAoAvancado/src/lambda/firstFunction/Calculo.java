package lambda.firstFunction;

@FunctionalInterface
// Interface Funcional só pode ter 1 método abstrato
public interface Calculo {
	// Método abstrato
	public double executar(double num1, double num2); 
	
	default double subtracao() {
		return 2 - 1;
	}
	
	public static double divisao(double num1, double num2) {
		return num1 / num2;
	}
}
package lambda.firstFunction;

public class CalculoTeste1 {
	public static void main(String[] args) {
		// Método tradicional sem Function Lambda
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(5, 5));
		
		
		calculo = new Multiplica();
		System.out.println(calculo.executar(5, 5));
	}
}

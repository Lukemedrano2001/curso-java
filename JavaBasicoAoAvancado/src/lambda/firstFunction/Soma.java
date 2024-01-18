package lambda.firstFunction;

public class Soma implements Calculo {
	@Override
	public double executar(double num1, double num2) {
		return num1 + num2;
	}
}
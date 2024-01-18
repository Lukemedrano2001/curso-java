package controle.loops;

public class ForEach {
	public static void main(String[] args) {
		double[] numeros = { 1.7, 2, 4, 5.5, 10};
		
		for(double numero: numeros) {
			System.out.println(numero);
		}
	}
}

package poo.sobrecarga;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora();
		
		System.out.println(calculadora1.somar(1, 2));
		System.out.println(calculadora1.somar(3.0, 4.0));
		System.out.println(calculadora1.somar(5, 6, 7));
		System.out.println(calculadora1.somar(8.0, 9.0, 10.0));
	}
}

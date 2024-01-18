package fundamentos.wrapper;

public class Wrappers {
	public static void main(String[] args) {
		// Wrappers são a classe dos tipos primitivos, cada tipo primitivo tem a sua classe
		// Usando wrapper cada variável pode ter usar de metodos, coisa que não é possível usando os tipos primitivos
		
		Byte byte1 = 1;					// byte -> Byte
		Short short1 = 1000;			// short -> Short
		Integer inteiro1 = 10_000;		// int -> Short
		Long long1 = 100_000L;			// long -> Long
		Float float1 = 3.1415f;			// float -> Float
		Double double1 = 3.14159265;	// double -> Double
		Boolean boolean1 = true; 		// boolean -> Boolean
		Character caractere1 = 'A';		// char -> Character
		
		
		System.out.println(byte1 instanceof Byte);
		System.out.println(short1 instanceof Short);
		System.out.println(inteiro1 instanceof Integer);
		System.out.println(long1 instanceof Long);
		System.out.println(float1 instanceof Float);
		System.out.println(double1 instanceof Double);
		System.out.println(boolean1 instanceof Boolean);
		System.out.println(caractere1 instanceof Character);
	}
}
package operadores;

public class OperadorAtribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		// Operadores Binários
		System.out.println("c = " + c);
		
		c += a;
		System.out.println("c + a = " + c);
		
		c -= b;
		System.out.println("c - b = " + c);
		
		c *= a;
		System.out.println("c * a = " + c);
		
		c /= b;
		System.out.println("c / a = " + c);
		
		c %= 2;
		System.out.println("c % 2 = " + c);
		
		// Operadores Unários
		++c;
		System.out.println("c + 1 = " + c);
		
		--c;
		System.out.println("c - 1 = " + c);
	}
}
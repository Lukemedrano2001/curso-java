package fundamentos.string;

import java.util.Scanner;

public class IgualdadeStrings {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String texto1 = new String("2");
		
		System.out.println("2" == texto1);
		System.out.println("2".equals(texto1));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 2:");
		
		String texto2 = scanner.next();
		System.out.println("2" == texto2);
		System.out.println("2".equals(texto2));
		System.out.println("2".equals(texto2.trim()));
		
		
		scanner.close();
	}
}

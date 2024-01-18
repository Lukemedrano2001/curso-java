package controle.loops;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite algo no console ou caso queira parar, digite Sair:");
		
		String valor = "";
		while(!valor.equalsIgnoreCase("sair")) {
			valor = scanner.next().trim();
			System.out.println(valor);
		}
		
		scanner.close();
	}
}

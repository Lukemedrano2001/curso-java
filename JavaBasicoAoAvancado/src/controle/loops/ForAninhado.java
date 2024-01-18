package controle.loops;

public class ForAninhado {
	public static void main(String[] args) {
		// O algoritmo será executado 121 vezes, pois tem dois for aninhados, ou seja, 11^2 = 121
		
		int linha = 0;
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= 10; j++) {
				linha++;
				System.out.printf("i = %d j = %d | Linha: %d \n", i, j, linha);
			}
		}
	}
}

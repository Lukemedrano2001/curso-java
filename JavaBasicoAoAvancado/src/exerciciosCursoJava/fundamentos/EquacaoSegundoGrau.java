package exerciciosCursoJava.fundamentos;

public class EquacaoSegundoGrau {
	public static void main(String[] args) {
		int a = 1;
		int b = 12;
		int c = -13;
		
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta < 0) {
			System.out.printf("Delta negativo: %.2f", delta);
		}else if(delta == 0) {
			double x = -b / (2.0 * a);
			System.out.printf("A raiz da equacao é x = %.2f", x);
		}else {
			double raizDelta = Math.sqrt(delta);
			double x1 = (-b + raizDelta) / (2.0 * a);
			double x2 = (-b - raizDelta) / (2.0 * a);
			
			System.out.printf("Raiz do Delta = %.2f \n", raizDelta);
			System.out.printf("As raízes da equação são: x1 = %.2f e x2 = %.2f", x1, x2);
		}
	}
}
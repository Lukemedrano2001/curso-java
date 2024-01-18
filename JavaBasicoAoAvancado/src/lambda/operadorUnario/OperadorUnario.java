package lambda.operadorUnario;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		// O mesmo tipo de parâmetro que a função recebe, deve ser do mesmo tipo do que você vai retornar
		
		UnaryOperator<Integer> maisDois = num -> num + 2;
		UnaryOperator<Integer> vezesDois = num -> num * 2;
		UnaryOperator<Integer> quadrado = num -> num * num;
		
		// Executa sequencialmente da esquerda para direita
		int resultado1 = maisDois.andThen(vezesDois).andThen(quadrado).apply(2);
		System.out.println(resultado1);
		
		// Executa sequencialmente da direita para esquerda
		int resultado2 = quadrado.compose(vezesDois).compose(maisDois).apply(2);
		System.out.println(resultado2);
	}
}
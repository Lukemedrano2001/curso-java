package streamAPI.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		// Coloque essas funções em uma classe para que elas estejam disponiveis em outras partes do seu sistema
		// Coloque como static, o construtor como private ou interface
		// Use de metodo reference Classe::metodo
		// Use de Classe.metodo
		
		Consumer<String> print = System.out::print;
		List<String> marcas = Arrays.asList("BMW ", "Volkswagen ", "Honda");
		UnaryOperator<String> maiuscula = letra -> letra.toUpperCase();
		UnaryOperator<String> primeiraLetra = letra -> letra.charAt(0) + "";
		UnaryOperator<String> exclamacao = letra -> letra + "!!! ";
		
		marcas.stream()
			.map(maiuscula)
			.map(primeiraLetra)
			.map(exclamacao)
			.forEach(print);
	}
}
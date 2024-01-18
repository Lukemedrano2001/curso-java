package streamAPI.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoStrings {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Bia", "Lia", "Gui", "Lucas", "Ana");
		
		Stream<String> stream = nomes.stream();
		Stream<String> parallelStream = nomes.parallelStream();
		
		// O dado é processado de forma sequencial, um dado por iteração na stream
		// É recomendado quando se tem um pequeno conjunto de dados ou operações básicas
		System.out.println("Usando o Stream");
		stream.forEach(System.out::println);
		
		// Os dados são processados de forma paralela
		// É recomendado quando se tem um grande conjunto de dados e as operações complexas podem ser divididas em operações menores
		// Pode ser que haja uma sobrecarga associada à divisão e combinação de tarefas
		System.out.println("\nUsando o Parallel Stream");
		parallelStream.forEach(System.out::println);
	}
}
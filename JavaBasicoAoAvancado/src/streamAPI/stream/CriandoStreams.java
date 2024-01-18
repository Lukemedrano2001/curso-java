package streamAPI.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {
		Consumer<String> print =  System.out::print;
		
		
		// Primeira Stream
		System.out.println("Primeira Stream:");
		Stream<String> linguagens1 = Stream.of("Java ", "JavaScript ", "Python \n");
		linguagens1.forEach(print);
		
		
		// Segunda Stream
		System.out.println("\nSegunda Stream:");
		String[] linguagens2 = { "Ruby ", "Go ", "C \n"};
		Stream.of(linguagens2).forEach(print);
		
		
		// Terceira Stream
		System.out.println("\nTerceira Stream:");
		Arrays.stream(linguagens2).forEach(print);;
		
		
		// Quarta Stream
		System.out.println("\nQuarta Stream:");
		Arrays.stream(linguagens2, 1, 2).forEach(print);
		
		
		// Quinta Stream
		System.out.println("\nQuinta Stream:");
		List<String> linguagens3 = Arrays.asList("PHP ", "Kotlin ", "Lisp \n");
		linguagens3.stream().forEach(print);
		linguagens3.parallelStream().forEach(print);
	}
}
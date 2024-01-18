package streamAPI.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ImprimindoStrings {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Bia", "Lia", "Gui", "Lucas");
		
		System.out.println("Usando o Iterator");
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
package fundamentos.string;

public class TipoString {
	public static void main(String[] args) {
		// Tipo string tem métodos e possui um valor inicial imutável, você pode mudar o estado dela com atribuição ou com métodos
		
		String texto = "HeLlO WoRlD";
		
		System.out.println(texto.charAt(0));
		System.out.println(texto.startsWith("He"));
		System.out.println(texto.endsWith("lD"));
		System.out.println(texto.toUpperCase());
		System.out.println(texto.toLowerCase());
		System.out.println(texto.length());
		System.out.println(texto.equalsIgnoreCase("hello world"));
	}
}

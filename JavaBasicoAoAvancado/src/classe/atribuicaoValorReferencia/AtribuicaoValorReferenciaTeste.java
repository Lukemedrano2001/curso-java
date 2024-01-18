package classe.atribuicaoValorReferencia;


public class AtribuicaoValorReferenciaTeste {
	public static void main(String[] args) {
		// Atribuição por valor (Os valores de a e b são independentes, ou seja, cada um tem seu endereço de memória próprio)
		int a = 2;
		int b = a;	// Valor
		
		a++;
		b--;
		
		System.out.println("Atribuição por Valor:");
		System.out.printf("a = %d | b = %d \n\n", a, b);
		
		
		// Atribuição por referência (Os dois objetos compartilham do mesmo endereço de memória)
		AtribuicaoValorReferencia objeto1 = new AtribuicaoValorReferencia();
		AtribuicaoValorReferencia objeto2 = objeto1;	// Referência
		AtribuicaoValorReferencia objeto3 = new AtribuicaoValorReferencia();
		
		System.out.println("Atribuição por Referência:");
		System.out.println(objeto1.objetoString());
		System.out.println(objeto2.objetoString());
		System.out.println(objeto3.objetoString());
		
		objeto1.a = 100;
		objeto2.b = 200;
		objeto3.a = 300;
		objeto3.b = 400;
		
		System.out.println(objeto1.objetoString());
		System.out.println(objeto2.objetoString());
		System.out.println(objeto3.objetoString());
	}
}

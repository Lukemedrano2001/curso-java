package fundamentos.tipoPrimitivo;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Limite de cada tipo em java, se ultrapassar o limite, o valor vai voltar pro inicio do range
		// O tamanho para cada tipo varia no número de bytes
		
		// Numeros inteiros
		 byte numero1 = 127;	// 1 byte ( -128 até 127)
		 short numero2 = 32767;	// 2 bytes ( +- 32.767 )
		 int numero3 = 2_147_483_647;	// 4 bytes ( +- 2.147.483.647 )
		 long numero4 = 123456789L;	// 8 bytes	( +- 9.223.372.036.854.775.808 )
		 
		 // Números de ponto flutuante
		 float numero5 = 1.2345678f;	// 4 bytes	( 7 casas decimais )
		 double numero6 = 2.25;	// 8 bytes	( 15 casas decimais )
		 
		 // Booleano
		 boolean valorBooleano = true;	// ( true ou false)
		 
		 // Caractere
		 char caractere = 'V';	// Somente 1 caractere, um conjunto de char forma uma String
		 
		 
		 System.out.printf("Byte: %d | Short: %d | Int: %d | Long: %d \n", numero1, numero2, numero3, numero4);
		 
		 System.out.printf("Float: %.2f | Double: %.2f \n", numero5, numero6);
		 
		 System.out.printf("Boolean: %b \n", valorBooleano);
		 
		 System.out.printf("Char: %c", caractere);
	}
}

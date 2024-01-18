package classe.areaCirculo;

public class AreaCirculoTeste {
	public static void main(String[] args) {
		AreaCirculo circulo1 = new AreaCirculo(2);
		AreaCirculo circulo2 = new AreaCirculo(3);
		
		System.out.println(circulo1.obtemInformacoesCirculo());
		System.out.println(circulo2.obtemInformacoesCirculo());
	}
}
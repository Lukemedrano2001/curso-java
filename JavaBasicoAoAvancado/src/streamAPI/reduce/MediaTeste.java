package streamAPI.reduce;

public class MediaTeste {
	public static void main(String[] args) {
		Media media1 = new Media();
		Media media2 = new Media();
		
		media1.adiciona(8.3);
		media1.adiciona(9.3);
		media1.adiciona(5.5);
		
		media2.adiciona(7.1);
		media2.adiciona(5.3);
		media2.adiciona(9.4);
		
		System.out.println(media1.getValor());
		System.out.println(media2.getValor());
		System.out.println(Media.combinaMedia(media1, media2).getValor());
	}
}
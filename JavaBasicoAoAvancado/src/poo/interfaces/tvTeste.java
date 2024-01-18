package poo.interfaces;

public class tvTeste {
	public static void main(String[] args) {
		TV televisao1 = new TV(false, 0);
		ControleInterface controleRemoto = new Controle(televisao1);
		
		System.out.println(televisao1.toString());
		
		// Ligando a TV e aumentando o volume
		controleRemoto.ligar();
		controleRemoto.aumentaVolume();
		System.out.println(televisao1.toString());

		
		// Diminuindo o volume e desligando a TV
		controleRemoto.diminuiVolume();
		controleRemoto.desligar();
		System.out.println(televisao1.toString());
	}
}

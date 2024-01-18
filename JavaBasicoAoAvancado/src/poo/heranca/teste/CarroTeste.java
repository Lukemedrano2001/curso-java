package poo.heranca.teste;

import poo.heranca.carro.Corsa;
import poo.heranca.carro.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		Corsa corsa1 = new Corsa("Corsa", 50, 200);
		Ferrari ferrari1 = new Ferrari("Ferrari", 50, 300);
		
		System.out.println(corsa1.toString());
		System.out.println(ferrari1.toString());
		
		// Acelerou até a velocidade maxima de cada carro
		for(int i = 0; i < 75; i++) {
			corsa1.acelerar();
			ferrari1.acelerar();
		}
		
		System.out.println("\nAceleração:");
		System.out.println(corsa1.toString());
		System.out.println(ferrari1.toString());
		
		
		// Freou até o ponto do carro ficar parado e não frear mais
		for(int i = 0; i < 75; i++) {
			corsa1.frear();
			ferrari1.frear();
		}
			
		System.out.println("\nDesaceleração:");
		System.out.println(corsa1.toString());
		System.out.println(ferrari1.toString());
	}
}
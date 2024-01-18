package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	void testeAcessos() {
		/* Atributos da Ana: 
		- segredo (private)
		- facoDentroDeCasa (default ou atributo de pacote)
		- formaDeFalar	(protected)
		- todoMundoSabe	(public)
		*/
		
		// System.out.println(mae.segredo);
		// System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todoMundoSabe);		
	}	
}

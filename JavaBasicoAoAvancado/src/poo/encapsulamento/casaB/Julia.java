package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Julia {
	void testeAcessos() {
		Ana sogra = new Ana();
		
		/* Atributos da Ana: 
		- segredo (private)
		- facoDentroDeCasa (default ou atributo de pacote)
		- formaDeFalar	(protected)
		- todoMundoSabe	(public)
		*/
		
		// System.out.println(sogra.segredo);
		// System.out.println(sogra.facoDentroDeCasa);
		// System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todoMundoSabe);		
	}	
}

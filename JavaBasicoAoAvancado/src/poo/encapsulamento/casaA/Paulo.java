package poo.encapsulamento.casaA;

public class Paulo {
	void testeAcesso() {
		Ana esposa = new Ana();
		
		/* Atributos da Ana: 
			- segredo (private)
			- facoDentroDeCasa (default ou atributo de pacote)
			- formaDeFalar	(protected)
			- todoMundoSabe	(public)
		*/
		
		// System.out.println(esposa.segredo);
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todoMundoSabe);		
	}
}

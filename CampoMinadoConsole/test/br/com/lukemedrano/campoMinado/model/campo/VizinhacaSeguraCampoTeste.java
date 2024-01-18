package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VizinhacaSeguraCampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciaCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeAbrirVizinhos1() {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		
		campo22.adicionaVizinho(campo11);
		campo.adicionaVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testeAbrirVizinhos2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		Campo campo22 = new Campo(2, 2);
		
		campo12.minar();
		
		campo22.adicionaVizinho(campo11);
		campo11.adicionaVizinho(campo12);
		campo22.adicionaVizinho(campo12);
		
		campo.adicionaVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
}
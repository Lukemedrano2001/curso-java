package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdicionaVizinhoCampoTeste {
	private Campo campo;
	
	@BeforeEach		// Para cada teste, a função é chamada usando o BeforeEach
	void iniciaCampo() {
		 campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho32 = new Campo(3, 2);
		boolean resultado = campo.adicionaVizinho(vizinho32);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho34 = new Campo(3, 4);
		boolean resultado = campo.adicionaVizinho(vizinho34);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1EmCima() {
		Campo vizinho23 = new Campo(2, 3);
		boolean resultado = campo.adicionaVizinho(vizinho23);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1EmBaixo() {
		Campo vizinho43 = new Campo(4, 3);
		boolean resultado = campo.adicionaVizinho(vizinho43);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2Diagonal() {
		Campo vizinho22 = new Campo(2, 2);
		boolean resultado = campo.adicionaVizinho(vizinho22);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo campo11 = new Campo(1, 1);
		boolean resultado = campo.adicionaVizinho(campo11);
		assertFalse(resultado);
	}
}
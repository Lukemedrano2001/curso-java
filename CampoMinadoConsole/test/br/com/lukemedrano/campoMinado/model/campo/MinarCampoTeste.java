package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MinarCampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciaCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeMinarCampoNaoMinadoNaoAbertoNaoMarcado() {
		campo.minar();
		assertTrue(campo.isMinado());
	}
	
	@Test
	void testeMinarCampoMinadoNaoAbertoNaoMarcado() {
		campo.minar();
		campo.minar();
		assertFalse(campo.isNaoMinado());
	}
	
	@Test
	void testeMinarCampoNaoMinadoNaoMarcadoAberto() {
		campo.abrir();
		campo.minar();
		
		assertTrue(campo.isAberto());
		assertFalse(campo.minar());
	}
	
	@Test
	void testeMinarCampoNaoMinadoNaoAbertoMarcado() {
		campo.alternaMarcacao();
		assertTrue(campo.isMarcado() && campo.isNaoMinado());
	}
	
	@Test
	void testeMinarCampoMinadoMarcadoNaoAberto() {
		campo.minar();
		campo.alternaMarcacao();
		campo.minar();
		assertFalse(campo.isAberto() && campo.isMarcado() && campo.isNaoMinado());
	}
	
	@Test
	void testeMinarCampoAbertoMarcadoNaoMinado() {
		campo.abrir();
		campo.alternaMarcacao();
		campo.minar();
		assertFalse(campo.isAberto() && campo.isMarcado() & campo.isMinado());
	}
}
package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.lukemedrano.campoMinado.controller.ExplosaoException;

public class AbrirCampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciaCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeAbrirCampoNaoMinadoNaoMarcado() {
		campo.abrir();
		assertTrue(campo.isAberto());
	}
	
	@Test
	void testeAbrirCampoNaoMinadoMarcado() {
		campo.alternaMarcacao();
		campo.abrir();
		assertFalse(campo.isMarcado() && campo.isAberto());
	}
	
	@Test
	void testeAbrirCampoMinadoMarcado() {
		campo.minar();
		campo.alternaMarcacao();
		campo.abrir();
		
		assertTrue(campo.isMinado() && campo.isMarcado() && campo.isFechado());
	}
	
	@Test
	void testeAbrirCampoMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> { campo.abrir(); });
	}
}
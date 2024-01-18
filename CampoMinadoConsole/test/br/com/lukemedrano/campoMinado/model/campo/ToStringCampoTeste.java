package br.com.lukemedrano.campoMinado.model.campo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToStringCampoTeste {
	private Campo campo;
	
	@BeforeEach
	void iniciaCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeToStringCampoMarcado() {
		campo.alternaMarcacao();
		
		String retornoEsperado = "x";
		String retorno = campo.toString();
		
		assertEquals(retornoEsperado, retorno);
	}
	
	@Test
	void testeToStringCampoAbertoMinado() {
		campo.abrir();
		campo.minar();
		
		String retornoEsperado = "*";
		String retorno = campo.toString();
		assertEquals(retornoEsperado, retorno);
	}
	
	@Test
	void testeToStringCampoAbertoComVizinhancaHorizontalMinada() {
		List<Campo> vizinhosHorizontal = Arrays.asList(
				new Campo(3, 2),	// Horizontal esquerda
				new Campo(3, 4)		// Horizontal direita
		);
		
		for(Campo vizinho: vizinhosHorizontal) {
			campo.adicionaVizinho(vizinho);
		}
		
		campo.abrir();
		campo.getVizinhos().forEach(vizinho -> vizinho.minar());
		
		String retornoEsperado = "2";	// Numero de campos com minas
		String retorno = campo.toString();
		assertEquals(retornoEsperado, retorno);
	}
	
	@Test
	void testeToStringCampoAbertoComVizinhacaVerticalMinada() {
		List<Campo> vizinhosVertical = Arrays.asList(
				new Campo(2, 3),	// Vertical em cima
				new Campo(4, 3)		// Vertical em baixo
		);
		
		for(Campo vizinho: vizinhosVertical) {
			campo.adicionaVizinho(vizinho);
		}
		
		campo.abrir();
		campo.getVizinhos().forEach(vizinho -> vizinho.minar());
		
		String retornoEsperado = "2";	// Numero de campos com minas
		String retorno = campo.toString();
		assertEquals(retornoEsperado, retorno);
	}
	
	@Test
	void testeToStringCampoAbertoComVizinhacaDiagonalMinada() {
		List<Campo> vizinhosDiagonal = Arrays.asList(
				new Campo(2, 2),	// Diagonal em cima esquerda
				new Campo(2, 4),	// Diagonal em cima direita
				new Campo(4, 2),	// Diagonal em baixo esquerda
				new Campo(4, 4)		// Diagonal em baixo direita
		);
		
		for(Campo vizinho: vizinhosDiagonal) {
			campo.adicionaVizinho(vizinho);
		}
		
		campo.abrir();
		campo.getVizinhos().forEach(vizinho -> vizinho.minar());
		
		String retornoEsperado = "4";	// Numero de campos com minas
		String retorno = campo.toString();
		assertEquals(retornoEsperado, retorno);
	}
	
	@Test
	void testeToStringCampoAbertoComVizinhancaSegura() {
		campo.abrir();
		
		String retornoEsperado = " ";
		String retorno = campo.toString();
		assertEquals(retornoEsperado, retorno);
	}
	
	@Test
	void testeToStringCampoFechado() {
		String retornoEsperado = "?";
		String retorno = campo.toString();
		assertEquals(retornoEsperado, retorno);
	}
}
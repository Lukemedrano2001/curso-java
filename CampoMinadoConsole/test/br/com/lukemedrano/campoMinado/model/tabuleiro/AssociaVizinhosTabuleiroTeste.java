package br.com.lukemedrano.campoMinado.model.tabuleiro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.lukemedrano.campoMinado.model.campo.Campo;

public class AssociaVizinhosTabuleiroTeste {
	private Tabuleiro tabuleiro;

	@BeforeEach
	void iniciaTabuleiro() {
		tabuleiro = new Tabuleiro(5, 5, 5);
	}
	
	@Test
	void testeAssociaVizinhosTabuleiroPadrao1() {
		// Campo (0, 0)
		// Número de vizinhos é 3
		int linha = 0;
        int coluna = 0;

        Campo campo = this.tabuleiro.getCampo(linha, coluna);
        Set<Campo> vizinhosEsperados = this.getVizinhosEsperados(linha, coluna);
        Set<Campo> vizinhosReais = new HashSet<Campo>(campo.getVizinhos());

        assertEquals(vizinhosEsperados.size(), vizinhosReais.size());
        assertTrue(vizinhosReais.containsAll(vizinhosEsperados));
	}
	
	@Test
	void testeAssociaVizinhosTabuleiroPadrao2() {
		// Campo (0, 2)
		// Número de vizinhos é 5
		int linha = 0;
        int coluna = 2;

        Campo campo = this.tabuleiro.getCampo(linha, coluna);
        Set<Campo> vizinhosEsperados = this.getVizinhosEsperados(linha, coluna);
        Set<Campo> vizinhosReais = new HashSet<Campo>(campo.getVizinhos());

        assertEquals(vizinhosEsperados.size(), vizinhosReais.size());
        assertTrue(vizinhosReais.containsAll(vizinhosEsperados));
	}
	
	@Test
	void testeAssociaVizinhosTabuleiroPadrao3() {
		// Campo (1, 2)
		// Número de vizinhos é 8
		int linha = 1;
        int coluna = 2;

        Campo campo = this.tabuleiro.getCampo(linha, coluna);
        Set<Campo> vizinhosEsperados = this.getVizinhosEsperados(linha, coluna);
        Set<Campo> vizinhosReais = new HashSet<Campo>(campo.getVizinhos());

        assertEquals(vizinhosEsperados.size(), vizinhosReais.size());
        assertTrue(vizinhosReais.containsAll(vizinhosEsperados));
	}

	private Set<Campo> getVizinhosEsperados(int linha, int coluna) {
		Set<Campo> vizinhos = new HashSet<Campo>();
        int linhas = this.tabuleiro.getLinhas();
        int colunas = this.tabuleiro.getColunas();

        // Adiciona vizinhos na diagonal, horizontal e vertical
        for (int i = linha - 1; i <= linha + 1; i++) {
            for (int j = coluna - 1; j <= coluna + 1; j++) {
                // Condição para garantir que a posição (i, j) está dentro dos limites do tabuleiro
                // e também para garantir que não é a própria posição (linha, coluna)
                if (i >= 0 && i < linhas && j >= 0 && j < colunas && !(i == linha && j == coluna)) {
                    vizinhos.add(this.tabuleiro.getCampo(i, j));
                }
            }
        }

        return vizinhos;
	}
}
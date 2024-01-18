package br.com.lukemedrano.calculadora.visao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.lukemedrano.calculadora.model.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	private final Color CINZA_ESCURO = new Color(50, 50, 50);
	private final Color CINZA_CLARO = new Color(80, 80, 80);
	private final Color AZUL = new Color(75, 195, 255);
	
	public Teclado() {
		setLayout(new GridLayout(5, 5));
		
		// Linha 1
		this.adicionarBotao("C", CINZA_ESCURO);
        this.adicionarBotao("\u00B2\u221A", CINZA_ESCURO);
        this.adicionarBotao("\u00B3\u221A", CINZA_ESCURO);
        this.adicionarBotao("%", CINZA_ESCURO);
        this.adicionarBotao("/", CINZA_ESCURO);
        
        // Linha 2
        this.adicionarBotao("log 10", CINZA_CLARO);
        this.adicionarBotao("7", CINZA_CLARO);
        this.adicionarBotao("8", CINZA_CLARO);
        this.adicionarBotao("9", CINZA_CLARO);
        this.adicionarBotao("*", CINZA_ESCURO);
        
        // Linha 3
        this.adicionarBotao("x^y", CINZA_CLARO);
        this.adicionarBotao("4", CINZA_CLARO);
        this.adicionarBotao("5", CINZA_CLARO);
        this.adicionarBotao("6", CINZA_CLARO);
        this.adicionarBotao("-", CINZA_ESCURO);
        
        // Linha 4
        this.adicionarBotao("n!", CINZA_CLARO);
        this.adicionarBotao("1", CINZA_CLARO);
        this.adicionarBotao("2", CINZA_CLARO);
        this.adicionarBotao("3", CINZA_CLARO);
        this.adicionarBotao("+", CINZA_ESCURO);
        
        // Linha 5
        this.adicionarBotao("x\u00B2", CINZA_CLARO);
        this.adicionarBotao("±", CINZA_CLARO);
        this.adicionarBotao("0", CINZA_CLARO);
        this.adicionarBotao(",", CINZA_CLARO);
        this.adicionarBotao("=", AZUL);
	}

	 private void adicionarBotao(String texto, Color cor) {
	    Botao botao = new Botao(texto, cor);
	    botao.addActionListener(this);
	    
	    add(botao);
	}
	 
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() instanceof JButton) {
			JButton botao = (JButton) evento.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
}
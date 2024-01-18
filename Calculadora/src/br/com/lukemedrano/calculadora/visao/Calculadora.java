package br.com.lukemedrano.calculadora.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	public Calculadora() {
		this.organizaLayout();

		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(450, 600);
		setLocationRelativeTo(null);
	}
	
	private void organizaLayout() {
		Display display = new Display();
		Teclado teclado = new Teclado();
		
		setLayout(new BorderLayout());
		display.setPreferredSize((new Dimension(230, 125)));
		
		add(display, BorderLayout.NORTH);
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
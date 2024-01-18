package br.com.lukemedrano.calculadora.visao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.lukemedrano.calculadora.model.Memoria;
import br.com.lukemedrano.calculadora.model.MemoriaObserver;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObserver {
    private JLabel label;
    private final Color BRANCO = new Color(255, 255, 255);

    public Display() {
        setLayout(new BorderLayout());
        setBackground(new Color(50, 50, 50));

        label = new JLabel();
        label.setForeground(BRANCO);
        label.setFont(new Font("Arial", Font.BOLD, 30));
        label.setHorizontalAlignment(JLabel.RIGHT);

        add(label, BorderLayout.SOUTH);

        Memoria.getInstancia().registraObservador(this);
    }

    @Override
    public void valorAlterado(String novoValor) {
        String estiloLabel = "<html><div style='text-align: right; margin: 5px 12px;'> %s </div></html>";
        label.setText(String.format(estiloLabel, novoValor));
    }
}

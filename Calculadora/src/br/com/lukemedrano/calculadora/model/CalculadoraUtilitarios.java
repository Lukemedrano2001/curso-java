package br.com.lukemedrano.calculadora.model;

public class CalculadoraUtilitarios {
	private static final CalculadoraUtilitarios instancia = new CalculadoraUtilitarios();
	
	private CalculadoraUtilitarios() {}
	
	public static CalculadoraUtilitarios getInstancia() {
        return instancia;
    }
	
	public void resetarValores(Memoria memoria) {
        memoria.setTextoAtual("");
        memoria.setTextoBuffer("");
        memoria.setSubstituir(false);
        memoria.setUltimaOperacao(null);
    }

    public void inverterSinal(Memoria memoria) {
        String textoAtual = memoria.getTextoAtual();
        if (!textoAtual.isEmpty() && !textoAtual.equals("0")) {
            if (textoAtual.startsWith("-")) {
                memoria.setTextoAtual(textoAtual.substring(1));
            } else {
                memoria.setTextoAtual("-" + textoAtual);
            }
        }
    }

    public void processarNumero(Memoria memoria, String texto) {
        if (memoria.isSubstituir() || memoria.getTextoAtual().equals("0")) {
            memoria.setTextoAtual(texto);
            memoria.setSubstituir(false);
        } else {
            memoria.setTextoAtual(memoria.getTextoAtual() + texto);
        }
    }

    public void adicionarVirgula(Memoria memoria) {
        String textoAtual = memoria.getTextoAtual();

        if (!textoAtual.contains(",")) {
            if (textoAtual.isEmpty() || memoria.isSubstituir()) {
                if (!textoAtual.equals("-Infinity")) {
                    memoria.setTextoAtual(textoAtual + "0" + ",");
                }
            } else {
                memoria.setTextoAtual(textoAtual + ",");
            }
        }
    }

}
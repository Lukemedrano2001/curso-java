package br.com.lukemedrano.calculadora.model;

import java.util.HashMap;
import java.util.Map;

public class ComandosMapper {
	private static final ComandosMapper instancia = new ComandosMapper();
	private static final Map<String, TipoComando> mapeamentoComandosGerais = new HashMap<>();
    private static final Map<String, TipoComando> mapeamentoOperacoes = new HashMap<>();

    public static ComandosMapper getInstancia() {
		return instancia;
	}
    
    static {
        mapeamentoComandosGerais.put("C", TipoComando.ZERAR);
        mapeamentoComandosGerais.put("±", TipoComando.INVERTER_SINAL);
        mapeamentoComandosGerais.put("=", TipoComando.IGUAL);
        mapeamentoComandosGerais.put(",", TipoComando.VIRGULA);

        mapeamentoOperacoes.put("\u00B2\u221A", TipoComando.RAIZ_QUADRADA);
        mapeamentoOperacoes.put("\u00B3\u221A", TipoComando.RAIZ_CUBICA);
        mapeamentoOperacoes.put("%", TipoComando.MODULO);
        mapeamentoOperacoes.put("/", TipoComando.DIVISAO);
        mapeamentoOperacoes.put("log 10", TipoComando.LOG_10);
        mapeamentoOperacoes.put("*", TipoComando.MULTIPLICACAO);
        mapeamentoOperacoes.put("x^y", TipoComando.POTENCIA);
        mapeamentoOperacoes.put("-", TipoComando.SUBTRACAO);
        mapeamentoOperacoes.put("n!", TipoComando.FATORIAL);
        mapeamentoOperacoes.put("+", TipoComando.SOMA);
        mapeamentoOperacoes.put("x\u00B2", TipoComando.QUADRADO);
    }

    public TipoComando obterTipoComandoGeral(String comando) {
        return mapeamentoComandosGerais.get(comando);
    }

    public TipoComando obterOperacaoMatematica(String comando) {
        return mapeamentoOperacoes.get(comando);
    }
}
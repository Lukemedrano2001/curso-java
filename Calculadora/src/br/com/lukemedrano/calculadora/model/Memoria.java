package br.com.lukemedrano.calculadora.model;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
    private static final Memoria instancia = new Memoria();
    private final List<MemoriaObserver> observadores = new ArrayList<MemoriaObserver>();
	private TipoComando ultimaOperacao = null;
    private boolean substituir = false;
    private String textoAtual = "";
    private String textoBuffer = "";

    private Memoria() {}

    public static Memoria getInstancia() {
        return instancia;
    }
    
    public List<MemoriaObserver> getObservadores() {
		return this.observadores;
	}
    
    public TipoComando getUltimaOperacao() {
		return this.ultimaOperacao;
	}

	public void setUltimaOperacao(TipoComando ultimaOperacao) {
		this.ultimaOperacao = ultimaOperacao;
	}
	
	public void registraObservador(MemoriaObserver observador) {
        this.observadores.add(observador);
    }
	public boolean isSubstituir() {
		return substituir;
	}

	public void setSubstituir(boolean substituir) {
		this.substituir = substituir;
	}

	public String getTextoBuffer() {
		return this.textoBuffer;
	}

	public void setTextoBuffer(String textoBuffer) {
		this.textoBuffer = textoBuffer;
	}

	public String getTextoAtual() {
        if (this.textoAtual.isEmpty()) {
            return "0";
        } else {
            return this.textoAtual;
        }
    }

	public void setTextoAtual(String textoAtual) {
		this.textoAtual = textoAtual;
	}
	
    public void processarComando(String texto) {
        TipoComando tipoComando = detectarTipoComando(texto);

        if (tipoComando == null) {
            return;
        }

        if (tipoComando == TipoComando.ZERAR) {
			CalculadoraUtilitarios.getInstancia().resetarValores(instancia);
        } else if (tipoComando == TipoComando.INVERTER_SINAL) {
            CalculadoraUtilitarios.getInstancia().inverterSinal(instancia);
        } else if (tipoComando == TipoComando.NUMERO) {
            CalculadoraUtilitarios.getInstancia().processarNumero(instancia, texto);
        } else if (tipoComando == TipoComando.VIRGULA) {
            CalculadoraUtilitarios.getInstancia().adicionarVirgula(instancia);
        } else {
            this.processarOperacao(texto);
        }

        this.notificarObservadores();
    }
    
    private double obterNumero(String texto) {
        if (texto.isEmpty()) {
            return 0.0;
        } else {
            return Double.parseDouble(texto.replace(",", "."));
        }
    }

    private void processarOperacao(String texto) {
        this.substituir = true;
        this.textoAtual = this.obterResultadoOperacao();
        this.textoBuffer = this.getTextoAtual();
        this.ultimaOperacao = this.detectarTipoComando(texto);
    }

    private void notificarObservadores() {
        this.getObservadores().forEach(observer -> observer.valorAlterado(this.getTextoAtual()));
    }

    private String obterResultadoOperacao() {
        if (this.getUltimaOperacao() == null || this.getUltimaOperacao() == TipoComando.IGUAL) {
            return this.getTextoAtual();
        }

        double numeroBuffer = this.obterNumero(this.getTextoBuffer());
        double numeroAtual = this.obterNumero(this.getTextoAtual());

        double resultado = OperacoesMatematicas.executarOperacao(this.getUltimaOperacao(), numeroBuffer, numeroAtual);

        if (Double.isNaN(resultado) || Double.isInfinite(resultado)) {
            return "-Infinity";
        }

        String texto = Double.toString(resultado).replace(".", ",");
        boolean inteiro = texto.endsWith("," + "0");
        if (inteiro) {
            texto = texto.replace("," + "0", "");
        }

        return texto;
    }

    private TipoComando detectarTipoComando(String texto) {
        TipoComando tipoComandoGeral = ComandosMapper.getInstancia().obterTipoComandoGeral(texto);
        if (tipoComandoGeral != null) {
            return tipoComandoGeral;
        }

        TipoComando operacaoMatematica = ComandosMapper.getInstancia().obterOperacaoMatematica(texto);
        if (operacaoMatematica != null) {
            return operacaoMatematica;
        }

        try {
            Integer.parseInt(texto);
            return TipoComando.NUMERO;
        } catch (NumberFormatException excecao) {
            return null;
        }
    }
}
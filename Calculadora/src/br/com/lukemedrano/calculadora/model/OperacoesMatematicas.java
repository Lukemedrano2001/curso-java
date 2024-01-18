package br.com.lukemedrano.calculadora.model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperacoesMatematicas {
    private static final Map<TipoComando, UnaryOperator<Double>> operacoesUnarias = new HashMap<>();
    private static final Map<TipoComando, BinaryOperator<Double>> operacoesBinarias = new HashMap<>();

    static {
    	operacoesUnarias.put(TipoComando.RAIZ_QUADRADA, OperacoesMatematicas::quadradoRaiz);
        operacoesUnarias.put(TipoComando.RAIZ_CUBICA, OperacoesMatematicas::cuboRaiz);
        operacoesUnarias.put(TipoComando.LOG_10, OperacoesMatematicas::log10);
        operacoesUnarias.put(TipoComando.QUADRADO, OperacoesMatematicas::xAoQuadrado);

        operacoesBinarias.put(TipoComando.SOMA, OperacoesMatematicas::soma);
        operacoesBinarias.put(TipoComando.SUBTRACAO, OperacoesMatematicas::subtracao);
        operacoesBinarias.put(TipoComando.MULTIPLICACAO, OperacoesMatematicas::multiplicacao);
        operacoesBinarias.put(TipoComando.DIVISAO, OperacoesMatematicas::divisao);
        operacoesBinarias.put(TipoComando.POTENCIA, OperacoesMatematicas::potencia);
        operacoesBinarias.put(TipoComando.MODULO, OperacoesMatematicas::modulo);
        operacoesUnarias.put(TipoComando.FATORIAL, OperacoesMatematicas::fatorial);
    }

    public static double executarOperacao(TipoComando tipoComando, double numeroBuffer, double numeroAtual) {
        if (operacoesBinarias.containsKey(tipoComando)) {
            return operacoesBinarias.get(tipoComando).apply(numeroBuffer, numeroAtual);
        } else if (operacoesUnarias.containsKey(tipoComando)) {
            return operacoesUnarias.get(tipoComando).apply(numeroAtual);
        } else {
            throw new UnsupportedOperationException("Operação não suportada: " + tipoComando);
        }
    }

    // Métodos de operações binárias
    private static double soma(double numeroBuffer, double numeroAtual) {
        return numeroBuffer + numeroAtual;
    }

    private static double subtracao(double numeroBuffer, double numeroAtual) {
        return numeroBuffer - numeroAtual;
    }

    private static double multiplicacao(double numeroBuffer, double numeroAtual) {
        return numeroBuffer * numeroAtual;
    }

    private static double divisao(double numeroBuffer, double numeroAtual) {
        if (numeroAtual == 0) {
            return Double.NaN;
        }
        return numeroBuffer / numeroAtual;
    }

    private static double potencia(double numeroBuffer, double numeroAtual) {
        return Math.pow(numeroBuffer, numeroAtual);
    }

    private static double modulo(double numeroBuffer, double numeroAtual) {
        return numeroBuffer % numeroAtual;
    }

    // Métodos de operações unárias
    private static double quadradoRaiz(double numeroAtual) {
        return Math.sqrt(numeroAtual);
    }

    private static double cuboRaiz(double numeroAtual) {
        return Math.cbrt(numeroAtual);
    }

    private static double log10(double numeroAtual) {
        return Math.log10(numeroAtual);
    }

    private static double xAoQuadrado(double numeroAtual) {
        return Math.pow(numeroAtual, 2);
    }
    
    private static double fatorial(double numeroAtual) {
        if (numeroAtual < 0) {
        	return Double.NaN;
        }

        double resultado = 1;
        for (int i = 2; i <= numeroAtual; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
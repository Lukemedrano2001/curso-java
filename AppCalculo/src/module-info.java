module app.calculo {
	// Requires transitive: Módulo que será automaticamente compartilhado com outros módulos que o utilizam
	// Exports to: Exporta para um módulo específico, garante maior encapsulamento
	
	// AppCalculo: Depende de forma transitiva do módulo br.com.lukemedrano.app.logging, mas ele também exporta o br.com.lukemedrano.app.calculo
	// AppFinanceiro: Depende do módulo br.com.lukemedrano.app.calculo
	// AppLogging: Apenas exporta o módulo br.com.lukemedrano.app.logging
	
	// Open module: Permite que seja realizada a introspecção usando a Reflection API, por exemplo, para alterar dados privados de uma classe.
	// Open pacote: Permite que seja realizada a introspecção usando a Reflection API em um módulo fechado; no entanto, o pacote aberto pode ser acessado e modificado.


	requires transitive app.logging;	
	
	requires app.api;
	provides br.com.lukemedrano.app.ICalculadora with br.com.lukemedrano.app.calculo.CalculadoraImpl;
	
	exports br.com.lukemedrano.app.calculo;	
	
	// exports br.com.lukemedrano.app.calculo.interno to app.financeiro;
}
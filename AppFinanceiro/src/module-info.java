module app.financeiro {
	// Agora AppFinanceiro pode usar do módulo de AppCalculo de maneira direta e pode usar de maneira transitiva do módulo AppLogging

	requires app.api;
	uses br.com.lukemedrano.app.ICalculadora;
}
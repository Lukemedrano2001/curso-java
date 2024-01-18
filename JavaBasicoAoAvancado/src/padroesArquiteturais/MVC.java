package padroesArquiteturais;

public class MVC {
	/*
		Model View Controller (MVC):
			Fluxo do MVC em ordem:
				1-) Browser
				2-) Web Service
				3-) Aplicação
				4-) Controller (Rota)
				5-) Model (Se é precisa acessar os dados)
				6-) View
		
			- Model: Responsável por ter as Entidades, Acesso aos Dados, Regras de Negócio e Validação
				1-) Entidades
				2-) SGDBs
				3-) Regras de negócio
				4-) Java, Python, Node.js
				
			
			- View: Responsável por renderizar a página como resposta à requisição
				1-) Frontend (HTML, CSS, JavaScript, React)
			
			- Controller: Responsável por coordenar o fluxo de dados entre o Modelo e a Visão.
				1-) Quando precisa de acesso aos dados, o Controller solicita ao Model.
				2-)Quando quer retornar uma resposta à requisição, o Controller envia para a View.
				3-)As requisições vêm da View, passam pelo Controller, e este as envia para o Model processar, armazenar e obter um retorno, se necessário.
				4-)Pode incluir a implementação de APIs, gerenciamento de rotas e controle do fluxo de dados.
				5-)Implementado em linguagens como Java, Python, Node.js, etc.
	*/
}
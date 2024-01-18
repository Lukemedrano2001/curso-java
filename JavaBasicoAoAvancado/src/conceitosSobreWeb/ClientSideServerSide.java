package conceitosSobreWeb;

public class ClientSideServerSide {
	/*
		Cliente Side:
			- 2 Camadas: O cliente tinha a aplicação Desktop, e o cliente fazia as requisições. Dentro da camada de cliente, tinham as regras de negócios, e com isso a resposta era gerada no cliente. Com isso, o cliente acessava o banco de dados diretamente.
			
			- 3 Camadas: O cliente tinha a aplicação Desktop, e o cliente fazia as requisições. A camada de apresentação recebia as requisições do cliente e as enviava para a camada de negócios (Middleware entre a Camada de Apresentação e o banco de dados). A camada de negócios processava as requisições e retornava a resposta para a camada de apresentação. A camada de apresentação exibia a resposta para o cliente.
		
		
		
		Web Server Side:
			- Códigos no lado do servidor geram conteúdo dinâmico. O servidor não tem esse conteúdo armazenado em arquivo, então ele o gera e o envia para o navegador. Além de gerar conteúdo dinâmico, os dados são acessados, processados e retornados usando o servidor.
			
		
		
		Front-end e Services;
			- O acesso ao servidor é para obter dados. A aplicação também tem as regras de negócio, então você aplica autenticação e autorização, criptografia hash, simétrica e assimétrica. Essas camadas de segurança são necessárias porque o servidor e a aplicação estão na Web
			- Para renderizar esses conteúdos no lado do cliente, você pode usar frameworks e bibliotecas como React, Angular e Vue.
			
			- SPA (Single Page Application): A primeira página é renderizada. A partir dos JavaScripts, toda a parte visual é gerada dinamicamente. O servidor tem Web services que geram dados no formato JSON. Uma vez que os dados são carregados, eles são usados para renderizar a aplicação no cliente. O servidor serve apenas para acessar, processar e retornar dados.
	*/
}

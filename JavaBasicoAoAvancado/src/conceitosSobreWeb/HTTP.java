package conceitosSobreWeb;

public class HTTP {
	/*
		HTTP (Hypertext Transfer Protocol):
			- Possui textos, imagens, vídeos, áudios, stream, jogos, links para outros textos ou sites, CSS, Javascript em um arquivo só
			- Todos esses textos são escritos usando o HTML (Hypertext Markup Language)
			- Stateless: Uma máquina manda uma requisição para um servidor, para ambos essa comunicação está ocorrendo pela primeira vez, por mais que já tivesse feito outras requisições para o mesmo servidor
			- Cliente-Servidor: O protocolo é baseado em requisições e respostas, a requisição é feita usando a URL que contém um conjunto de parâmetros, sejam eles headers, cookies. Essa resposta pode ser um arquivo html, um JSON, vídeo via stream
			TCP/IP: O protocolo opera com base no TCP/IP
			
			
			
			Verbos HTTP:
			    - GET: Os parâmetros vão na URL. Retorna o status 200 caso seja bem-sucedido, 404 se não encontrar e 500 em caso de erro no servidor.
			    - POST: Os parâmetros vão no corpo da requisição. Retorna o status 201 em caso de sucesso, 400 se os parâmetros forem inválidos, e 500 em caso de erro no servidor.
			    - PUT: Os parâmetros vão no corpo da requisição. É utilizado para atualizar recursos existentes no servidor. Retorna 200 se for bem-sucedido, 404 se o recurso não for encontrado e 500 em caso de erro no servidor.
			    - PATCH: Os parâmetros vão no corpo da requisição. Similar ao PUT, mas é utilizado para fazer atualizações parciais em um recurso. Retorna 200 se for bem-sucedido, 404 se o recurso não for encontrado e 500 em caso de erro no servidor.
			    - DELETE: Os parâmetros vão na URL. Utilizado para excluir recursos no servidor. Retorna 200 se for bem-sucedido, 404 se o recurso não for encontrado e 500 em caso de erro no servidor.
			    - OPTIONS: Solicita informações sobre as opções de comunicação disponíveis para o recurso alvo. Pode ser usado para verificar a disponibilidade de certos métodos HTTP.
			    - TRACE: Utilizado para ecoar de volta a requisição recebida, permitindo que o cliente veja o que o servidor recebeu. É mais utilizado para fins de diagnóstico e depuração.
			    - CONNECT: Usado para transformar a conexão de rede em um túnel de transporte, geralmente durante a negociação de conexões seguras (HTTPS).
			    - HEAD: Similar ao GET, mas usado para obter apenas os cabeçalhos da resposta, sem o corpo da mensagem.

				
				
				
		Requisição e Resposta:
			- Requisição: Cliente envia uma requisição usando a URL e os conjuntos de parâmetros, cookies e headers, o Servidor então retorna uma resposta um arquivo HTML, CSS, JS e até JSON, o envio da requisição na URL depende do verbo URL
			- Resposta: O servidor retorna um header, JSON, arquivos, além de retornar um status com base no verbo HTTP utilizado
			
			
			
			Grupos de status HTTP:
				- Informação: 1xx
				- Sucesso: 2xx
				- Redirecionamento: 3xx 
				- Erro no Cliente: 4xx
				- Erro no Servidor: 5xx
	*/
}

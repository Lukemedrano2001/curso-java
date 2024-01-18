package conceitosSobreWeb;

public class WebService {
	/*
		Web Service:
			- Um serviço que a aplicação disponibiliza com base em tecnologias da web, usando de tecnologias baseadas em texto. Usando do protocolo HTTP, os dados são trafegados em um formato textual, por exemplo, JSON ou XML. Os dados sendo tratados no formato textual é muito mais fácil do que no formato binário
			
			- SOAP (Simple Object Acess Protocol): 
				1-) Versão mais antiga e burocrática
				2-) WSDL (Web Service Description Language)
				3-) XML (Extensible Markup Language)
				4-) RPC (Remote Procedure Call)
				
			- REST (Representational State Transfer): 
				1-) Versão mais simples e leve
				2-) Requisições usando os verbos HTTP
				3-) Retorno de status das requisições, com uma mensagem em JSON
				4-) JSON (JavaScript Object Notation)
				5-) RESTful: Se você segue a convenção estabelecida pelo REST, a sua aplicação/serviço é RESTful. Para ser RESTful precisa seguir tais padrões como:
					+ URL: Padrão de URL 
					+ Método: Um método HTTP é associado a uma URL, ele retorna uma descrição
					+ Descrição: Descreve o que cada serviço faz dentro do padrão REST
					
					
					
			- SOA (Service Oriented Architeture):
				1-) Uma arquitetura de Web Service mais antiga
				2-) Vários serviços são instalados em um ESB (Enterprise Service Bus), que é um barramento de serviços, e você pode orquestrar esses serviços usando uma linguagem, para poder utilizar os serviços e para implementar um fluxo de negócios dentro de um ambiente SOA usando do SOAP ou REST
				
			- MicroServiço:
				1-) Separar uma aplicação grande em pequenos módulos autocontidos, cada microsserviço é responsável por uma única função
				2-) Cada microserviço possui seu próprio ciclo de vida completo. Pode ser desenvolvido, testado, implantado e escalado independentemente dos outros.
				3-) A comunicação entre microserviços geralmente ocorre por meio de APIs RESTful ou mensagens assíncronas. Favorece a arquitetura distribuída.
				4-) Microserviços podem ser escalados individualmente para atender a demandas específicas. Maior flexibilidade na gestão da carga.
				5-) Alterações em um microserviço não afetam diretamente outros serviços. Facilita atualizações e manutenção, proporcionando maior agilidade.
				6-) Os microserviços podem ser distribuídos em diferentes ambientes, muitas vezes utilizando contêineres.
	*/
}
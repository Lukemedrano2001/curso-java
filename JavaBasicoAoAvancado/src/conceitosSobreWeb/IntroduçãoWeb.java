package conceitosSobreWeb;

public class IntroduçãoWeb {
	/*
	 	Linha do Tempo da Computação
			- 1936: Máquina de Turing
			- 1950: ENIAC
			- 1960: ARPANET e E-mail
			- 1970: TCP/IP
			- 1980: WWW ou World Wide Web, que funciona em cima do TCP/IP
			- 1990: Internet sendo distribuida pelo mundo
			- 2000: Provedores de Internet, Redes Sociais, Internet em Casa
			- 2010: Aumento no número de dispositivos conectados à Internet, Redes 4G e 5G, Cloud Computing.
		
		
		
		Redes de Computadores:
			- Centralizada: Vários computadores ligados a um nó central, que dá acesso a rede para todos os computadores conectados.
			- Distribuida: Ao invés dos computadores serem conectados em um nó central, existem rotas alternativas de comunicação entre os computadores, caso uma rota não funcione
			- Teia (Web): 
				1-) Rede em malha onde todos os computadores podem se comunicar diretamente, sem um nó central. 
				2-) Flexível e resistente a falhas, onde cada computador conectado pode interagir livremente.
				3-) Associada à Internet e à World Wide Web, permitindo a troca descentralizada de informações.
				4-) Protocolo central: HTTP, usado para transmitir documentos hipermídia, como páginas da web.
				5-) Descentraliza o controle e facilita a expansão da rede com a adição de novos dispositivos e servidores.
		
		
		
		TCP/IP (Transmission Control Protocol/ Internet Protocol): 
			- TCP: Orientado a conexão e confiável
			- IP: Roteamento entre redes, cada dispositivo possui um IP
			
			- Camadas do TCP/IP, a camda superior depende da camada inferior, usa do Design Pattern Layers:
				1-) Aplicação: HTTP, FTP, SMTP, DHCP, Comunicação Processo-a-Processo, Número da Porta, alguns números são universalmente utilizados, 20 para transferência de dados via FTP, 21 para controle de comando via FTP, 22 para login SSH (Secure Shell), 25 para recebimento de emails vias SMTP, 53 para serviços de DNS, 80 para transferência HTTP, 443 para transferências HTTPs via TLS/SSL  
				2-) Transporte: TCP ou UDP, Comunicação Host-a-Host, Confiabilidade e Integridade
				3-) Internet: IP, Conexão entre redes, Transferência de pacotes
				4-) Rede/Física: Ethernet, Wi-fi
		
		
		
		IPv4 e IPv6:
			- IPv4: 
				1-) Utiliza um endereço de 32 bits separado por 4 partes, onde cada parte vai de 0 até 255. Usa da máscara de sub-rede
				2-) IP de classe A: A primeira parte determina a rede. As 3 últimas partes determinam o Host
				3-) IP de classe B: As duas primeiras partes determinam a rede. As duas útlimas partes determinam o Host
				4-) IP de classe C: As três primeiras partes determinam a rede. A última parte determina o Host
				5-) Exemplo: 192.168.100.230
				
			- IPv6: 
				1-) Utiliza endereços de 128 bits.
        		2-) Oferece um espaço de endereçamento muito maior para acomodar o crescimento da Internet.
        		3-) Notação hexadecimal com oito blocos de quatro dígitos, separados por dois pontos.
        		4-) Resolve limitações de endereços do IPv4, evitando a escassez de endereços disponíveis.
        		5-) Inclui recursos como simplificação da tabela de roteamento e suporte integrado para qualidade de serviço (QoS).
        		6-) Exemplo: 2001:0db8:85a3:0000:0000:8a2e:0370:7334
		
		
		
		Porta: 
			- Para que haja comunicação entre computadores que estão na mesma rede, onde cada computador tem seus processos rodando em portas específicas, para que haja comunicação entre ambos, é preciso saber o IP do computador de destino, é preciso saber o processo que é mapeado pela porta
		
		
		
		UDP (User Datagram Protocol):
			- Protocolo de camada de transporte que não estabelece conexão prévia
			- Não garante a entrega ordenada ou confiável dos dados e não possui mecanismos de controle de fluxo
			- Recomendado em situações onde a velocidade é crítica e a perda ocasional de dados é aceitável
			- Por exemplo, transmissões de vídeo ao vivo, chamadas de voz pela Internet e jogos online.
	*/
}
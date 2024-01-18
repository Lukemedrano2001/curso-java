package conceitosSobreWeb;

public class DNS {
	/*
		Servidores DNS (Domain Name Server):
			- Traduz os nomes de domínio em endereço IP, como uma lista telefônica
			- Você pode comprar um domínio no servidor DNS, e lá você configura o nome do domínio e o endereço IP
			- Usa do protocolo UDP na porta 53
			
			- Hierarquia entre servidores DNS: Os servidores DNS são organizados em uma hierarquia. Os servidores DNS de nível superior, chamados de servidores raiz, armazenam informações sobre os servidores DNS de nível inferior. Os servidores DNS de nível inferior, por sua vez, armazenam informações sobre os hosts na Internet.
			
			- Busca Recursiva: O cliente DNS pede ao servidor DNS para resolver o nome do domínio. O servidor DNS, por sua vez, pode fazer uma consulta a outro servidor DNS para resolver o nome do domínio. O processo continua até que o nome do domínio seja resolvido ou até que o servidor DNS chegue ao limite do número de consultas que pode fazer.
			
			- Busca Iterativa: O qual o cliente DNS envia uma consulta ao servidor DNS. O servidor DNS responde com uma lista de servidores DNS que podem resolver o nome do domínio. O cliente DNS, então, consulta esses servidores DNS para resolver o nome do domínio.
			
			DNS Records:
				- A: IPv4
				- AAAA: IPv6
				- MX: Servidor de E-mail
				- NS: Servidor DNS
				- CNAME: Canonical Name (Apelido)
 	*/
}

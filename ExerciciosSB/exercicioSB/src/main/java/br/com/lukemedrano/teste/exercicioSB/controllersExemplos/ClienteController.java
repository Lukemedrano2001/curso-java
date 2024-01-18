package br.com.lukemedrano.teste.exercicioSB.controllersExemplos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.lukemedrano.teste.exercicioSB.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	// Retornando um objeto no formato JSON
	
	// http://localhost:3000/clientes/qualquer
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		Cliente cliente = new Cliente(1, "Fulano", "123.456.789-10");
		return cliente;
	}
	
	// Esse não é o padrão pra enviar parâmetros na URL em uma requisição
	// http://localhost:3000/clientes/123
	@GetMapping(path = "/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		Cliente cliente = new Cliente(id, "Beltrano", "012.345.678-90");
		return cliente;
	}
	
	// Esse é o padrão pra enviar parâmetros na URL em uma requisição
	// http://localhost:3000/clientes?id=123    &nome=Teste
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
		Cliente cliente = new Cliente(id, "Ciclano", "111.222.333-44");
		return cliente;
	}
}
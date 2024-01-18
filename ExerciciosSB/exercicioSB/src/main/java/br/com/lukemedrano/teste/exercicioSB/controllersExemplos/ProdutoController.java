package br.com.lukemedrano.teste.exercicioSB.controllersExemplos;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lukemedrano.teste.exercicioSB.model.entities.Produto;
import br.com.lukemedrano.teste.exercicioSB.model.repositories.IProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	/*
	 	200: OK
	 	201: CREATE
	 	400: BAD REQUEST
		404: NOT FOUND
		500: INTERNAL SERVER ERROR
	*/
	
	/*
		- SRP: Faça com a classe ProdutoController apenas lide com as requisições, deixe a implementação do CRUD para as classes responsáveis por isso.  

	 	- OCP: A classe ProdutoController permite a extensão dos métodos sem modificar a implementação existente

	 	- LSP: Garante que as classes específicas ProdutoCreateController, ProdutoReadController, ProdutoUpdateController, ProdutoDeleteController sigam os contratos definidos para cada operação do CRUD

	 	- ISP: O ProdutoController depende da interface IRespostaEntidade para encapsular respostas HTTP. Além disso, considere fazer com que o ProdutoController dependa de interfaces para cada comando CRUD por exemplo, IReadService, ICreateService, IUpdateService, IDeleteService, permitindo flexibilidade e substituição de implementações.

		- DIP: A classe ProdutoController já depende de uma interface chama IProdutoRepository. Considere adicionar mais interfaces como IReadService, ICreateService, IUpdateService, IDeleteService, IRepostaEntidade 
	*/
	

	@Autowired
	private IProdutoRepository produtoRepository;
	
	private RespostaEntidade respostaEntidade = new RespostaEntidade(null, null, null);
	
	
	//  http://localhost:3000/api/produtos
	@PostMapping
	public RespostaEntidade novoProduto(@Valid Produto produto, BindingResult bindingResult) {
		try {
			if(bindingResult.hasErrors()) {
				return respostaEntidade.statusHttpBadRequest(HttpStatus.BAD_REQUEST, "Parâmetros inválidos", null);
			}
			
			// Criando produto
			produtoRepository.save(produto);
			return respostaEntidade.statusHttpSucesso(HttpStatus.OK, "Registro criado com sucesso", produto);
		} catch(Exception error) {
			return respostaEntidade.statusHttpInternalServerError(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno", null);
		}
	}
	
	
	// http://localhost:3000/api/produtos
	@GetMapping
	public RespostaEntidade obterProdutos(){
		try {
			// Retornando todos os produtos
			Iterable<Produto> produtos = produtoRepository.findAll();
			return respostaEntidade.statusHttpSucesso(HttpStatus.OK, "Produtos obtidos com sucesso", produtos);
		} catch(Exception error) {
			return respostaEntidade.statusHttpInternalServerError(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno", null);
		}
	}
	
	
	// http://localhost:3000/api/produtos/nome/?
	@GetMapping("/nome/{parteNome}")
	public RespostaEntidade obterProdutosPorNome(@PathVariable String parteNome){
		try {
		//  Iterable<Produto> produtos = produtoRepository.searchByNameLike(parteNome);
			Iterable<Produto> produtos = produtoRepository.findByNomeContainingIgnoreCase(parteNome);
			return respostaEntidade.statusHttpSucesso(HttpStatus.OK, "Produtos obtidos com sucesso", produtos);
		} catch(Exception error) {
			return respostaEntidade.statusHttpInternalServerError(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno", null);
		}
	}
	
	
	// http://localhost:3000/api/produtos/pagina/?/?
	@GetMapping("/pagina/{numero}/{limite}")
	public RespostaEntidade obterProdutosPorPagina(@PathVariable int numero, @PathVariable int limite){	
		try {
			if(limite >= 5) {
				limite = 5;
			}
			
			Pageable page = PageRequest.of(numero, limite);
			Iterable<Produto> produtos = produtoRepository.findAll(page);
			return respostaEntidade.statusHttpSucesso(HttpStatus.OK, "Produtos obtidos com sucesso", produtos);
		} catch(Exception error) {
			return respostaEntidade.statusHttpInternalServerError(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno", null);
		}
	}
	
	
	// http://localhost:3000/api/produtos/?
	@GetMapping("/{id}")
	public RespostaEntidade obterProdutoById(@PathVariable int id) {
		try {
			Optional<Produto> produto = produtoRepository.findById(id);
			
			// Produto não encontrado
			if(!produto.isPresent()) {
				return respostaEntidade.statusHttpNotFound(HttpStatus.NOT_FOUND, "Registro não encontrado", null);
			}
			
			return respostaEntidade.statusHttpSucesso(HttpStatus.OK, "Registro encontrado", produto);
		} catch(Exception error) {
			return respostaEntidade.statusHttpInternalServerError(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno", null);
		}
	}
	
	
	// http://localhost:3000/api/produtos/?
	@PutMapping("/{id}")
	public RespostaEntidade alteraProduto(@PathVariable int id, @Valid Produto produto, BindingResult bindingResult) {
		try {
			Optional<Produto> atualizarProduto = produtoRepository.findById(id);
			
			// Produto não encontrado
			if(!atualizarProduto.isPresent()) {
				return respostaEntidade.statusHttpNotFound(HttpStatus.NOT_FOUND, "Registro não encontrado", null);
			}
			
			if(bindingResult.hasErrors()) {
				return respostaEntidade.statusHttpBadRequest(HttpStatus.BAD_REQUEST, "Parâmetros inválidos", null);
			}
			
			// Atualizando produto
			produtoRepository.save(produto);	
			return respostaEntidade.statusHttpSucesso(HttpStatus.OK, "Registro atualizado com sucesso", atualizarProduto);
		} catch(Exception error) {
			return respostaEntidade.statusHttpInternalServerError(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno", null);
		}
	}
	
	
	// http://localhost:3000/api/produtos?id=?
	@DeleteMapping("/{id}")
	public RespostaEntidade removeProdutoById(@PathVariable int id) {
		try {
			Optional<Produto> removerProduto = produtoRepository.findById(id);
			// Produto não encontrado
			if(!removerProduto.isPresent()) {
				return respostaEntidade.statusHttpNotFound(HttpStatus.NOT_FOUND, "Registro não encontrado", null);
			}
			
			// Removendo produto
			produtoRepository.deleteById(id);
			return respostaEntidade.statusHttpSucesso(HttpStatus.OK, "Registro removido com sucesso", removerProduto);
		} catch(Exception error) {
			return respostaEntidade.statusHttpInternalServerError(HttpStatus.INTERNAL_SERVER_ERROR, "Erro interno", null);
		}
	}
}

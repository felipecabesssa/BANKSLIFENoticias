package br.com.bankslife.trocatrocabks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bankslife.trocatrocabks.dto.RequisicaoNovoProduto;
import br.com.bankslife.trocatrocabks.modelo.Produto;
import br.com.bankslife.trocatrocabks.repository.ProdutoRepository;

@Controller
@RequestMapping("produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("formulario")
	public String formulario() {
		return "produto/formulario";
	}

	@PostMapping("novo")
	public String novo(RequisicaoNovoProduto requisicao) {
		
		Produto produto = requisicao.toProduto();
		produtoRepository.save(produto);
		return "produto/formulario";
	}
}

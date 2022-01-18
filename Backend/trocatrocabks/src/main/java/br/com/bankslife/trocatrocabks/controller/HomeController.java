package br.com.bankslife.trocatrocabks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.bankslife.trocatrocabks.dominio.Produto;
import br.com.bankslife.trocatrocabks.repository.ProdutoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private ProdutoRepository repository;

	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Produto> produtos = repository.recuperaTodosOsProdutos();
		model.addAttribute("produtos", produtos);		
		return "home";
	}

}
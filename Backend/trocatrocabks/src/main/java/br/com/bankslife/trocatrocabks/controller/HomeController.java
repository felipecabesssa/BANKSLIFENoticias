package br.com.bankslife.trocatrocabks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.bankslife.trocatrocabks.modelo.Produto;
import br.com.bankslife.trocatrocabks.modelo.StatusProduto;
import br.com.bankslife.trocatrocabks.repository.ProdutoRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	
	@GetMapping
	public String home(Model model) {
		
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("produtos", produtos);		
		return "home";
	}
	
	@GetMapping("/{status}")
	public String poStatus(@PathVariable("status") String status, Model model) {
		List<Produto> produtos = produtoRepository.findByStatus(StatusProduto.valueOf(status.toUpperCase()));
		model.addAttribute("produtos", produtos);		
		return "home";
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}

}

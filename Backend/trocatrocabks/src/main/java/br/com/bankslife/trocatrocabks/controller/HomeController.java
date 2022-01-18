package br.com.bankslife.trocatrocabks.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.bankslife.trocatrocabks.dominio.Produto;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Produto produto = new Produto();
		produto.setNome("Roda Moska Pro Model André Will");
		produto.setDetalhes("https://overstreet.com.br/collections/skates/products/roda-moska-pro-model-andre-will");
		produto.setUrlImagem("https://cdn.shopify.com/s/files/1/0410/5361/8342/products/3d800c91341b4d6bec2636e551ac50e5.jpg?v=1636681164");
		produto.setTrocaOuDoacao("Doação");
		produto.setEstadoConservacao("Novo");
		
		List<Produto> produtos = Arrays.asList(produto);
		model.addAttribute("produtos", produtos);
		
		return "home";
	}

}

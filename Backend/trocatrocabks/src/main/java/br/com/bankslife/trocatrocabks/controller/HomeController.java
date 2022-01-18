package br.com.bankslife.trocatrocabks.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.bankslife.trocatrocabks.dominio.Produto;

@Controller
public class HomeController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Query query = entityManager.createQuery("select p from Produto p", Produto.class);
		List<Produto> produtos = query.getResultList();
		
		model.addAttribute("produtos", produtos);		
		return "home";
	}

}

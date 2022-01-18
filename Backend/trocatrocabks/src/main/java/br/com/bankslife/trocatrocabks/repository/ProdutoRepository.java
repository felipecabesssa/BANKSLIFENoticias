package br.com.bankslife.trocatrocabks.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.bankslife.trocatrocabks.dominio.Produto;

@Repository
public class ProdutoRepository {
	
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Produto> recuperaTodosOsProdutos(){
		
		Query query = entityManager.createQuery("select p from Produto p", Produto.class);
		return query.getResultList();
		
	}

}

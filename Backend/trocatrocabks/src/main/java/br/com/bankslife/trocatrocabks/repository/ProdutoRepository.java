package br.com.bankslife.trocatrocabks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bankslife.trocatrocabks.enums.StatusProduto;
import br.com.bankslife.trocatrocabks.enums.TrocaOuDoacao;
import br.com.bankslife.trocatrocabks.modelo.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	List<Produto> findByStatus(StatusProduto status);

	List<Produto> findByTrocaOuDoacao(TrocaOuDoacao trocaOuDoacao);
		
}


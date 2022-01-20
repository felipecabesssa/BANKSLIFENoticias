package br.com.bankslife.trocatrocabks.dto;

import javax.validation.constraints.NotBlank;

import br.com.bankslife.trocatrocabks.modelo.EstadoConservacao;
import br.com.bankslife.trocatrocabks.modelo.Produto;
import br.com.bankslife.trocatrocabks.modelo.StatusProduto;
import br.com.bankslife.trocatrocabks.modelo.TrocaOuDoacao;

public class RequisicaoNovoProduto {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String urlImagem;
	
	@NotBlank
	private String detalhes;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public Produto toProduto() {
		Produto produto = new Produto();
		produto.setNomeProduto(nomeProduto);
		produto.setDetalhes(detalhes);
		produto.setUrlImagem(urlImagem);
		produto.setStatus(StatusProduto.AGUARDANDO);
		produto.setEstadoConservacao(EstadoConservacao.BOM);
		produto.setTrocaOuDoacao(TrocaOuDoacao.DOACAO);
		return produto;
	}
	
	

}

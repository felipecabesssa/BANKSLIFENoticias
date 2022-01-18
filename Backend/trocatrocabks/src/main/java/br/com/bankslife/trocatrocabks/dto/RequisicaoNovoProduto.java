package br.com.bankslife.trocatrocabks.dto;

import br.com.bankslife.trocatrocabks.modelo.Produto;

public class RequisicaoNovoProduto {
	
	private String nomeProduto;
	private String urlImagem;
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
		return produto;
	}
	
	

}

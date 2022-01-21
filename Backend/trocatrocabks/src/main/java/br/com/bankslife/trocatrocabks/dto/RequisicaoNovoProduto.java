package br.com.bankslife.trocatrocabks.dto;

import javax.validation.constraints.NotBlank;

import br.com.bankslife.trocatrocabks.enums.EstadoConservacao;
import br.com.bankslife.trocatrocabks.enums.StatusProduto;
import br.com.bankslife.trocatrocabks.enums.TrocaOuDoacao;
import br.com.bankslife.trocatrocabks.modelo.Produto;

public class RequisicaoNovoProduto {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String urlImagem;
	
	@NotBlank
	private String detalhes;
	
	private String trocaOuDoacao;
	
	private String estadoConservacao;
	
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
	public String getTrocaOuDoacao() {
		return trocaOuDoacao;
	}
	public void setTrocaOuDoacao(String trocaOuDoacao) {
		this.trocaOuDoacao = trocaOuDoacao;
	}
	public String getEstadoConservacao() {
		return estadoConservacao;
	}
	public void setEstadoConservacao(String estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
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

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
	
	private byte[] imagem;
	
	@NotBlank
	private String detalhes;
	private String trocaOuDoacao;
	
	private String estadoConservacao;
	
	@NotBlank
	private String nomeApelidoDoador;
	@NotBlank
	private String instaDoador;
	
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
	
	public String getNomeApelidoDoador() {
		return nomeApelidoDoador;
	}
	public void setNomeApelidoDoador(String nomeApelidoDoador) {
		this.nomeApelidoDoador = nomeApelidoDoador;
	}
	public String getInstaDoador() {
		return instaDoador;
	}
	public void setInstaDoador(String instaDoador) {
		this.instaDoador = instaDoador;
	}
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
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
		
		produto.setImagem(getImagem());
		
		produto.setEstadoConservacao(EstadoConservacao.valueOf(estadoConservacao));
		produto.setStatus(StatusProduto.AGUARDANDO);
		produto.setTrocaOuDoacao(TrocaOuDoacao.valueOf(trocaOuDoacao));
		produto.setNomeApelidoDoador(nomeApelidoDoador);
		produto.setInstaDoador(instaDoador);
		return produto;
	}

}

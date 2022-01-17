package br.com.bankslife.trocatrocabks.dominio;

public class Produto {
	
	private Integer id;
	private String nome;
	private String detalhes;
	private String trocaOuDoacao;
	private String estadoConservacao;
	private String urlImagem;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	
	

}

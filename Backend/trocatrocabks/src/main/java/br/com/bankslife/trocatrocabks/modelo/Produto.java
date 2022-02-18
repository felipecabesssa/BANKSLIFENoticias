package br.com.bankslife.trocatrocabks.modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import br.com.bankslife.trocatrocabks.enums.EstadoConservacao;
import br.com.bankslife.trocatrocabks.enums.StatusProduto;
import br.com.bankslife.trocatrocabks.enums.TrocaOuDoacao;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeProduto;
	private String detalhes;
	private String urlImagem;
	
	@Lob
	private byte[] imagem;
	
	private String nomeApelidoDoador;
	private String instaDoador;
	
	@Enumerated(EnumType.STRING)
	private EstadoConservacao estadoConservacao;
	
	@Enumerated(EnumType.STRING)
	private TrocaOuDoacao trocaOuDoacao;
	
	@Enumerated(EnumType.STRING)
	private StatusProduto status;

	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public TrocaOuDoacao getTrocaOuDoacao() {
		return trocaOuDoacao;
	}
	public void setTrocaOuDoacao(TrocaOuDoacao trocaOuDoacao) {
		this.trocaOuDoacao = trocaOuDoacao;
	}
	
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StatusProduto getStatus() {
		return status;
	}
	public void setStatus(StatusProduto status) {
		this.status = status;
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
	public EstadoConservacao getEstadoConservacao() {
		return estadoConservacao;
	}
	public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
	public byte[] getImagem() {
		return imagem;
	}
	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
	
}

package br.com.bankslife.trocatrocabks.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeProduto;
	private String detalhes;
	
	@Enumerated(EnumType.STRING)
	private TrocaOuDoacao trocaOuDoacao;
	
	@Enumerated(EnumType.STRING)
	private EstadoConservacao estadoConservacao;
	
	private String urlImagem;
	private LocalDate dataTroca;
	private String localDaTroca;
	private LocalDateTime horarioTroca;
	

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
	public EstadoConservacao getEstadoConservacao() {
		return estadoConservacao;
	}
	public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public LocalDate getDataTroca() {
		return dataTroca;
	}
	public void setDataTroca(LocalDate dataTroca) {
		this.dataTroca = dataTroca;
	}
	public String getLocalDaTroca() {
		return localDaTroca;
	}
	public void setLocalDaTroca(String localDaTroca) {
		this.localDaTroca = localDaTroca;
	}
	public LocalDateTime getHorarioTroca() {
		return horarioTroca;
	}
	public void setHorarioTroca(LocalDateTime horarioTroca) {
		this.horarioTroca = horarioTroca;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	

}

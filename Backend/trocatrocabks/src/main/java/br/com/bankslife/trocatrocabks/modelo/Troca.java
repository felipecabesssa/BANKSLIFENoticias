package br.com.bankslife.trocatrocabks.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Troca {
	
	private LocalDate dataTroca;
	private String localDaTroca;
	private LocalDateTime horarioTroca;
	private String nomeApelidoRecebedor;
	private String instaRecebedor;
	
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
	public String getNomeApelidoDoador() {
		return nomeApelidoRecebedor;
	}
	public void setNomeApelidoDoador(String nomeApelidoDoador) {
		this.nomeApelidoRecebedor = nomeApelidoDoador;
	}
	public String getInstaDoador() {
		return instaRecebedor;
	}
	public void setInstaDoador(String instaDoador) {
		this.instaRecebedor = instaDoador;
	}
	

}

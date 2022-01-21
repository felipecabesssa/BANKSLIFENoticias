package br.com.bankslife.trocatrocabks.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Troca {
	
	private LocalDate dataTroca;
	private String localDaTroca;
	private LocalDateTime horarioTroca;
	private String nomeApelidoDoador;
	private String instaDoador;
	
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
	

}

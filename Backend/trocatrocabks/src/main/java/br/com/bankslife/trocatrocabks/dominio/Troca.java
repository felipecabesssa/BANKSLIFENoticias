package br.com.bankslife.trocatrocabks.dominio;

import java.time.LocalDate;

public class Troca {
	
	private int id;
	private String local;
	private String horario;
	private String status;
	private LocalDate dataDaEntrega;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDataDaEntrega() {
		return dataDaEntrega;
	}
	public void setDataDaEntrega(LocalDate dataDaEntrega) {
		this.dataDaEntrega = dataDaEntrega;
	}

	

}

package br.com.bankslife.trocatrocabks.dominio;

public class Troca {
	
	private int id;
	private String local;
	private String horario;
	private Enum status;
	
	public Troca(int id, String local, String horario) {
		super();
		this.id = id;
		this.local = local;
		this.horario = horario;
	}

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

	public Enum getStatus() {
		return status;
	}

	public void setStatus(Enum status) {
		this.status = status;
	}
	
	

}

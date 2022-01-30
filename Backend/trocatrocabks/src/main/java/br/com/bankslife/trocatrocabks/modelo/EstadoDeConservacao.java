package br.com.bankslife.trocatrocabks.modelo;

public class EstadoDeConservacao {
	private Long id;
	private String estado;
	
	public EstadoDeConservacao(Long id, String estado) {
		this.id = id;
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}

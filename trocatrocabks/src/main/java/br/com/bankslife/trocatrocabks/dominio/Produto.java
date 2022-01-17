package br.com.bankslife.trocatrocabks.dominio;

public class Produto {
	
	private int id;
	private String nome;
	private Enum estadoConservacao;
	
	public Produto(int id, String nome, Enum estadoConservacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.estadoConservacao = estadoConservacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Enum getEstadoConservacao() {
		return estadoConservacao;
	}

	public void setEstadoConservacao(Enum estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
	
	

}

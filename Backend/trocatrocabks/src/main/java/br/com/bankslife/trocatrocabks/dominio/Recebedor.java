package br.com.bankslife.trocatrocabks.dominio;

public class Recebedor {
	
	private int id;
	private String nome;
	private String apelido;
	private String insta;
	private int celular;
	
	public Recebedor(int id, String nome, String apelido, String insta, int celular) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.insta = insta;
		this.celular = celular;
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

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getInsta() {
		return insta;
	}

	public void setInsta(String insta) {
		this.insta = insta;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	
	

}

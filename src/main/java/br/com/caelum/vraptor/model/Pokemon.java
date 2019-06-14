package br.com.caelum.vraptor.model;

public class Pokemon {
	private String nome;
	private String fraqueza;
	private String tipo;
	
	
	public Pokemon(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFraqueza() {
		return fraqueza;
	}


	public void setFraqueza(String fraqueza) {
		this.fraqueza = fraqueza;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}

package br.com.caelum.vraptor.model;

public class Aluno extends Pessoa {

	private String cpf;
	
	public Aluno(String nome, String rg) {
		super.nome = nome;
		super.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}

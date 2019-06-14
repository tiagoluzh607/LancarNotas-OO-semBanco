package br.com.caelum.vraptor.model;

public abstract class Model {
	protected int id;
	protected boolean ativo = true;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * verifica se o usuario esta ativo ou não
	 * @return
	 */
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}

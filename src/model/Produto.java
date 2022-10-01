package model;

public class Produto {
	int codBarras;
	String nome;
	
	public Produto(int codBarras, String nome) {
		this.codBarras = codBarras;
		this.nome = nome;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
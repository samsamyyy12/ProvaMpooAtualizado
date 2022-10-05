package model;

public class Produto {
	int codBarras;
	String nome;
	double preco=0;
	boolean isPromocao=false;
	Estoque estoque= new Estoque(0);
	
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isPromocao() {
		return isPromocao;
	}

	public void setPromocao(boolean isPromocao) {
		this.isPromocao = isPromocao;
	}

	public int getEstoque() {
		return estoque.quantidade;
	}

	public void setEstoque(int i) {
		this.estoque.quantidade=i;
	}
}
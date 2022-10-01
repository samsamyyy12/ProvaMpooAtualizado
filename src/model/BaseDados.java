package model;

import java.util.ArrayList;

public class BaseDados {
	
	static ArrayList<Produto> produtos;
	
	public static void createBase(){
		produtos = new ArrayList<Produto>();
	}
	public static boolean adicionarProduto(Produto produto) throws DuplicatedProductException{
		boolean status=false;
		for (Produto produtoCurrent:produtos)
			if (produtoCurrent.getCodBarras()==produto.getCodBarras()){
				status=true;
				throw new DuplicatedProductException("Produto já cadastrado!");
			}
		if(!status)
			return produtos.add(produto);
		return false;
	}
}
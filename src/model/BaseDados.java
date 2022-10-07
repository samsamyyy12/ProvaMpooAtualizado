package model;

import java.text.MessageFormat;
import java.util.ArrayList;

import view.MensagemErroView;
import view.MensagemView;

public class BaseDados {

	static ArrayList<Produto> produtos;

	public static void createBase(){
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto(001, "Pinga sert�o"));
		produtos.add(new Produto(002, "Feij�o"));
		produtos.add(new Produto(003, "Picanha"));
	}
	public static boolean adicionarProduto(Produto produto) throws DuplicatedProductException{
		boolean status=false;
		for (Produto produtoCurrent:produtos)
			if (produtoCurrent.getCodBarras()==produto.getCodBarras()){
				status=true;
				throw new DuplicatedProductException("Produto j� cadastrado!");
			}
		if(!status)
			return produtos.add(produto);
		new MessageFormat("Cadastro realizado");
		return false;
	}

	public static Produto pesquisarProduto(Integer codBarras) throws ProdutoNaoExisteException {
		boolean status=false;
		for (Produto produtoCurrent:produtos) {
			if (produtoCurrent.getCodBarras()==codBarras) {
				status=true;
				return produtoCurrent;}

		}

		if(!status){
			throw new ProdutoNaoExisteException("Produto n�o existe");

		}
		return null;
	} 


	public static void editarProduto(Produto produto, double precoNovo, boolean isPromocao, int estoque) throws ProdutoNaoExisteException, ProdutoNullException{
		if(pesquisarProduto(produto.getCodBarras()) != null){
			if(isPromocao) {
				produto.setPromocao(isPromocao);
				new MensagemView("Promo��o alterada","Aten��o!");
			}
			if(precoNovo != 0) {
				produto.setPreco(precoNovo);
				new MensagemView("Pre�o alterado","Aten��o!");
			}
			
			if(!isPromocao && precoNovo==0 && estoque==0) {
				new MensagemErroView("Nenhuma altera��o feita");
			}
			
			if(estoque > 0) {
				produto.setEstoque(estoque);
				new MensagemView("Estoque alterado","Aten��o!");
			}
						
		}
		else {
		throw new ProdutoNullException("Este produto n�o existe");}

	}

	public boolean deletarProduto(Produto produto ) throws ProdutoNaoExisteException{
		Produto produtoCurrent = pesquisarProduto(produto.getCodBarras());
		if(produtoCurrent!=null) {
			produtos.remove(produtoCurrent);
			new MensagemView(produto.getNome()+" Deletado", "Aten��o");
			return true;
		}
		return false;
		
	}

	
}
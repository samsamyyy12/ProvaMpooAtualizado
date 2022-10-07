package model;

public class Promocao extends Thread implements PrecoInterface{

	public Promocao() {
	}


	
	@Override
	public boolean darPreco(double valor, String codBarras) {
		return false;

	}


	@Override
	public void run() {
		try {
			sleep(1000);
			executarPromo();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void executarPromo() {
		for(Produto produtoCurrent:BaseDados.produtos){
			if(produtoCurrent.isPromocao) {
				System.out.println(produtoCurrent.getPreco());
				produtoCurrent.setPreco((produtoCurrent.getPreco() - (produtoCurrent.getPreco() * PrecoInterface.desconto)));
				System.out.println(produtoCurrent.getPreco());				
				produtoCurrent.setPromocao(false);
			}
		}
	}
}

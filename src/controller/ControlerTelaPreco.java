package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDados;
import model.Produto;
import model.ProdutoNaoExisteException;
import model.ProdutoNullException;
import view.MensagemView;
import view.TelaEstoque;
import view.TelaPreco;

public class ControlerTelaPreco implements ActionListener {
	TelaPreco Tela;
	public ControlerTelaPreco(TelaPreco T) {
		this.Tela = T;
		Tela.setVisible(true);
		Tela.getPesquisarButton().addActionListener(this);
		Tela.getButtonOk().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==Tela.getPesquisarButton()) {
			try {
				Produto produto = BaseDados.pesquisarProduto(Integer.parseInt(Tela.getTextCodBarras().getText()));
				if(produto != null) { 
					String var  = Tela.getTextCodBarras().getText();
					Tela.achouProduto();
					Tela.getTextCodBarras().setText(var);
					Tela.getTextCodBarras().setEnabled(false);}

				else {
					new MensagemView("Insira um codigo valido", "Atenção");
				}

			}
			catch (NumberFormatException | ProdutoNaoExisteException e2) {
				System.out.println("ops!"+e2);
				new MensagemView("Insira um codigo valido", "Atenção");
			}

		}

		if(e.getSource()==Tela.getButtonOk()) {

			try {
				double preco = Double.parseDouble((Tela.getFieldPreco().getText()));
				if(preco >0) {
					Produto produto;
					produto = BaseDados.pesquisarProduto(Integer.parseInt(Tela.getTextCodBarras().getText()));
					BaseDados.editarProduto(produto, preco, false, 0);
					Tela.setVisible(false);}
				else {
					new MensagemView("Preço deve ser maior que zero ", "ops!");
				}
			} 
			catch (NumberFormatException | ProdutoNaoExisteException | ProdutoNullException e1) {
				new MensagemView("Prencha o campo corretamente ", "ops!");
			}

		}






	}
}


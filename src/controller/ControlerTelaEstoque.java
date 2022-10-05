package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDados;
import model.Produto;
import model.ProdutoNaoExisteException;
import model.ProdutoNullException;
import view.MensagemView;
import view.TelaEstoque;
import view.TelaGenerica;

public class ControlerTelaEstoque implements ActionListener {
	TelaEstoque Tela;
	public ControlerTelaEstoque(TelaEstoque tela) {
		this.Tela = tela;
		Tela.setVisible(true);
		Tela.getPesquisarButton().addActionListener(this);
		Tela.getButtonOk().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==Tela.getPesquisarButton()) {
			if(Tela.getTextCodBarras().getText().length() != 0) {
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

			else {
				new MensagemView("Preencha tudo!", "Atenção");
			}
		}

		if(e.getSource()==Tela.getButtonOk()) {
			if(Tela.getFieldQuantidade().getText().length() != 0) {
				try {
					int estoque = Integer.parseInt(Tela.getFieldQuantidade().getText());
					new MensagemView("EDIÇÃO COMPLETA", "Atenção");	
					Produto produto;
					produto = BaseDados.pesquisarProduto(Integer.parseInt(Tela.getTextCodBarras().getText()));
					System.out.println(produto);
					BaseDados.editarProduto(produto,0, false, estoque);
					Tela.setVisible(false);
				} 
				catch (NumberFormatException | ProdutoNaoExisteException | ProdutoNullException e1) {
					new MensagemView("Prencha o campo corretamente ", "ops!");
				}
			}
			
			else {
				new MensagemView("Preencha tudo!", "Atenção");
			}

		}






	}
}

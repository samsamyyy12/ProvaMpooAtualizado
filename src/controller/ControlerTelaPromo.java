package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDados;
import model.Produto;
import model.ProdutoNaoExisteException;
import model.ProdutoNullException;
import view.MensagemView;
import view.TelaEstoque;
import view.TelaPromocao;

public class ControlerTelaPromo implements ActionListener {
	TelaPromocao Tela;
	public ControlerTelaPromo(TelaPromocao T) {
		Tela = T;
		Tela.setVisible(true);
		Tela.getPesquisarButton().addActionListener(this);
		Tela.getButtonOk().addActionListener(this);
		Tela.getBoxAplicarPromo().addActionListener(this);
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
			new MensagemView("EDIÇÃO COMPLETA", "Atenção");
			Tela.setVisible(false);

		}

		if(e.getSource()==Tela.getBoxAplicarPromo()) {

			Produto produto;
			try {
				produto = BaseDados.pesquisarProduto(Integer.parseInt(Tela.getTextCodBarras().getText()));
				BaseDados.editarProduto(produto,0, true, 0);

			} catch (NumberFormatException | ProdutoNaoExisteException | ProdutoNullException e1) {
				e1.printStackTrace();
			}
		}






	}
}

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import model.Promocao;
import view.TelaCadastro;
import view.TelaEstoque;
import view.TelaMenuPrincipal;
import view.TelaPreco;
import view.TelaPromocao;

public class ControllerTelaMenuPrincipal {

	static TelaMenuPrincipal  tela;
	static TelaCadastro cadastro;
	static TelaEstoque estoque;
	static TelaPreco preco;
	static TelaPromocao promo;

	public ControllerTelaMenuPrincipal(TelaMenuPrincipal m, TelaCadastro c,TelaEstoque t,TelaPreco p, TelaPromocao pm){
		this.tela = m;
		this.cadastro= c;
		this.estoque= t;
		this.preco= p;
		this.promo= pm;
		
		tela.getSairButton().addActionListener(new ButtonHandller());
		tela.getCadastrarButton().addActionListener(new ButtonHandller());
		tela.getEstoqueButton().addActionListener(new ButtonHandller());
		tela.getPrecoButton().addActionListener(new ButtonHandller());
		tela.getPromocaoButton().addActionListener(new ButtonHandller());
		tela.getRodarPromocaoButton().addActionListener(new ButtonHandller());
		
		tela.getSairButton().addKeyListener(new KeyHandler());
		tela.getCadastrarButton().addKeyListener(new KeyHandler());
		tela.getEstoqueButton().addKeyListener(new KeyHandler());
		tela.getPrecoButton().addKeyListener(new KeyHandler());
		tela.getPromocaoButton().addKeyListener(new KeyHandler());
		tela.getRodarPromocaoButton().addKeyListener(new KeyHandler());
		tela.setVisible(true);

	}

	private class ButtonHandller implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(tela.getSairButton())){System.exit(0);}
			
			if(e.getSource().equals(tela.getCadastrarButton())){
				new ControlerTelaCadastro(ControllerTelaMenuPrincipal.cadastro);
			}
			if(e.getSource().equals(tela.getEstoqueButton())){
				new ControlerTelaEstoque(ControllerTelaMenuPrincipal.estoque);
			}
			if(e.getSource().equals(tela.getPrecoButton())){
				new ControlerTelaPreco(ControllerTelaMenuPrincipal.preco);
			}
			if(e.getSource().equals(tela.getPromocaoButton())){
				new ControlerTelaPromo(ControllerTelaMenuPrincipal.promo);
			}
			if(e.getSource().equals(tela.getRodarPromocaoButton())){
			Promocao promo = new Promocao();
			promo.start();}

		}

	}


	public class KeyHandler extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				int option=  JOptionPane.showConfirmDialog(null, "Deseja sair?", "Atenção", JOptionPane.OK_CANCEL_OPTION);
				if(option==0) {
					System.exit(0);
				}
			}
		}
	}

	

}

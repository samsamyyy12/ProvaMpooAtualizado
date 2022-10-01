package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.TelaMenuPrincipal;

public class ButtonHandler implements ActionListener {

	TelaMenuPrincipal tela;

	public ButtonHandler(TelaMenuPrincipal tela) {
		this.tela = tela;
		addListener();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(tela.getSairButton())){System.exit(0);}
		if(e.getSource().equals(tela.getCadastrarButton())){System.out.println("clicou em cadastrar");}
		if(e.getSource().equals(tela.getEstoqueButton())){System.out.println("clicou em estoque");}
		if(e.getSource().equals(tela.getPrecoButton())){System.out.println("clicou em preço");}
		if(e.getSource().equals(tela.getPromocaoButton())){System.out.println("clicou em promoção");}
		if(e.getSource().equals(tela.getRodarPromocaoButton())){System.out.println("rodar promoção");}

	}

	public void addListener() {
		tela.getSairButton().addActionListener(this);
		tela.getCadastrarButton().addActionListener(this);
		tela.getEstoqueButton().addActionListener(this);
		tela.getPrecoButton().addActionListener(this);
		tela.getPromocaoButton().addActionListener(this);
		tela.getRodarPromocaoButton().addActionListener(this);
	}

}

package controller;

import view.TelaMenuPrincipal;

public class ControllerTelaMenuPrincipal {

	static TelaMenuPrincipal  tela = new TelaMenuPrincipal();
	public ControllerTelaMenuPrincipal(){
		new ButtonHandler(tela);
		tela.addKeyListener(new KeyHandler());
		tela.setVisible(true);
		
	}
}

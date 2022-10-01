package app;

import javax.swing.UIManager;

import controller.ControllerTelaMenuPrincipal;
import view.MensagemErroView;
import view.MensagemView;
import view.TelaMenuPrincipal;

public class App {

	public static void main(String[] args) {
		new  ControllerTelaMenuPrincipal();
		//new TelaMenuPrincipal();
		new MensagemView("funcionou", "Titulo");
		new MensagemErroView("funcionou");
	}

}

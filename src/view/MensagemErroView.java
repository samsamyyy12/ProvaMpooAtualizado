package view;

import javax.swing.JOptionPane;

public class MensagemErroView extends JOptionPane {
	
	public  MensagemErroView(String string) {
		showMessageDialog(null, string, "Erro", ERROR_MESSAGE);
	}
}

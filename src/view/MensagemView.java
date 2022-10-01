package view;

import javax.swing.JOptionPane;

public class MensagemView extends JOptionPane {
	
	public  MensagemView(String stringMensagem, String stringTitulo) {
		showMessageDialog(null, stringMensagem,stringTitulo,JOptionPane.OK_OPTION);
	}
}

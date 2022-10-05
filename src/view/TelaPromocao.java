package view;

import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaPromocao extends TelaGenerica{

	private JButton buttonOk = new JButton("ok");
	private JCheckBox boxAplicarPromo = new JCheckBox("Aplicar Promoção");

	public TelaPromocao() {
		super("Promoção");
	}
	
	public void achouProduto() {
		super.getPesquisarButton().setVisible(false);
		add(boxAplicarPromo);
		add(buttonOk);
		
	}


	public JButton getButtonOk() {
		return buttonOk;
	}

	public void setButtonOk(JButton buttonOk) {
		this.buttonOk = buttonOk;
	}

	public JCheckBox getBoxAplicarPromo() {
		return boxAplicarPromo;
	}

	public void setBoxAplicarPromo(JCheckBox boxAplicarPromo) {
		this.boxAplicarPromo = boxAplicarPromo;
	}

}

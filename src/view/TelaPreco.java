package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaPreco extends TelaGenerica {

	private JLabel labelPreco;
	private JButton buttonOk=new JButton("Ok");
	private JTextField fieldPreco;


	public TelaPreco() {
		super("Preco");
	}
	
	public void achouProduto() {
		super.getPesquisarButton().setVisible(false);
		labelPreco = new JLabel("Preco: ");
		fieldPreco = new JTextField(10);
		super.somenteNumeros(fieldPreco);
		add(labelPreco);
		add(fieldPreco);
		add(buttonOk);
		
	}

	public JLabel getLabelPreco() {
		return labelPreco;
	}

	public void setLabelPreco(JLabel labelPreco) {
		this.labelPreco = labelPreco;
	}

	public JButton getButtonOk() {
		return buttonOk;
	}

	public void setButtonOk(JButton buttonOk) {
		this.buttonOk = buttonOk;
	}

	public JTextField getFieldPreco() {
		return fieldPreco;
	}

	public void setFieldPreco(JTextField fieldPreco) {
		this.fieldPreco = fieldPreco;
	}

}

package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaEstoque extends TelaGenerica{
	JLabel labelQuantidade;
	JTextField fieldQuantidade;
	JButton buttonOk = new JButton("Ok");
	
	public TelaEstoque() {
		super("Estoque");
	}
	
	public void achouProduto() {
		super.getPesquisarButton().setVisible(false);
		labelQuantidade = new JLabel("Quantidade: ");
		fieldQuantidade = new JTextField(10);
		super.somenteNumeros(fieldQuantidade);
		add(labelQuantidade);
		add(fieldQuantidade);
		add(buttonOk);
		
	}

	public JLabel getLabelQuantidade() {
		return labelQuantidade;
	}

	public void setLabelQuantidade(JLabel labelQuantidade) {
		this.labelQuantidade = labelQuantidade;
	}

	public JTextField getFieldQuantidade() {
		return fieldQuantidade;
	}

	public void setFieldQuantidade(JTextField fieldQuantidade) {
		this.fieldQuantidade = fieldQuantidade;
	}

	public JButton getButtonOk() {
		return buttonOk;
	}

	public void setButtonOk(JButton buttonOk) {
		this.buttonOk = buttonOk;
	}
	
}

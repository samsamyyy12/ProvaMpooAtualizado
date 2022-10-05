package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.text.MaskFormatter;

import model.FormatoNumero;

public class TelaCadastro extends JFrame{
	JLabel labelNome,labelCodBarras,labelValidade,labelPerecivel,LabelQuantidade;
	JCheckBox comboPerecivel, comboNaoPerecivel;
	JButton ButtonOk;
	JTextField fieldNome,fieldCodBarras,fieldQuantidade;
	JTextField  fieldValidade;
	private ButtonGroup bg;
	
	public TelaCadastro(){
		super("Cadastro");
		iniciar();
		somenteNumeros();
		try {
			lookAndFeel();
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMinimumSize(new Dimension(50, 150));
		setLayout(new FlowLayout());
		pack();
	}
	
	public void iniciar(){
		
		labelNome = new JLabel("Nome");
		fieldNome = new JTextField(10);
		add(labelNome);
		add(fieldNome);
		
		labelCodBarras = new JLabel("Codigo de barras");
		fieldCodBarras = new JTextField(10);
		add(labelCodBarras);
		add(fieldCodBarras);
		
		LabelQuantidade = new JLabel("Quantidade");
		fieldQuantidade = new JTextField(10);
		add(LabelQuantidade);
		add(fieldQuantidade);
		
		labelValidade = new JLabel("validade");
		fieldValidade = new JTextField(10);
		add(labelValidade);
		add(fieldValidade);
		
		labelPerecivel = new JLabel("Perecivel");
		comboNaoPerecivel = new JCheckBox("Não");
		comboPerecivel = new JCheckBox("sim");
		bg= new ButtonGroup();
		bg.add(comboNaoPerecivel);
		bg.add(comboPerecivel);
		add(labelPerecivel);
		add(comboPerecivel);
		add(comboNaoPerecivel);
		
		JLabel label = new JLabel("Todos os campos são necessarios");
		label.setFont(new Font("Arial", Font.ITALIC,14));
		add(label);
		
		ButtonOk = new JButton("ok");
		add(ButtonOk);
		
	}
	
	public void somenteNumeros() {
		fieldCodBarras.setDocument(new FormatoNumero());
		fieldQuantidade.setDocument(new FormatoNumero());
		fieldValidade.setDocument(new FormatoNumero());
	}

	public JLabel getLabelNome() {
		return labelNome;
	}

	public void setLabelNome(JLabel labelNome) {
		this.labelNome = labelNome;
	}

	public JLabel getLabelCodBarras() {
		return labelCodBarras;
	}

	public void setLabelCodBarras(JLabel labelCodBarras) {
		this.labelCodBarras = labelCodBarras;
	}

	public JLabel getLabelValidade() {
		return labelValidade;
	}

	public void setLabelValidade(JLabel labelValidade) {
		this.labelValidade = labelValidade;
	}

	public JLabel getLabelPerecivel() {
		return labelPerecivel;
	}

	public void setLabelPerecivel(JLabel labelPerecivel) {
		this.labelPerecivel = labelPerecivel;
	}

	public JLabel getLabelQuantidade() {
		return LabelQuantidade;
	}

	public void setLabelQuantidade(JLabel labelQuantidade) {
		LabelQuantidade = labelQuantidade;
	}

	public JCheckBox getComboPerecivel() {
		return comboPerecivel;
	}

	public void setComboPerecivel(JCheckBox comboPerecivel) {
		this.comboPerecivel = comboPerecivel;
	}

	public JCheckBox getComboNaoPerecivel() {
		return comboNaoPerecivel;
	}

	public void setComboNaoPerecivel(JCheckBox comboNaoPerecivel) {
		this.comboNaoPerecivel = comboNaoPerecivel;
	}

	public JButton getButtonOk() {
		return ButtonOk;
	}

	public void setButtonOk(JButton buttonOk) {
		ButtonOk = buttonOk;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JTextField getFieldCodBarras() {
		return fieldCodBarras;
	}

	public void setFieldCodBarras(JTextField fieldCodBarras) {
		this.fieldCodBarras = fieldCodBarras;
	}

	public JTextField getFieldQuantidade() {
		return fieldQuantidade;
	}

	public void setFieldQuantidade(JTextField fieldQuantidade) {
		this.fieldQuantidade = fieldQuantidade;
	}

	public JTextField getFieldValidade() {
		return fieldValidade;
	}

	public void setFieldValidade(JTextField fieldValidade) {
		this.fieldValidade = fieldValidade;
	}
	
	public void lookAndFeel() throws Exception{
		
		try {
			for(LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
				if("Nimbus".equals(info.getName())){
					UIManager.setLookAndFeel(info.getClassName());
				}			
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("ops!"+e);
			
		}
		
		catch (IllegalAccessException e) {
			System.err.println("ops!"+e);
		}
		
		catch (UnsupportedLookAndFeelException e) {
			System.err.println("ops!"+e);
		}
		
		catch (InstantiationException e) {
			System.err.println("ops!"+e);
		}
	
	}
}

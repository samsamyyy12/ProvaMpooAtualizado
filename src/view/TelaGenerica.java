package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Formattable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import model.FormatoNumero;

public class TelaGenerica extends JFrame  {
	JLabel labelCodBarras;
	JTextField textCodBarras;
	JButton pesquisarButton;
	public TelaGenerica(String str) {
		super(str);
		try {
			lookAndFeel();
		} catch (Exception e) {
			e.printStackTrace();
		}
		labelCodBarras = new JLabel("Codigo de barras");
		textCodBarras = new JTextField(10);
		pesquisarButton = new JButton("Pesquisar");
		add(labelCodBarras);
		add(textCodBarras);
		add(pesquisarButton);
		somenteNumeros(textCodBarras);

		setMinimumSize(new Dimension(280,150));
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		setVisible(false);
	}

	public void somenteNumeros(JTextField field) {
		field.setDocument(new FormatoNumero());
		textCodBarras.setDocument(new FormatoNumero());
	}
	public JLabel getLabelCodBarras() {
		return labelCodBarras;
	}
	public void setLabelCodBarras(JLabel labelCodBarras) {
		this.labelCodBarras = labelCodBarras;
	}
	public JTextField getTextCodBarras() {
		return textCodBarras;
	}
	public void setTextCodBarras(JTextField textCodBarras) {
		this.textCodBarras = textCodBarras;
	}
	public JButton getPesquisarButton() {
		return pesquisarButton;
	}
	public void setPesquisarButton(JButton pesquisarButton) {
		this.pesquisarButton = pesquisarButton;
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
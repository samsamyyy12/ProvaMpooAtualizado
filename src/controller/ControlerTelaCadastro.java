package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import view.MensagemErroView;
import view.MensagemView;
import view.TelaCadastro;

public class ControlerTelaCadastro implements ActionListener{
	TelaCadastro tela;

	public ControlerTelaCadastro(TelaCadastro tela) {
		this.tela= tela;
		tela.getButtonOk().addActionListener(this);
		tela.getComboNaoPerecivel().addActionListener(this);
		tela.getComboPerecivel().addActionListener(this);	
		tela.getFieldCodBarras().addCaretListener(new CaretHandler());
		tela.getFieldNome().addCaretListener(new CaretHandler());
		tela.getFieldQuantidade().addCaretListener(new CaretHandler());
		tela.getFieldValidade().addCaretListener(new CaretHandler());
		tela.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== tela.getButtonOk()) {

			if(tela.getFieldCodBarras().getText().equalsIgnoreCase("")||tela.getFieldNome().getText().equalsIgnoreCase("") || 
					tela.getFieldQuantidade().getText().equalsIgnoreCase("")|| tela.getFieldValidade().getText().equalsIgnoreCase("")
					) {
				new MensagemView("Preencha tudo","Atenção");
			}
			else {
				new MensagemView("entrou", "atenção");
			}
		}

		if(e.getSource()== tela.getComboPerecivel()) {
			System.out.println("ok");
		}

		if(e.getSource()== tela.getComboNaoPerecivel()) {
			System.out.println("ok");
		}

	}



	public class CaretHandler implements CaretListener{
		@Override
		public void caretUpdate(CaretEvent e) {

		}



	}


}

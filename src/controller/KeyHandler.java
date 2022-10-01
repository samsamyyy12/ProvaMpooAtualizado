package controller;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
public class KeyHandler extends KeyAdapter {

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			 int option=  JOptionPane.showConfirmDialog(null, "Deseja sair?", "Atenção", JOptionPane.OK_CANCEL_OPTION);
			 if(option==0) {
				 System.exit(0);
			 }
		}
	}
}

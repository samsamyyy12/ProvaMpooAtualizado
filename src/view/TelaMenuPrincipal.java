package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaMenuPrincipal extends JFrame {
	JButton cadastrarButton, estoqueButton, precoButton, promocaoButton, rodarPromocaoButton, sairButton;
	JLabel labellogo;
	public TelaMenuPrincipal(){
		super("Sistema Budega");
		iniciar();
		try {
			lookAndFeel();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setSize(new Dimension(820,200));
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		
	}

	public void iniciar() {
		
		cadastrarButton= new JButton("Cadastrar");
		estoqueButton= new JButton("Definir Estoque");
		precoButton = new JButton("Definir Preco ");
		promocaoButton = new JButton("Definir Promoção");
		rodarPromocaoButton = new JButton("Rodar promoção");
		sairButton = new JButton("Sair");
		
		try {
			BufferedImage img = ImageIO.read(new File("logoBudega.png"));
			ImageIcon icone = new ImageIcon(img);
			labellogo = new JLabel(icone);
			} 
		catch (IOException e) {e.printStackTrace();}
		
		
		add(labellogo);
		add(cadastrarButton);
		add(estoqueButton);
		add(precoButton);
		add(promocaoButton);
		add(rodarPromocaoButton);
		add(sairButton);
		
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

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getEstoqueButton() {
		return estoqueButton;
	}

	public JButton getPrecoButton() {
		return precoButton;
	}

	public JButton getPromocaoButton() {
		return promocaoButton;
	}

	public JButton getRodarPromocaoButton() {
		return rodarPromocaoButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public JLabel getLabellogo() {
		return labellogo;
	}
	
	
	
	
}

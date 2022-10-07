package app;

import javax.swing.UIManager;

import controller.ControlerTelaCadastro;
import controller.ControlerTelaEstoque;
import controller.ControlerTelaPreco;
import controller.ControlerTelaPromo;
import controller.ControllerTelaMenuPrincipal;
import model.BaseDados;
import model.DuplicatedProductException;
import model.Produto;
import model.ProdutoNaoExisteException;
import model.ProdutoNullException;
import model.Promocao;
import view.MensagemErroView;
import view.MensagemView;
import view.TelaCadastro;
import view.TelaEstoque;
import view.TelaGenerica;
import view.TelaMenuPrincipal;
import view.TelaPreco;
import view.TelaPromocao;

public class App {

	public static void main(String[] args) {
		BaseDados.createBase();

		Produto produto = new Produto(0,"algo");
		try {
			BaseDados.adicionarProduto(produto);
		} catch (DuplicatedProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new  ControllerTelaMenuPrincipal(new TelaMenuPrincipal(), new TelaCadastro(), new TelaEstoque(), new TelaPreco(), new TelaPromocao());
		//new TelaCadastro();
		//new ControlerTelaCadastro();
	}
}

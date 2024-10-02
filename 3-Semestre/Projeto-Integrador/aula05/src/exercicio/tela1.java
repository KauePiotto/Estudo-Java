package exercicio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class tela1 extends JFrame {

	public tela1() {
		// Titulo da janela
		setTitle("Cadastro");
		// Tamanho da janela
		setSize(700, 600);
		// Anula o layout padrao
		getContentPane().setLayout(null);
		// Cor de fundo da janela no padrao RGB (Red Green Blue)
		getContentPane().setBackground(new Color(188, 188, 188));
		//Comando para centralizar a janela
		Centralizar();
		// Exibindo Janela
		setVisible(true);
		// Provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void Centralizar() {
		// Obtém a alturar e largura da resolusão vídeo
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

		// Obtém a altura e largura da minha janela
		Dimension janela = getSize();

		if (janela.height > screen.height) {
			setSize(janela.width, screen.height);
		}
		if (janela.width > screen.height) {
			setSize(screen.width, janela.height);
		}

		setLocation((screen.width - janela.width) / 2, (screen.height - janela.width) / 2);
	}
	
	public static void main(String[] args) {
		new tela1();
	}
}
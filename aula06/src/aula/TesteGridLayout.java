package aula;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TesteGridLayout extends JFrame {
	public TesteGridLayout() {
		setTitle("Teste GridLayout");
		setSize(200, 150);
		getContentPane().setBackground(new Color(180, 189, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(null);

		GridLayout gl = new GridLayout(3, 2, 0, 0);
		getContentPane().setLayout(gl);

		JButton b1 = criarBotao("Linha 1 - Coluna 1");
		JButton b2 = criarBotao("Linha 2 - Coluna 2");
		JButton b3 = criarBotao("Linha 3 - Coluna 1");
		JButton b4 = criarBotao("Linha 4 - Coluna 2");
		JButton b5 = criarBotao("Linha 5 - Coluna 1");

		setVisible(true);
	}

	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		add(botao);
		return botao;
	}
	
	public static void main(String[] args) {
		new TesteGridLayout();
	}
}
